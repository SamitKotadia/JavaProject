package interfaceClass;

public class BMW implements CarInterface {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.gearBox();
        bmw.colour();
        bmw.tyreSize();
    }

    public void gearBox() {
        System.out.println("this is my gearbox method");
    }

    public void colour() {
        System.out.println("this is my colour method");
    }

    public void tyreSize() {
        System.out.println("this is my tyre method");
    }
}
