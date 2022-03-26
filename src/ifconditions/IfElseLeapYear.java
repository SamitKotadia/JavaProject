package ifconditions;

public class IfElseLeapYear {
    public static void main(String[] args) {
        int year=2000;
        System.out.println("Year is "+year);
        if ((year%4==0) && (year%100 !=0) || (year%400==0)){
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is not Leap Year");
        }
    }
}
