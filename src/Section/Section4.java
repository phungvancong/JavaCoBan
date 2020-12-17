package Section;

import java.util.Scanner;

public class Section4 {
    public static void main(String[] args) {
        // Nhap gia tri cua string 1 tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao str1 gia tri bat ki tu ban phim");
        String str1 = sc.nextLine();

        // Nhap 1 string khac tu ban phim, kiem tra xem string do co nam trong
        // string1 ko ?
        System.out.println("Nhap vao str2 gia tri bat ki tu ban phim");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Chuoi " + str2 + " nam trong chuoi " + str1);
        } else {
            System.out.println("Chuoi " + str2 + " khong nam trong chuoi " + str1);
        }

        // kt trong string 1, co bao nhieu pt A xuat hien dung vong lap for if
        // de tim

        char kyTu = 'A';
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Trong chuoi " + str1 + " co " + count + " ky tu 'A '.");

        /*
         * cat chuoi String 1 thanh mang String boi khoang trang va ham split for va in
         * cac chuoi sau khi cat
         */
        String[] strToken = str1.split("\\s+");

        for (int i = 0; i < strToken.length; i++) {
            System.out.println("tach chuoi String 1 thanh " + strToken[i]);
        }

    }
//        Scanner scan= new Scanner(System.in);
//        System.out.println("nhap string vao ");
//
//        String str= scan.nextLine();
//        System.out.println("*nhap string 2");
//
//        //nhap string thu 2
//        Scanner sc = new Scanner(System.in);
//        String str2 = sc.nextLine();
//
//        if (str.equals(str2)){
//            System.out.println("chuoi"+ str2 +"nam trong string "+str);
//
//        }System.out.println("chuoi"+ str2 +"khong nam trong string "+str);
//
//
//        char kyTu = 'A';
//        int count = 0;
//        for (int i = 0 ; i<str.length();i++){
//            if (str.charAt(i)==kyTu){
//                count++;
//            }
//        }
//        System.out.println("Trong chuoi " + str + " co " + count + " ky tu 'A '.");
//
//        String[] strToken = str.split("\\s+");
//
//        for (int i = 0; i < strToken.length; i++) {
//            System.out.println("tach chuoi String 1 thanh " + strToken[i]);
//        }
//    }

}
