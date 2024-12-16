public class Dog3{
    private String breed;
    private int age;

    public Dog3(String b, int a){
        breed = b;
        age = a;
    }


    public void updateInfo(String b, int a){
        System.out.println("Updating info.");
        breed = b;
        age = a;
    }

    public void printInfo(){
        System.out.println("Breed: " + breed + " | Age: " + age);
    }

    public void toAnotherMethod(){
        System.out.println("Passing to helper method.");
        Breed(this);
    }
    public void Breed(Dog3 d){
        System.out.println("Dog Breed: " + d.breed);
    }
}