package arrayListClass;

import java.util.HashSet;
//null value not allowed
// in Hashset we can not add duplicate values
// hashset method put data in sequential order
public class HashSetClass {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<Integer>(); we can add any data type but we need to write full name
        // HashSet<Float> set = new HashSet<Float>();
        HashSet<String> set = new HashSet<String>(); //hashset declaring method
        set.add("Mr X");
        set.add("Mr Y");
        set.add("Mr Z");
        set.add("Mr x"); //we can add case-sensitive value
        set.add("Mr X 0.3");
        set.add("Mr X 9.3");
        set.add("Mr X 1.0");
       // set.add(); //null value not allowed

        set.add("Mr X"); //duplicate value can not print in list
        System.out.println(set);

        set.remove(2);
        set.remove("Mr Z");

        System.out.println("---------------------------");
        System.out.println(set);
        System.out.println();
        System.out.println("data in raw format");
        System.out.println("---------------------------");
        for (String name : set) {
            System.out.println(name);
        }
    }
}
