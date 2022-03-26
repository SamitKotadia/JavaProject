package switchcondition;

public class SwitchChar {
    public static void main(String[] args) {
        char myChar='z';
        String name;
        switch (myChar){
            case 'x':name="Samit";
                System.out.println(name);
            break;
            case 'y':name="Java";
                System.out.println(name);
                break;
            case 'z':name="Practice";
                System.out.println(name);
                break;
            default:
                System.out.println("invalid");

        }
    }
}
