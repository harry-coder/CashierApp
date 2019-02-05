package com.fedco.mbc.felhr.constant;

import com.fedco.mbc.felhr.droidterm.TerminalFragment;

/**
 * Created by ABHI on 17-02-2017.
 */

public class Command {
    public static String RESPONSE = "";
//    public static  byte[] BUFFER = new byte[1024];

    public static class Eloyeed {
        public static final byte[] ENERGY_VALUE = new byte[]{0x01, 0x54, 0x33, 0x02, 0x00, 0x00, 0x28, 0x39, 0x39, 0x39, 0x39, 0x29, 0x03, (byte) 0xC2};
    }

    public static class Secure {
        public static final byte[] SECURE_VALUE = new byte[]{0x55, 0x57, 0x0D, 0x0A};
    }

    public static class LnT {
        //Write all l&t command here
        public static final byte[] ATTENTION = new byte[]{0x2F, 0x3F, 0x21, 0x0D, 0x0A};
        public static final byte[] AUTHENTICATION = new byte[]{0x06, 0x30, 0x30, 0x33, 0x0D, 0x0A};
        public static final byte[] DATA = new byte[]{0x50};
    }

    public static class Genus {
        public static final byte[] command1 = new byte[]{0x2f, 0x3f, 0x4f, 0x53, 0x47, 0x49, 0x5f, 0x4d, 0x65, 0x74, 0x65, 0x72, 0x0f, 0x0f, 0x0f, 0x0f, 0x0f, 0x21, 0x0d, 0x0a};
        public static final byte[] command2 = new byte[]{0x06, 0x54, 0x31, 0x0d, 0x0a};
        public static final byte[] data = new byte[]{0x01, 0x54, 0x32, 0x02, 0x28, 0x39, 0x34, 0x38, 0x45, 0x38, 0x45, 0x38, 0x38, 0x29, 0x03, (byte) 0xb4};
        public static final byte[] command3 = new byte[]{0X01, 0x54, 0x32, 0x02, 0x28, 0x39, 0x34, 0x38, 0x45, 0x38, 0x45, 0x38, 0x45, 0x29, 0x03, (byte) 0xc1};
    }

    public static class Palmohan {
        public static final byte[] PALMOHAN_ENERGY_VALUE = new byte[]{0x01, 0x54, 0x33, 0x02, 0x00, 0x00, 0x28, 0x39, 0x39, 0x39, 0x39, 0x29, 0x03, (byte) 0xc2};
    }

    public static class Genus_Opt {
        public static final byte[] command1 = new byte[]{0x01, 0x3f, 0x47, 0x53, 0x54, 0x47, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x8f};
        public static final byte[] command2 = new byte[]{0x01, 0x3f, 0x4d, 0x50, 0x4d, 0x4b, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0x8e};

        public static final byte[] second_energy_command = new byte[]{0x01, 0x72, 0x01, (byte) 0xcb, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0x70};
        public static final byte[] divisible_command = new byte[]{0x01, 0x72, 0x01, (byte)0xc9, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0x72};
        public static final byte[] ENERGY_COMMAND = new byte[]{0x01, 0x72, 0x01, 0x05, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0x36};
        public static final byte[] MD_COMMAND = new byte[]{0x01, 0x72, 0x01, 0x12, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0xaa, (byte) 0x29};
        /*
         * GET_ENERGY_MD_COMMAND_2 has been added due to GET_ENERGY_MD_COMMAND_1 is not working with bhopal meters so command has been changed by seeing CMRI Output
         */
        public static final byte[] GET_ENERGY_MD_COMMAND_1 = new byte[]{0x01, 0x72, 0x03, 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0x0D};
        public static final byte[] GET_ENERGY_MD_COMMAND_2 = new byte[]{0x01, 0x72, 0x02, 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xaa, (byte) 0xaa, (byte) 0xb8};
        //        public static final byte[] GET_METER_NUMBER_COMMAND = new byte[]{0x01 , 0x72 , (byte)0x01 ,(byte) 0x01 , (byte)0xff , (byte)0xff ,(byte)0xff , (byte)0xff ,(byte) 0xff , (byte)0x91};
        public static final byte[] GET_METER_NUMBER_COMMAND = new byte[]{0x01, 0x72, 0x01, 0x01, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x91};
//01 1b ff ff ff ff ff ff ff ec
    }

    public static class LPR54382 {

        public static final byte[] command1 = new byte[]{0x4d, 0x50, 0x4d, 0x4b, 0x56, 0x56, 0x43, 0x4c, (byte) 0xfe, (byte) 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x16, (byte) 0xdd, (byte) 0xe5, 0x03, 0x00, 0x00, (byte) 0xd4, 0x6e, (byte) 0x0b};
        public static final byte[] command2 = new byte[]{0x2b, 0x05, (byte) 0x82, 0x00, (byte) 0x00, (byte) 0xb2};

    }

    public static class LPR43580 {

        public static final byte[] command1 = new byte[]{0x4d, 0x50, 0x4d, 0x4b, 0x56, 0x56, 0x43, 0x4c, (byte) 0xfe, (byte) 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x16, (byte) 0xdd, (byte) 0xe5, 0x02, 0x00, 0x00, (byte) 0xaa, 0x3c, (byte) 0xae};
        public static final byte[] command2 = new byte[]{0x2b, 0x05, (byte) 0x82, 0x00, (byte) 0x00, (byte) 0xb2};

    }

    public static class LPR09682 {

        public static final byte[] command1 = new byte[]{0x4d, 0x50, 0x4d, 0x4b, 0x56, 0x56, 0x43, 0x4c, (byte) 0xfe, (byte) 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x16, (byte) 0xdd, (byte) 0xe5, 0x05, 0x00, 0x00, (byte) 0x25, (byte) 0xd2, (byte) 0xc2};
        public static final byte[] command2 = new byte[]{0x2b, 0x05, (byte) 0x82, 0x00, (byte) 0x00, (byte) 0xb2};

    }

    public static class VISIONTEK {

        // public static final byte[] command1 = new byte[]{0x4d, 0x50, 0x4d, 0x4b, 0x56, 0x56, 0x43 , 0x4c, (byte)0xfe ,(byte)0x80 ,0x00 ,0x00 ,0x00 ,0x00 ,0x00 ,0x00 ,0x16 ,(byte)0xdd ,(byte)0xe5 ,0x05 ,0x00 ,0x00 ,(byte)0x25 ,(byte)0xd2 ,(byte)0xc2};
        // public static final byte[] command2 = new byte[]{0x2b , 0x05 , (byte)0x82 , 0x00 , (byte)0x00 , (byte)0xb2};
        //  3a 08 00 7a 00 56 49 53 49 4f 4e 33 36 3d c2 0d
        //  3a 00 00 00 ff 01 fe 0d 0a
        public static final byte[] command1 = new byte[]{0x3a, 0x08, 0x00, 0x7a, 0x00, 0x56, 0x49, 0x53, 0x49, (byte) 0x4f, (byte) 0x4e, 0x33, 0x36, 0x3d, (byte) 0xc2, 0x0d, 0x0a};
        public static final byte[] command2 = new byte[]{0x3a, 0x00, 0x00, 0x00, (byte) 0xff, 0x01, (byte) 0xfe, 0x0d, 0x0a};
        public static final byte[] SECOND_COMMAND_FOR_METER_READING = new byte[]{0x3a, 0x00, 0x00, 0x00, (byte) 0x35, (byte)0xcb, (byte) 0x34, 0x0d, 0x0a};

    }

    public static class MONTEL {
        public static final byte[] command_meter_number = new byte[]{0x42, 0x53, 0x53, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x00, (byte) 0xf8, 0x00, 0x00, 0x11, 0x00};
        public static final byte[] command_energy_md_value = new byte[]{0x42, 0x53, 0x53, 0x03, 0x04, 0x05, 0x06, 0x01, 0x01, 0x00, 0x00, 0x11, (byte) 0xcc, 0x6a};
    }

    public static class AVON {
        //        public static final byte[] command_authentication = new byte[]{(byte)0xab, 0x00, 0x01, (byte)0xdd};
        public static final byte[] command_authentication = new byte[]{(byte) 0xaa, 0x26, 0x00, (byte) 0xdd};
        public static final byte[] command_get_all_data = new byte[]{(byte) 0xab, (byte) 0xcc, 0x01, (byte) 0xdd};

    }

    public static class BENTEK {
        public static final byte[] meterNumberCommand = new byte[]{0x52, 0x0d, 0x0a};
        public static final byte[] bentekCommand2 = new byte[]{0x59, 0x59, 0x3f, 0x2a, 0x01, 0x02, 0x03, 0x00, 0x0d, 0x0a};
        public static final byte[] energy_md_meternumberCommand = new byte[]{0x43, 0x0d, 0x0a};
    }

    public static class AVON_OPT {
        public static final byte[] command_AllData = new byte[]{(byte) 0xab, 0x00, 0x01, (byte) 0xdd};
    }

    public static class ALLOYED_OPT {
        public static final byte[] command_AllData = new byte[]{0x41, 0x45, 0x57, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x01, 0x00, (byte) 0xcc, 0x00, (byte) 0xba};
    }

    public static class AVON_3PH {
        public static final byte[] meterNumberCommand = new byte[]{(byte) 0xfe, 0x40, 0x00, 0x01, 0x00, (byte) 0xff};
        public static final byte[] command_AllData = new byte[]{(byte) 0xfe, (byte) 0xc0, 0x02, 0x01, 0x00, (byte) 0xff};
    }

    public static class LNT_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x40, 0x03, 0x41, (byte) 0x10, 0x5f, (byte) 0x93,
                (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x32, (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08,
                0x01, 0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x02,
                0x01, (byte) 0xac, 0x06, (byte) 0x80, 0x04, 0x6c, 0x6e, 0x74, 0x31, (byte) 0xbe, 0x10, 0x04, 0x0e, 0x01, 0x00, 0x00,
                0x00, 0x06, 0x5f, 0x1f, 0x04, 0x00, 0x00, 0x1e, 0x1c, (byte) 0xff, (byte) 0xff, (byte) 0xe5, 0x7e, 0x7e};
    }

    public static class GENUS_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x44, 0x03, 0x41, 0x10, (byte) 0xb3, (byte) 0xe1,
                (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x36, (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x01,
                0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x02, 0x01, (byte) 0xac,
                0x0a, (byte) 0x80, 0x08, 0x31, 0x41, 0x32, 0x42, 0x33, 0x43, 0x34, 0x44, (byte) 0xbe, 0x10, 0x04, 0x0e, 0x01, 0x00, 0x00,
                0x00, 0x06, 0x5f, 0x1f, 0x04, 0x00, 0x00, 0x18, 0x1d, (byte) 0xff, (byte) 0xff, 0x44, (byte) 0xe6, 0x7e};
    }

    public static class EMCO_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x41, 0x03, 0x41, 0x10, (byte) 0xe4, (byte) 0x8f,
                (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x33, (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85, 0x74, 0x05,
                0x08, 0x01, 0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b, 0x07, 0x60, (byte) 0x85, (byte) 0x74,
                (byte) 0x05, 0x08, 0x02, 0x01, (byte) 0xac, 0x07, (byte) 0x80, 0x05, 0x48, 0x65, 0x6c, 0x6c, 0x6f, (byte) 0xbe,
                0x10, 0x04, 0x0e, 0x01, 0x00, 0x00, 0x00, 0x06, 0x5f, 0x1f, 0x04, 0x00, 0x40, 0x1e, 0x1c, (byte) 0xff,
                (byte) 0xff, 0x3b, (byte) 0xc3, 0x7e};
    }

    public static class AVON_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x41, 0x03, 0x41, 0x10, (byte) 0xe4, (byte) 0x8f,
                (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x33, (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85, 0x74, 0x05,
                0x08, 0x01, 0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b, 0x07, 0x60, (byte) 0x85, (byte) 0x74,
                (byte) 0x05, 0x08, 0x02, 0x01, (byte) 0xac, 0x07, (byte) 0x80, 0x05, 0x48, 0x65, 0x6c, 0x6c, 0x6f, (byte) 0xbe,
                0x10, 0x04, 0x0e, 0x01, 0x00, 0x00, 0x00, 0x06, 0x5f, 0x1f, 0x04, 0x00, 0x40, 0x1e, 0x1c, (byte) 0xff,
                (byte) 0xff, 0x3b, (byte) 0xc3, 0x7e};
    }

    public static class VISIONTEK_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x41, 0x03, 0x41, 0x10, (byte) 0xe4,
                (byte) 0x8f, (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x33, (byte) 0xa1, (byte) 0x09, 0x06, 0x07,
                0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x01, 0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b,
                0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x02, 0x01, (byte) 0xac, 0x07, (byte) 0x80, (byte) 0x05,
                0x56, 0x69, 0x73, 0x6f, 0x6e, (byte) 0xbe, 0x10, 0x04, 0x0e, 0x01, 0x00, 0x00, 0x00, 0x06,
                0x5f, 0x1f, 0x04, 0x00, 0x40, 0x1e, 0x1c, (byte) 0xff, (byte) 0xff, 0x65, 0x29, 0x7e};
    }

    public static class HPL_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x4c, 0x03, 0x41, 0x10, 0x6b, 0x04,
                (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x3e, (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85,
                0x74, 0x05, 0x08, 0x01, 0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b, 0x07, 0x60,
                (byte) 0x85, 0x74, 0x05, 0x08, 0x02, 0x01, (byte) 0xac, 0x12, (byte) 0x80, 0x10, 0x31, 0x31,
                0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, (byte) 0xbe,
                0x10, 0x04, 0x0e, 0x01, 0x00, 0x00, 0x00, 0x06, 0x5f, 0x1f, 0x04, 0x00, 0x00, 0x18, 0x1d,
                (byte) 0xff, (byte) 0xff, (byte) 0xb3, 0x3d, 0x7e};
    }

    public static class LANDIS_DLMS {
        public static final byte[] command_AARQ = new byte[]{0x7e, (byte) 0xa0, 0x44, 0x03, 0x41, 0x10, (byte) 0xb3, (byte) 0xe1,
                (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x36, (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x01,
                0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80, (byte) 0x8b, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x02, 0x01,
                (byte) 0xac, 0x0a, (byte) 0x80, 0x08, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, 0x31, (byte) 0xbe, 0x10, 0x04,
                0x0e, 0x01, 0x00, 0x00, 0x00, 0x06, 0x5f, 0x1f, 0x04, 0x00, 0x00, 0x18, 0x1d, (byte) 0xff, (byte) 0xff, 0x4e,
                0x7f, 0x7e};
    }

    public static class SECURE_DLMS {

        // 7e a0 44 03 41 10 b3 e1 e6 e6 00 60 36 a1 09 06 07 60 85 74 05 08 01 01 8a 02 07 80 8b 07 60 85 74 05 08
        // 02 01 ac 0a 80 08 41 42 43 44 30 30 30 31 be 10 04 0e 01 00 00 00 06 5f 1f 04 00 00 18 1d ff ff 87 3d 7e
        public static final byte[] command_AARQ = new byte[]{
                0x7e, (byte) 0xa0, 0x44, 0x03, 0x41, 0x10, (byte) 0xb3, (byte) 0xe1, (byte) 0xe6, (byte) 0xe6, 0x00, 0x60, 0x36,
                (byte) 0xa1, 0x09, 0x06, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x01, 0x01, (byte) 0x8a, 0x02, 0x07, (byte) 0x80,
                (byte) 0x8b, 0x07, 0x60, (byte) 0x85, 0x74, 0x05, 0x08, 0x02, 0x01, (byte) 0xac, 0x0a, (byte) 0x80, 0x08, 0x41, 0x42,
                0x43, 0x44, 0x30, 0x30, 0x30, 0x31, (byte) 0xbe, 0x10, 0x04, 0x0e, 0x01, 0x00, 0x00, 0x00, 0x06, 0x5f, 0x1f, 0x04,
                0x00, 0x00, 0x18, 0x1d, (byte) 0xff, (byte) 0xff, (byte) 0x87, 0x3d, 0x7e};
    }

    public static class DLMS {
        public static final byte[] SNRM = new byte[]{0x7e, (byte) 0xa0, 0x07, 0x03, 0x41, (byte) 0x93, 0x5a, 0x64, 0x7e};

        public static final byte[] ENERGY_SCALAR_UNIT = new byte[]{0x7e, (byte) 0xa0, 0x19, 0x03, 0x41, (byte) 0x54, 0x0a,
                (byte) 0xbb, (byte) 0xe6, (byte) 0xe6, 0x00, (byte) 0xc0, 0x01, (byte) 0x81, 0x00, 0x03, 0x01, 0x00,
                0x01, 0x08, (byte) 0x00, (byte) 0xff, 0x03, (byte) 0x00, (byte) 0xef, (byte) 0xbc, 0x7e};

        public static final byte[] MD_SCALAR_UNIT = new byte[]{0x7e, (byte) 0xa0, 0x19, 0x03, 0x41, (byte) 0x54, 0x0a,
                (byte) 0xbb, (byte) 0xe6, (byte) 0xe6, 0x00, (byte) 0xc0, 0x01, (byte) 0x81, 0x00, 0x04, 0x01, 0x00,
                0x01, 0x06, (byte) 0x00, (byte) 0xff, 0x03, (byte) 0x00, (byte) 0xb5, (byte) 0x34, 0x7e};

        public static final byte[] METER_NUMBER_COMMAND = new byte[]{0x7e, (byte) 0xa0, 0x19, 0x03, 0x41, (byte) 0x32, 0x3a,
                (byte) 0xbd, (byte) 0xe6, (byte) 0xe6, 0x00, (byte) 0xc0, 0x01, (byte) 0xc1, 0x00, 0x01, 0x00, 0x00,
                0x60, 0x01, 0x00, (byte) 0xff, 0x02, 0x00, (byte) 0x89, (byte) 0xa0, 0x7e};

        public static final byte[] ENERGY_VALUE_COMMAND = new byte[]{0x7e, (byte) 0xa0, 0x19, 0x03, 0x41, (byte) 0x32, 0x3a,
                (byte) 0xbd, (byte) 0xe6, (byte) 0xe6, 0x00, (byte) 0xc0, 0x01, (byte) 0x81, 0x00, 0x03, 0x01, 0x00,
                0x01, 0x08, (byte) 0x00, (byte) 0xff, 0x02, (byte) 0x00, (byte) 0x37, (byte) 0xa5, 0x7e};

        public static final byte[] MD_VALUE_COMMAND = new byte[]{0x7e, (byte) 0xa0, 0x19, 0x03, 0x41, (byte) 0x32, 0x3a,
                (byte) 0xbd, (byte) 0xe6, (byte) 0xe6, 0x00, (byte) 0xc0, 0x01, (byte) 0x81, 0x00, 0x04, 0x01, 0x00,
                0x01, 0x06, (byte) 0x00, (byte) 0xff, 0x02, (byte) 0x00, (byte) 0x6d, 0x2d, 0x7e};

        public static final byte[] DISCONNECT_COMMAND = new byte[]{0x7e, (byte) 0xa0, 0x07, 0x03, 0x41, (byte) 0x53, 0x56,
                (byte) 0xa2, 0x7e};
    }

    public static class VISIONTEK_6LOWPAN {
        public static final byte[] METER_NUMBER_COMMAND = new byte[]{0x01, 0x03, 0x00, 0x02, 0x00, 0x27, (byte) 0xa4, 0x10};
        public static final byte[] ENERGY_COMMAND = new byte[]{0x01, 0x04, 0x00, 0x00, 0x00, 0x72, 0x70, 0x2f};
    }

}

//hasnain.ali10@gmail.com
