package interfaceClass;
// this is multiple interface inheritance
// interfaceC class inheritance by class InterfaceA and InterfaceB
// interface to interface inheritance we need "extends" keyword
public interface InterfaceC extends InterfaceA, InterfaceB {
    public static void main(String[] args) {

    }
    //In Interface we just declare methods

    void methodA();
    void methodB();
}
