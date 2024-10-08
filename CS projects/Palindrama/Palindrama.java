import java.util.*; //I learned how to input strings and learned the difference between & and &&.
public class Palindrama{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   //This line creates the object to use input.
        System.out.print("Enter Your Letters: ");
        String palindrome = input.nextLine();   //This line takes the value that was inputted.
        String tempWord = "";   //This line creates the tempWord variable.
        String finalWord = "";   //This line creates the finalWord variable.
        String placeHolder = "";   //This line creates the placeHolder variable.
        int random1 = 0;   //This line creates the random1 variable.
        int random2 = 0;   //This line creates the random2 variable.
        boolean pass = true;   //This line creates the pass variable.
        String tempPalindrome = "";   //This line creates the tempPalindrome variable.




  
        //Increase the integer, the integer next to the length() in line 19, if you don't get the answer you want or if the answer you get is incosistent.
        for (int i = 0; i<palindrome.length()*8;i++){   //This line creates a for loop that will loop as much as 8 times the number of letters the palindrome variable has.
            while (placeHolder.equals(tempWord)){   //This line creates a while loop that will loop until the placeHolder variable is different from the tempWord variable.
                while (random1 >= random2){   //This line creates a while loop that will loop as until the random1 variable is smaller than the random2 variable.
                    random1 = (int) (Math.random() * (palindrome.length()));   //This line sets a random value between 0 and the length of the palindrome variable, exclusive, to the random1 variable.
                    random2 = (int) (Math.random() * (palindrome.length())+1);   //This line sets a random value between 1 and the length of the palindrome variable, inclusive, to the random2 variable.
                }
                tempPalindrome = palindrome.substring(random1,random2);   //This line sets a value to the tempPalindrome variable. This value is a random substring which is a substring of the palindrome variable. This substring's start is decided by the random1 variable and the end is decided by the random 2 variable. Basically, it sets a random substring of the palindrome variable to the tempPalindrome variable.

                for (int k = 0; k < tempPalindrome.length();k++){   //This line creates a for loop that will repeat as much as the length of the tempPalindrome variable.
                    if (pass == true){   //This line creates an if that will activate if the pass variable is true.
                        if (tempPalindrome.substring(k,k+1).equals(tempPalindrome.substring(tempPalindrome.length()-1-k,tempPalindrome.length()-k))){   //This line creates an if that makes it so that it will activate if the letter that corresponds to the k integer and last digit minus the k integer is the same.
                        }
                        else{   //This line creates an else so that if the if at line 29 doesn't work, this will activate.
                            pass = false;   //This line sets the value of pass to false.
                        }
                        
                    }
                }
                //Basically, this for loop checks wherher the value of tempPalindrome is a palindrome or not.
                if (pass == true){   //This line creates an if that will work only if the pass value is true.
                    tempWord = tempPalindrome;   //This variable sets the value of tempPalindrome to the tempWord variable.
                }
                //Basically, this if sets the value of the tempPalindrome variable to the tempWord variable if the tempPalindrome variable has a value which is palindrome.
                pass = true;   //This line sets the true value to the pass variable.
                random1 = 0;   //This line sets the 0 value to the random1 variable.
                random2 = 0;   //This line sets the 0 value to the random2 variable.
                //Basically, these three lines make it so that the while loop works as intended if it's started again.
            }
            //Basically, this whole while loop finds a palindrome in the given inputted text.
            if (finalWord.length() < tempWord.length()){   //This line creates an if that will work if the finalWord variable has a smaller length than the tempWord variable.
                finalWord = tempWord;   //This line sets the value of tempWord variable to the finalWord variable.
            }
            //Basically, this if sets the value of the tempWord variable, which is a palindrome String, to the finalWord variable, which also holds a palindrome String value if it's not the first time this if is activated. If it's the first time this if is activated, it just sets the value of tempWord variable to the finalWord variable.
        tempWord = placeHolder;   //This line sets the value of place holder to the tempWord variable, which starts the while loop again.
        }
        //Basically, this whole for loop finds palindrome in the inputted as much as 8 times the length of the inputted text.
    System.out.println("Longest Palindrome: " + finalWord);   //This line prints the finalWord variable, which has the value of the longest palindrome that's inside the inputted text.
    }
}
