package myArrayClass;

public class MyArrayEvenOddNumber {
    public static void main(String[] args) {
myData();
    }
    public static void myData(){
        int mySum[]={1,6,7,18,6,65};
        for (int i=0; i<=5; i++){
            if (mySum[i]%2==0){
                System.out.println(mySum[i]+" is Even Number");
            } else {
                System.out.println(mySum[i]+ " is Odd Number");
        }

    }
}}
