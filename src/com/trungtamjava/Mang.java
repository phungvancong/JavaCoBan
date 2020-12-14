package com.trungtamjava;

public class Mang {
    public static void main(String[] args) {
        int x = 12;
        int y = 23;
        int z= 22;

        int [] mangc= new int[3];
        mangc[0]= 23;
        mangc[1]= 21;
        mangc[2] = 34;

        System.out.println(mangc[2]+mangc[1]);

        long[] mangL = {12,23,34,454,67};

        for (long l : mangL) {
            System.out.print(l + ", ");

        }
        System.out.println("\n"+mangL.length);

    }
}
