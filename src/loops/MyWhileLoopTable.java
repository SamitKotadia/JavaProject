package loops;

public class MyWhileLoopTable {
    public static void main(String[] args) {
        int a = 11, b = 1;
        System.out.println("Table of "+ a);
        while (b < a) {
            System.out.println(a * b);
            b++;
        }
    }
}