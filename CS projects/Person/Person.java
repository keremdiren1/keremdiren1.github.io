public class Person{
    private String name;
    private String email;
    private String phoneNumber;
    
    public Person(String n, String e, String pN){
        name = n;
        email = e;
        phoneNumber = pN;
    }

    public void Sus(int a){
        for (int i = 0; i < a; i++){
            System.out.println("Sus");
        }
    }

    public String toString(){
        return "Name: " + name + " | Mail: " + email + " | Phone Number: " + phoneNumber;
    }
}