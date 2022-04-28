package arrayListClass;

import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer,String> map = new TreeMap<Integer,String>();
        map.put(12,"Mr A");
        map.put(15,"Mr B");
        map.put(15,"Mr B"); //Duplicate value not allowed
        map.put(10,"Mr C");
        map.put(0,"Mr X");
        map.remove(12); // remove value of index 12
        map.put(12,"Mr Z"); // added new value in index 12

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
