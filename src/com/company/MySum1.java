package com.company;

public class MySum1 {
    public static void main(String[] args) {
        {
            int A;
            int B;
            value(A = 10, B = 20);
        }
    }

    public static void value(int A, int B) {
        int C=A+B;
        System.out.println(C);
    }
}