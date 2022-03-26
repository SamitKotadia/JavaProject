package method;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String firstName = "Samit";
        String lastName = "Kotadia";
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.length()+lastName.length());
        System.out.println(firstName.charAt(3));
        System.out.println(lastName.indexOf('a'));
        System.out.println(lastName.replace("a","x"));
        System.out.println(firstName.toUpperCase()+" "+lastName.toLowerCase());
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.contains("t"));
    }

}
