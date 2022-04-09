package myArrayClass;

public class MyArrayForLoopSum {
    public static void main(String[] args) {
        int[] myNumber = {54, 65, 34, 75, 34, 21};
        int sum = 0;
        for (int y = 0; y < myNumber.length; y++) {
            sum = sum + myNumber[0];
        }
        System.out.println(sum);
    }
}
