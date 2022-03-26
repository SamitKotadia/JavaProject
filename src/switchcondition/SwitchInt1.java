package switchcondition;

public class SwitchInt1 {
    public static void main(String[] args) {
    myNumber(5);
    }
    public static void myNumber(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
