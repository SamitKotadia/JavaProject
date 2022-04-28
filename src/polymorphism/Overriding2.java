package polymorphism;

public class Overriding2 extends Overriding1 {
    public static void main(String[] args) {
    Overriding2 overridingClass2 = new Overriding2();
    overridingClass2.myName();
    overridingClass2.maxNumber(23,55);
    }
    public void myName(){
        System.out.println("Kotadia");
    }
    public void maxNumber(int a, int b){
        System.out.println(Math.max(a,b));
    }
}
