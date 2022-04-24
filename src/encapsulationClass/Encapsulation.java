package encapsulationClass;

public class Encapsulation {
    public static void main(String[] args) {
       // Encapsulation encapsulation = new Encapsulation();
        GetAndSet getAndSet = new GetAndSet(); //call method from getandset class
        getAndSet.setName("My Name is Samit"); //set the name
        System.out.println(getAndSet.getName()); // call getname method from getandset class
    }
}
