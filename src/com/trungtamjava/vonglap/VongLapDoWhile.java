package com.trungtamjava.vonglap;

import java.net.BindException;

public class VongLapDoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            i++;
        }while (i<5);
        System.out.println("---");


        int [] x = {1,2,4,5,67,8};
        int index = 0 ;

        do {

            System.out.println(x[index]);
            index++;

        }while (index< x.length);

        System.out.println("---");



    }
}
