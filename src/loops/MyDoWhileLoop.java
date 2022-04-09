package loops;

public class MyDoWhileLoop {
    public static void main(String[] args) {
MyDoWhileLoop myDoWhileLoop = new MyDoWhileLoop();
myDoWhileLoop.MyValue(5);
    }
    public void MyValue(int a){
        do {
            System.out.println("This is value of a");
            a++;
        } while (a<10);
    }
}
