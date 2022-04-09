package myArrayClass;

public class MyArrayPractice {
    public static void main(String[] args) {
        int myNumber[]={1,2,3,4,5,6,7};
        int [] myValue={5,76,67};
        System.out.println(myNumber.length); //shows index of myNumber array
        System.out.println(myNumber[2]); //show value of 2 index
        myNumber[2]=15;
        System.out.println(myNumber[2]);
        System.out.println(myValue[0]);
        String[] myData={"Java","samit","Class","Number"};
        System.out.println(myData[3]);

        String a ="Samit";
        System.out.println(a.length());//length() count the total char in word
    }
}
