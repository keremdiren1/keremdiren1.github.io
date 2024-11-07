import java.util.*;
public class Basamak{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int basamakNum = 0;
        int toplamBasamak = 0;
        while (number != 0){
            basamakNum += 1;
            System.out.println(basamakNum + ". basamak " + number % 10);
            toplamBasamak += number % 10;
            number /= 10;
        }
        System.out.println("Basamak Sayısı: " + basamakNum +"\nBasamakların Toplamı: " + toplamBasamak);
    }
}