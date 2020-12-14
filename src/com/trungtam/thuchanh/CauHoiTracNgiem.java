package com.trungtam.thuchanh;

import java.util.Scanner;

public class CauHoiTracNgiem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Lenh tiep tuc vong lap laf gi ?");
            System.out.println("1. continue");
            System.out.println("2. break");
            System.out.println("Nhap Q de thoat ");

            String luaChon = scan.nextLine();

            if (luaChon.equals("1")){
                System.out.println("Ban da tra loi dung ");
                break;
            }else if (luaChon.equals("2")){
                System.out.println("Ban da tra loi sai ");
                break;
            }else  if (luaChon.equals("q")){
                System.out.println("Ban co muon thoat khoi chuong trinh  ");
                System.out.println("nhap ok de thoat  ");
                String chon = scan.nextLine();
                if (chon.equals("ok")){
                    System.out.println("ban da thoat khoi chuong trinh ");
                    break;
                }else {
                    LuaChon();

                }
            }else {
                System.out.println("vui long nhap gia tri");
            }
        }
    }
    public static void LuaChon(){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Lenh tiep tuc vong lap laf gi ?");
            System.out.println("1. continue");
            System.out.println("2. break");
            System.out.println("Nhap Q de thoat ");

            String luaChon = scan.nextLine();

            if (luaChon.equals("1")){
                System.out.println("Ban da tra loi dung ");
                break;
            }else if (luaChon.equals("2")){
                System.out.println("Ban da tra loi sai ");
                break;
            }else  if (luaChon.equals("q")){
                System.out.println("Ban co muon thoat khoi chuong trinh  ");
                System.out.println("nhap ok de thoat  ");
                String chon = scan.nextLine();
                if (chon.equals("ok")){
                    System.out.println("ban da thoat khoi chuong trinh ");
                    break;
                }else {
                    LuaChon();

                }
            }else {
                System.out.println("vui long nhap gia tri");
            }
        }
    }
}
