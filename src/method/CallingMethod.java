package method;

public class CallingMethod {
    public static void main(String[] args) {
        ParameterisedMethod parameterisedMethod = new ParameterisedMethod();
        parameterisedMethod.add(4,5);
        parameterisedMethod.printName("hello", "hi");
        System.out.println(parameterisedMethod.myName1);
    }
}
