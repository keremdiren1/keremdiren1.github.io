public class DogDeneme{
    public static void main(String[] args){
        Dog köpek1 = new Dog(5);
        System.out.println(köpek1);
        Dog köpek2 = new Dog(5);
        System.out.println(köpek2);

        if (köpek1.equals(köpek2)){
            System.out.println("yee");
        }
        else{
            System.out.println("noo :(");
        }
    }
}