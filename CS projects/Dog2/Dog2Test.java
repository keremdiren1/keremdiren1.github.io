public class Dog2Test{
    public static void main(String[] args){
        Dog2 köpek1 = new Dog2("insan");
        Dog2 köpek2 = new Dog2("Çorba");

        System.out.println(köpek1.getBreed());
        System.out.println(köpek2.getBreed());
        System.out.println(Dog2.getDogNumber());
    }
}