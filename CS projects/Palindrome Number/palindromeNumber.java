import java.util.*;   //I learned how to input integers and how to reverse numbers.
public class palindromeNumber{
    public static String num(int a){
        boolean pass = true;
        for (int i = 0; i<3 ; i++){
            if (a / 1000 > 0){
                a += a/1000 + a / 100 % 10 * 10 + a / 10 %10 * 100 + a % 10 * 1000;
            }
            else{
                a += a/100 + a /10 % 10 * 10 + a % 10 * 100;
            }
        }

        for (int i = 0; i<(""+a).length();i++){
            if (pass == true){
                if (("" + a).substring(i,i+1).equals(("" + a).substring((""+a).length()-1-i,(""+a).length()-i))){
                }
                else{
                    pass = false;
                }
            }
        }
        return ("" + pass).toUpperCase();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers which are 3 digits:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        String num1Pass = "";
        String num2Pass = "";
        String num3Pass = "";
        String num4Pass = "";
        String num5Pass = "";

        num1Pass = num(num1);
        num2Pass = num(num2);
        num3Pass = num(num3);
        num4Pass = num(num4);
        num5Pass = num(num5);

        System.out.println(num1Pass);
        System.out.println(num2Pass);
        System.out.println(num3Pass);
        System.out.println(num4Pass);
        System.out.println(num5Pass);
    }
}