package interfaceClass;

// need to write "implements" keyword for interface to class level inheritance

public class SubB implements InterfaceA, InterfaceB {

    public static void main(String[] args) {
        SubB classB = new SubB(); // call method
        classB.methodA();
        classB.methodB();
    }
    // this method is inheritance by InterfaceA and InterfaceB class
    // in class level we can declare value in method
    @Override
    public void methodA() {
        System.out.println("Method A : This is inheritance by Interface A and B class");

    }

    @Override
    public void methodB() {
        System.out.println("Method B : This is inheritance by Interface A and B class");

    }
}
