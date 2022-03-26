package loops;

public class FindNumber {
    public static void main(String[] args) {
        findEven(-5, 9);
        findOdd(-5,9);
    }

    public static void findEven(int startNumber, int endNumber) {
        System.out.println("This is my Even Number from " + startNumber + " to " + endNumber);
        System.out.println("------------------------------------------------------");
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("My Even Number is " + i);
            } //else {
               // System.out.println("my Odd Number is " + i);
           // }
        }
    }
    public static void findOdd(int startNumber, int endNumber) {
        System.out.println("This is my Odd Number from " + startNumber + " to " + endNumber);
        System.out.println("------------------------------------------------------");
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 != 0) {
                System.out.println("My Odd Number is " + i);
            } //else {
            // System.out.println("my Odd Number is " + i);
            // }
        }
    }
}
