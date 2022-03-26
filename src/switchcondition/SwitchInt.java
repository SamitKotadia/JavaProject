package switchcondition;

public class SwitchInt {
    public static void main(String[] args) {
SwitchInt switchInt=new SwitchInt();
switchInt.myNumber(6);
    }
    public void myNumber(int number){
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Input");
        }


    }
}
