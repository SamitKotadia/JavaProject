package loops;

public class MyForLoop1 {
    public static void main(String[] args) {
        for (int a = 20; a <= 23; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.println("Print value of b " + b);
            }
            System.out.println("Print value of a " + a);
        }
    }
}