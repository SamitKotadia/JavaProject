package exceptionClass;

public class ExceptionHanding2 {
    public static void main(String[] args) {

       try {
           int a = 39/0;
           System.out.println(a);
       } catch (Exception e){
           System.out.println(e);
           e.printStackTrace(); // its print all error in detail
    }
       try{
         int myNumber [] = {1,2,3,4};
           System.out.println(myNumber[6]);
       } catch (Exception e) {
           System.out.println(e);
       } finally {
           System.out.println("This is Finally statement");
       }
}
}
