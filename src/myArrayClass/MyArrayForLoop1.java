package myArrayClass;

public class MyArrayForLoop1 {
    public static void main(String[] args) {
        MyArrayForLoop1 myArrayForLoopSum = new MyArrayForLoop1();
        myArrayForLoopSum.mySum();
    }
    public void mySum() {
        int myData[] = {65, 54, 32, 52, 33, 23, 55, 65};
        for (int x = 1; x < 3; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.println("Value of Y " + myData[y]);
            }
            System.out.println("Value of X " + myData[x]);
        }
    }
}