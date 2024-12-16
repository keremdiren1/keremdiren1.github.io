public class Name{
    public String firstName;
    public String lastName;

    public Name(String fN){
        firstName = fN;
    }

    public Name(String fN, String lN){
        firstName = fN;
        lastName = lN;
    }


    public String monogram(){
        return firstName.substring(0, 1) + lastName.substring(0, 1);
    }

    public int size(){
        return firstName.length() + lastName.length();
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}