package polymorphism;

public class overloadingMethod {
    public static void main(String[] args) {
        overloadingMethod overloadingMethod = new overloadingMethod();
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
