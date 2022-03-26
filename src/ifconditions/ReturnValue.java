package ifconditions;

public class ReturnValue {
    public static void main(String[] args) {
        System.out.println(callOfDuty(1000));
        System.out.println(myName("Call of duty"));
        System.out.println(myName("Score of Call of Duty is ")+callOfDuty(1000));
        ReturnValue returnValue = new ReturnValue();
        returnValue.add(50);
        }
    public static int callOfDuty(int score){
        return score;
    }
    public static String myName(String name){
        return name;
    }
    public void add(int a){
        return;
    }
}
