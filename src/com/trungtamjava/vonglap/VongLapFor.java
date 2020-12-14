package com.trungtamjava.vonglap;

import java.util.concurrent.SynchronousQueue;

public class VongLapFor {
    public static void main(String[] args) {
        for (int i= 0; i < 5 ; i +=2) {
            System.out.println(i+1);

        }System.out.println("---");

        for (int i = 5; i >0; i--){
            System.out.println(i);
        }
        int []x = {1,4,5,6,3,3};

        for (int i = x.length-1; i >=0 ; i--){
            System.out.println(x[i]);
        }System.out.println("-----");

    }
}
