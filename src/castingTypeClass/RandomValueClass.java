package castingTypeClass;

import java.util.Random;

public class RandomValueClass {
    public static void main(String[] args) {

        Random random = new Random();
        int result = random.nextInt();
        String email = "samit" + result + "@gmail.com";
        String password = "Mypassword"+result;
        user(email,password);
    }
    public static void user(String email, String password) {
        System.out.println(email + " " + password);
    }
}

