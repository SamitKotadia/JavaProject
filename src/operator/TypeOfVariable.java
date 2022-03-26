package operator;

public class TypeOfVariable {
    int a = 3; //global variable, we can access this in any class
    static int b=5; //static variable

    public static void main(String[] args) {
        System.out.println(b); //we can call static variable in main method
        TypeOfVariable typeOfVariable = new TypeOfVariable(); //calling method for global and local variable
        System.out.println(typeOfVariable.a); //print global variable
        typeOfVariable.add();//call local method
    }
public void add(){
    int c=4, d=7; //local variable
    System.out.println(c);
    System.out.println(a);
    }

}
