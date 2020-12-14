package com.trungtamjava.vonglap;

public class Break {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++){
            System.out.println(i);
            if (i >5){
                break;
            }
        }

        for (int i = 0; i <10; i++){
            System.out.println("gia tri cua i la "+ i);
            for (int j = 0 ; j<10; j ++){
                System.out.println("gia tri cua j la "+j);
                break;
            }
        }
    }
}


