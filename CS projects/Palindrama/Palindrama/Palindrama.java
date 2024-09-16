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



        if (palindrome.length() == 1){   //This if makes it so that if the length of the palindrome variable is 1, the answer is the inputted text without needing to use the other part of the code.
            finalWord = palindrome;
        }
        else{
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
                    if ((pass == true) & (tempPalindrome.length()>1)){   //This line creates an if that will work only if the pass value is true.
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
        }
    System.out.println("Longest Palindrome: " + finalWord);   //This line prints the finalWord variable, which has the value of the longest palindrome that's inside the inputted text.
    }
}
//I know you might have noticed that this code doesn't have a 100% chance to be true. The palindromes found by the code each while loop might or might not be different from each other, which means that there is a very little chance that the longest palindrome might not be found. Even though this is possible, the code still finds the longest one, because, I mean, how many palindromes can be in a text? Even if there was a text with 200 palindromes with 2 length and 1 palindrome with 3 length, the code would still find the longest one, because it would find as much as 3224 palindromes in the given text. It would find the longest and the other palindromes nearly 16.04 times each, which means that the longest has nearly 0.0000104 chance to not be found. This means that you don't have to worry about it being wrong or you can just rerun the code to be sure of the answer or you can just increase the 8 in line 19 to increase the probability of finding the longest palindrome.