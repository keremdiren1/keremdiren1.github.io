public class Dog2{
    private String breed;
    private static int dogNumber;

    public Dog2(String b){
        breed = b;
        dogNumber += 1;
    }


    public static int getDogNumber(){
        return dogNumber;
    }

    public String getBreed(){
        return breed;
    }
}