package myConstructorClass;

public class MyConst2 {
    int a, b;
    float c;
    char d;
    boolean status;
    String name;

    public MyConst2() {
        a = 2;
        b = 19;
        d = 's';
        status = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(status);
    }

    public static void main(String[] args) {
        MyConst2 myConst2 = new MyConst2();

        }
}