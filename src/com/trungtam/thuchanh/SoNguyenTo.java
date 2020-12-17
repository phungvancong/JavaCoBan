package com.trungtam.thuchanh;

public class SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        long sum = 0;
        System.out.println("Liet ke tat ca so nguyen to co 4 chu so:");

        for (int i = 1001; i < 9999; i += 1) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }

        System.out.println("Tong cac so nguyen to co 4 chu so la: " + count);
        System.out.println("Tong tat ca cac so nguyen to la: " + sum);
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
//        if (n < 2) {
//            return false;
//        }

        int canHai = (int) Math.sqrt(n);
        for (int i = 2; i <= canHai; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
