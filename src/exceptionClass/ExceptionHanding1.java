package exceptionClass;

public class ExceptionHanding1 {
    public static void main(String[] args) {

        try {
            int data = 25;
            System.out.println(25 / 0);
        } catch (Exception e) {
            System.out.println(e);
           // e.printStackTrace();
        } finally {
            System.out.println("Hello");
        }
    }
}
