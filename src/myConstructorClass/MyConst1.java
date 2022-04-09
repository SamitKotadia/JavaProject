package myConstructorClass;

public class MyConst1 {
    int a;

    public MyConst1(int b) {
        int a = b;
        System.out.println(b);
    }
    public static void main(String[] args) {
        MyConst1 myConst1 = new MyConst1(3);
    }
}



