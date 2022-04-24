package encapsulationClass;

public class GetAndSet {
    private String name; // Created global var // "My Name is Samit" is assigning to global ver

    public String getName(){ //when we call this method form encapsulation class its assign "My Name is Samit" because of retun type
        return name;
    }

    public void setName(String name){ // form Encapsulation class, string name set to "My Name is Samit"
    this.name = name; // This function always belongs to global var
        // form local string name its assign value to global var
    }
}
