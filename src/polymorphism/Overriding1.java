package polymorphism;

public class Overriding1 {

    public static void main(String[] args) {
    Overriding1 overridingClass1 = new Overriding1();
    overridingClass1.myName();
    overridingClass1.maxNumber(20,43);
    }
    public void myName(){
        System.out.println("Samit");
    }
    public void maxNumber(int a, int b){
        System.out.println(Math.max(a,b));
    }
}
