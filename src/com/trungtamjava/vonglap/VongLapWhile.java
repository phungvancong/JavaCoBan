package com.trungtamjava.vonglap;

import java.nio.channels.ShutdownChannelGroupException;

public class VongLapWhile {
    public static void main(String[] args) {
        int i = 0;

        while (i<5 ){
            System.out.println(i);
            i++;
        }
        System.out.println("---");

        int[] mang = {1,4,5,67,34,4};

        int x = 0;

        while (x< mang.length){
            System.out.println(mang[x]);
            x++;
        }
    }
}
