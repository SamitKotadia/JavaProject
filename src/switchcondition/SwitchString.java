package switchcondition;

public class SwitchString {
    public static void main(String[] args) {
    SwitchString switchString = new SwitchString();
    switchString.serial("samm");
    }
    public void serial (String myDay){
        switch (myDay){
            case "Mon": case "Tue": case "Wed": case "Thu":
                System.out.println("Its Mon to Thu");
                break;
            case "Fri":
                System.out.println("Its Friday");
                break;
            case "Sat": case "Sun":
                System.out.println("Its Weekend");
            default:
                System.out.println("Check spelling of "+myDay);

        }

    }
}