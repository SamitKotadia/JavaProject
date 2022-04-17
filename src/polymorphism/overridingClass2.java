package polymorphism;

public class overridingClass2 extends overridingClass1{
    public static void main(String[] args) {
    overridingClass2 overridingClass2 = new overridingClass2();
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
