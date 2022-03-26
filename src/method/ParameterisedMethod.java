package method;

public class ParameterisedMethod {
    public boolean myName;
    String myName1="Samit Kalpesh Kotadia";
    String myLocation;
    public static void main(String[] args) {
    int b=23;
    int c=25;

    ParameterisedMethod peraMethod = new ParameterisedMethod();
        peraMethod.add(b=5, c=8);
        peraMethod.printName("Kotadia", "samit"); // user define method without
        printName("samit", "kotadia"); //user define method is static then we can call with direct method name
    }
    public void add(int b, int c){ //Local method without static
        int a=b-c;
        System.out.println(a);
        System.out.println(b+c); //direct declare output
    }
    public static void printName(String firstName, String lastName){
        System.out.println(firstName+" "+lastName);

    }
}
