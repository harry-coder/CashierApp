package com.fedco.mbc.utils;

/**
 * Created by soubhagyarm on 28-05-2016.
 */

import android.util.Log;

import com.fedco.mbc.activity.GSBilling;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpFileUpload implements Runnable {
    URL connectURL;
    String responseString;
    String Title;
    String Description;
    byte[] dataToServer;
    FileInputStream fileInputStream = null;
    HttpURLConnection conn;
    String JSONRESPONSE;
    public HttpFileUpload(String urlString, String vTitle, String vDesc) {
        try {
            connectURL = new URL(urlString);
            Title = vTitle;
            Description = vDesc;
        } catch (Exception ex) {
            Log.i("HttpFileUpload", "URL Malformatted");
        }
    }

    public String responseReturn(){
        return GSBilling.getInstance().JsonRes;
        //return JSONRESPONSE;
    }
    public int Send_Now(FileInputStream fStream) throws IOException {
        fileInputStream = fStream;
        return Sending();

    }

    public int Sending() throws IOException {
        String iFileName = GSBilling.getInstance().getFinalZipName() + ".zip";
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";
        String Tag = "fSnd";
        try {
            Log.e(Tag, "Starting Http File Sending to URL");

            // Open a HTTP connection to the URL
            conn = (HttpURLConnection) connectURL.openConnection();

            // Allow Inputs
            conn.setDoInput(true);

            // Allow Outputs
            conn.setDoOutput(true);

            // Don't use a cached copy.
            conn.setUseCaches(false);

            // Use a post method.
            conn.setRequestMethod("POST");

            conn.setRequestProperty("Connection", "Keep-Alive");

            conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);

            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());

            dos.writeBytes(twoHyphens + boundary + lineEnd);
            dos.writeBytes("Content-Disposition: form-data; name=\"title\"" + lineEnd);
            dos.writeBytes(lineEnd);
            dos.writeBytes(Title);
            dos.writeBytes(lineEnd);
            dos.writeBytes(twoHyphens + boundary + lineEnd);

            dos.writeBytes("Content-Disposition: form-data; name=\"description\"" + lineEnd);
            dos.writeBytes(lineEnd);
            dos.writeBytes(Description);
            dos.writeBytes(lineEnd);
            dos.writeBytes(twoHyphens + boundary + lineEnd);

            dos.writeBytes("Content-Disposition: form-data; name=\"uploadedfile\";filename=\"" + iFileName + "\"" + lineEnd);
            dos.writeBytes(lineEnd);

            Log.e(Tag, "Headers are written");

            // create a buffer of maximum size
            int bytesAvailable = fileInputStream.available();

            int maxBufferSize = 5120;
            int bufferSize = Math.min(bytesAvailable, maxBufferSize);
            byte[] buffer = new byte[bufferSize];

            // read file and write it into form...
            int bytesRead = fileInputStream.read(buffer, 0, bufferSize);

            while (bytesRead > 0) {
                dos.write(buffer, 0, bufferSize);
                bytesAvailable = fileInputStream.available();
                bufferSize = Math.min(bytesAvailable, maxBufferSize);
                bytesRead = fileInputStream.read(buffer, 0, bufferSize);
            }
            dos.writeBytes(lineEnd);
            dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);

            // close streams
            fileInputStream.close();

            dos.flush();

            Log.e(Tag, "File Sent, Response: " + String.valueOf(conn.getResponseCode()));

//            HttpEntity httpEntity = httpResponse.getEntity();
//
//            // Read content & Logok
//            inputStream = httpEntity.getContent();
            InputStream is = conn.getInputStream();

            // retrieve the response from server
            int ch;

            StringBuffer b =new StringBuffer();
            while( ( ch = is.read() ) != -1 ){ b.append( (char)ch ); }
            String JSONRESPONSE=b.toString();
            Log.i("Response",JSONRESPONSE);
            dos.close();
            GSBilling.getInstance().JsonRes = JSONRESPONSE;
            //return JSONRESPONSE;
        } catch (MalformedURLException ex) {
            Log.e(Tag, "URL error: " + ex.getMessage(), ex);
            return 0;
        } catch (IOException ioe) {
            Log.e(Tag, "IO error: " + ioe.getMessage(), ioe);
            return 0;
        }
        Log.d(Tag, "RESPONSE error: " + conn.getResponseMessage() );

        return conn.getResponseCode();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
    }
}