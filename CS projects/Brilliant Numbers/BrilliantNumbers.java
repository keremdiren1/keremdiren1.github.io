import java.util.*;
public class BrilliantNumbers{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        for (int k = 1; k <= 5; k++){
            System.out.println("Enter a positive integer less than 2147483648.");
            System.out.print("Input " + k + ": ");
            int input = scan.nextInt();
            int num1 = 0;
            int num2 = 0;
            String answer = "";
            int basamakNum1 = 0;
            int basamakNum2 = 0;
            int tempNum;
            for (int i = 2; i < input ; i++){
                if (input % i == 0){
                    if (num2 != 0){
                        answer = "not brilliant";
                        break;
                    }
                    else if (num1 == 0){
                        num1 = i;
                    }

                    else{
                        num2 = i;
                    }
                }
            }
            tempNum = num1;
            while (tempNum != 0){
                basamakNum1 += 1;
                tempNum /= 10;
            }
            tempNum = num2;
            while (tempNum != 0){
                basamakNum2 += 1;
                tempNum /= 10;
            }
            if (num2 == 0 || basamakNum1 != basamakNum2 || answer.equals("not brilliant")){
                System.out.println(input + " is not a brilliant number.");
            }
            else{
                System.out.println(input + " is a brilliant number.");
            }
            System.out.println();
        }
    }
}