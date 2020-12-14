package com.trungtamjava.vonglap;

public class VongLapForEach {
    public static void main(String[] args) {
        int[] mang = {1,3,4,56,7};

        for (int x : mang  ) {
            System.out.println(x+", ");
        }
        String[] sts = {" xin chao", " trung tam","java"};

        for (String s : sts) {
            System.out.print(s+",");
        }
    }
}
