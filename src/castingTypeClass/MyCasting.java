package castingTypeClass;

public class MyCasting {
    public static void main(String[] args) {

        System.out.println("This is Wide Casting");
        System.out.println("--------------------");
        short myShort = 99; //Auto convert
        int myInt = myShort;
        long myLong = myShort;
        float myFloat = myShort;
        double myDouble = myShort;
        System.out.println("This Is Short Variable " + myShort);
        System.out.println("This Is Int Variable " + myInt);
        System.out.println("This Is Long Variable " + myLong);
        System.out.println("This Is Float Variable " + myFloat);
        System.out.println("This Is Double Variable " + myDouble);


        //Narrow casting
        double myDouble1 = 1222.123232d;
        float myFloat1 = (float) myDouble1; //manually input the casting
        long myLong1 = (long) myDouble1;
        int myInt1 = (int) myDouble1;
        short myShort1 = (short) myDouble1;
        System.out.println();
        System.out.println("This is Narrow Casting");
        System.out.println("-----------------------");
        System.out.println("This Is Float Variable " + myFloat1);
        System.out.println("This Is Long Variable " + myLong1);
        System.out.println("This Is Int Variable " + myInt1);
        System.out.println("This Is Float Variable " + myShort1);
    }
}