public class Deneme{
    public static void main(String[] args){
        Person kişi1 = new Person("Kerem", "kerem.diren@hisarschool.k12.tr", "05307272281");
        Person kişi2 = new Person("Han", "han.ferik@hisarschool.k12.tr", "05556101304");
        Person kişi3 = new Person("Biri", "biri.nee@hisarschool.k12.tr", "00000000000000000000000000000000000000000");

        kişi1.Sus(15);
        System.out.println();
        kişi2.Sus(3);
        System.out.println();
        kişi3.Sus(8);
        System.out.println();
        System.out.println();
        System.out.println(kişi1);
        System.out.println(kişi2);
        System.out.println(kişi3);
    }
}