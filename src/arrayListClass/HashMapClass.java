package arrayListClass;

import java.util.HashMap;
import java.util.SortedMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(12, "Mr W");
        map.put(15, "Mr X");
        map.put(2, "Mr x");
        map.put(7, "Mr Z");
        map.put(13, "Mr X");
        System.out.println(map);
        System.out.println("Give value in Array "+map.entrySet());
//        ArrayList<String> value = new ArrayList<String>();
//        ArrayList<Integer> key = new ArrayList<Integer>();
        System.out.println("Printing of Keys " + map.keySet());
        System.out.println("Printing of Value " + map.values());
        System.out.println("Size of array "+map.size());
        System.out.println();
        System.out.println("Printing values of ArrayList");
        System.out.println("-----------------------------");
        for (String name : map.values()) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("Printing Keys of ArrayList");
        System.out.println("-----------------------------");
        for (Integer value : map.keySet()) {
            System.out.println(value);
        }

    }
}
