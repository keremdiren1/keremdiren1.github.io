import java.util.*; //I learned how to input strings and learned the difference between & and &&.
public class Palindrama{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Letters: ");
        String palindrome = input.nextLine();
        String tempWord = "";
        String finalWord = "";
        String placeHolder = "";
        int random1 = 0;
        int random2 = 0;
        boolean pass = true;
        String tempPalindrome = "";




        
        for (int i = 0; i<palindrome.length()*8;i++){ //Increase the integer, the integer next to the length(), in this line if you don't get the answer you want or if the answer you get is incosistent.
            while (placeHolder.equals(tempWord)){
                while (random1 >= random2){
                    random1 = (int) (Math.random() * (palindrome.length()));
                    random2 = (int) (Math.random() * (palindrome.length())+1);
                }
                tempPalindrome = palindrome.substring(random1,random2);

                for (int k = 0; k < tempPalindrome.length();k++){
                    if (pass == true){
                        if (tempPalindrome.substring(k,k+1).equals(tempPalindrome.substring(tempPalindrome.length()-1-k,tempPalindrome.length()-k))){
                        }
                        else{
                            pass = false;
                        }
                        
                    }
                }
                if ((pass == true) & (tempWord.length() < tempPalindrome.length())){
                    tempWord = tempPalindrome;
                }
                pass = true;
                random1 = 0;
                random2 = 0;
            }
            if (finalWord.length() < tempWord.length()){
                finalWord = tempWord;
            }
            tempWord = placeHolder;
        }
    System.out.println("Longest Palindrome: " + finalWord);
    }
}