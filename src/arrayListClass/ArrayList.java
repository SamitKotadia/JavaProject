package arrayListClass;

// in array list class we can add duplicate values //null value not allowed
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<String>(); // array list method
        //List<Integer> list = new ArrayList<Integer>(); // we can add any data type but we need to write full type name
        //we can directly write list, list is child and its assign to parent i.e arraylist
        list.add("Mr A");
        list.add("Mr B");
        list.add("Mr C");
        list.add("Mr D");
        list.add("Mr E");
        list.add("Mr A"); //in array list we can add duplicate value
        list.add("Mr A");

//        list.add(); // null value not allowed
        System.out.println(list);

        list.remove(0);
        list.remove("Mr B");
        System.out.println("This is list of Size method in Array list "+list.size());

        System.out.println(list);

        System.out.println("This is get method for specific Array index 0 "+list.get(0));
        System.out.println();
        System.out.println("List in Raw");
        System.out.println("-----------------------------");
        for (String name : list) { // to print list in raw
            System.out.println(name);
        }
    }
}
