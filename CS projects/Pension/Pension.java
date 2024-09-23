import java.util.*;
public class Pension{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double balance;
        double deducted;
        double percentage;
        int year;

        for (int i = 0; i < 5; i++){
            year = -1;
            balance = -1.0;
            percentage = -1;
            deducted = -1.0;
            System.out.println("What is your balance? (double)");
            balance = input.nextDouble();
            if (balance != -1.0){
                System.out.println("What amount is deducted from your balance? (double)");
                deducted = Math.abs(input.nextDouble());
                if (deducted != -1.0){
                    System.out.println("What percentage do you add to your balance? (double)");
                    percentage = input.nextDouble();
                    if (percentage != -1.0){
                        System.out.println("How many years does this continue? (int)");
                        year = input.nextInt();
                    }
                }
            }
            for (int a = 0; a < year; a++){
                balance -= deducted;
                balance += balance / 100 * percentage;
            }
            if (balance >= 0){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
            System.out.println();
        }
    }
}
