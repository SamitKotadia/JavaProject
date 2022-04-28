package exceptionClass;

public class Throw {
    public static void main(String[] args) {
        checkAge(15); //if age is above 18 then it's not throw any exception
    }
    public static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Under Age");
        } else {
            System.out.println("Above Age");
        }
    }
}
