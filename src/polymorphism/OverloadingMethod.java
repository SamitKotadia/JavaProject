package polymorphism;

public class OverloadingMethod {
    public static void main(String[] args) {
        OverloadingMethod overloadingMethod = new OverloadingMethod();
        System.out.println(overloadingMethod.name(1));
        overloadingMethod.name("samit", "kotadia");
    }

    public void name(String a) {
    }
    public void name(String a, String b) {
        System.out.println(a + b);
    }
    public int name(int a) {
        return a;
    }
    public void name(char a) {
    }
    public String name() {
        return null;
    }
}
