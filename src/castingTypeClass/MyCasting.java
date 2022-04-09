package castingTypeClass;

public class MyCasting {
    public static void main(String[] args) {

        //Wide Casting //
        int myInt = 9;
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble); //its auto convert

        //Narrow casting
        double myDouble1 = 12.12d;
        int myInt1 = (int) myDouble1; //manually input the casting
        System.out.println(myDouble1);
        System.out.println(myInt1);
    }}