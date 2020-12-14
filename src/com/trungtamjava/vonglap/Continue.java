package com.trungtamjava.vonglap;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0 ; i <10; i ++){
            if (i < 5) {
                continue;
            }
            System.out.println(i);

        }

        for (int i = 0; i <8; i++){
            System.out.println("gia tri cua i "+i );
            for (int j = 0; j < 7 ; j++){
                if (j <6){
                    continue;
                }
                System.out.println("gia tri cua j la " + j );
            }
        }
    }
}
