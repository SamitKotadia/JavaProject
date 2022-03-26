package operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(a<2 && b>6); //both conditions are false
        System.out.println(a>2 && b<6); //both conditions are true
        System.out.println(a<b || a>b); //first condition is false but second condition is true
        System.out.println(a==b || a<b); // both condition are false
        System.out.println(!(a==b)); // condition is true but its reverse the answer
        System.out.println(!(a>2 && b<6)); ////both conditions are true but its reverse the answer

    }
}
