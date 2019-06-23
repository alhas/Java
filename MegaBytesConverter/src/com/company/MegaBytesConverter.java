package com.company;


    public class MegaBytesConverter {

        public static void printMegaBytesAndKiloBytes(int kiloBytes){

            int megaBytesToBytes = 1024;
            int megaByteConverter = Math.round(kiloBytes/megaBytesToBytes);
            int remainBytes = kiloBytes - (megaBytesToBytes*megaByteConverter);
            if(kiloBytes >= 0) {
                System.out.println(kiloBytes + " KB = " + megaByteConverter + " MB and " + remainBytes + " KB");
            }else {
                System.out.println("Invalid Value");
            }
        }
    }


//public class MegaBytesConverter {
//
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        int megaBytesToBytes = 1024;
//        int megaByteConverter = Math.round(kiloBytes/megaBytesToBytes);
//        int remainBytes = kiloBytes - (megaBytesToBytes*megaByteConverter);
//        if (kiloBytes >= 0) {
//            System.out.println(kiloBytes + " KB = " + megaByteConverter + " MB and " + remainBytes + " KB");
//        } else {
//            System.out.println("Invalid Value");
//        }
//    }
//}