package com.company;

public class DefaultVariable {
    static int myNum1;
    static byte myNum2;
    static short myNum3;
    static long myNum4;
    static char myValue;
    static boolean myValue1;
    static float myNum5;
    static double myNum6;

    public static void main(String[] args) {
        System.out.println("This is int" + myNum1);
        System.out.println("This is byte" + myNum2);
        System.out.println("This is short" + myNum3);
        System.out.println("This is long" + myNum4);
        System.out.println("This is float" + myNum5);
        System.out.println("This is double" + myNum6);
        System.out.println("This is char" + myValue);
        System.out.println("This is boolean" + myValue1);
    }
}
