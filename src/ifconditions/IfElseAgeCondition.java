package ifconditions;

public class IfElseAgeCondition {
    public static void main(String[] args) {
        int age = 76;
        System.out.println("Your Age is "+ age);
       if (age<=18 && age>=20){
        System.out.println("Child");
    }  else if (age>=21 && age <=50){
           System.out.println("Healthy Man");
       } else if (age<=51 && age>=75){
           System.out.println("Retired Man"); //this is my update
       } else {
           System.out.println("Senior Citizen");
       }
}
}