package ifconditions;

public class IfElseMarks {
    public static void main(String[] args) {
        int marks=55;
        if (marks>100){
            System.out.println("Not valid input");
        } else if (marks<35){
            System.out.println("Fail");
        } else if (marks>=35 && marks<=50){
            System.out.println("Second Class");
        } else if (marks>=51 && marks<=70){
            System.out.println("First Class");
        } else if (marks>=71 && marks<=90){
            System.out.println("Distinction");
        } else {
            System.out.println("Excellent");
        }
    }

}
