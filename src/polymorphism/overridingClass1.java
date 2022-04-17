package polymorphism;

public class overridingClass1 {

    public static void main(String[] args) {
    overridingClass1 overridingClass1 = new overridingClass1();
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
