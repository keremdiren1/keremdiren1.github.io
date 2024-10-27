import java.util.Scanner;

public class CodeEampleU3{
    public static void main(String[] args){
        int a = 5;
        if (a == 13){
            System.out.println("no");   //This code wouldn't activate because the if statement this code belongs to does not start since the statement int the () is not true.
        }
        if (a == 5){
            System.out.println("yes");   //This code would activate because the if statement this code belongs to starts since the statement int the () is true.
        }

        //The ==, !=, >=, <=, >, and < operators are used to compare the things at each side of themselves. These mean equal to, not equal to, bigger or equal to, smaller than or equal to, bigger than, and smaller than, respectively.

        if (a == 4){
            System.out.println("no");   //This wont activate.
        }
        else if (a == 6){
            System.out.println("maybe");   //This line will be checked if the if statement before this doesn't acitivate.
        }
        else{
            System.out.println("yes");   //This line will be activated if the if statement and else if statement before this doesn't acitivate.
        }

        System.out.println(!true);   //This line print false because the ! symbol turns enything after it to the opposite.
        System.out.println(((3 < a) && (a >= 5)));   //This boolean statement turns into (3 >= a) || (a < 5).

        int n;
        if (false && n+5 < 3){   //This is the example of a short circuit. Since the first condition of this boolean statement is false, the && doesn't look onto the right side which would have given an error since the program is trying to add 5 with a valueless variable. Since there is a short circuit, this doesn't give an error.
            System.out.println("naber");
        }

        CodeExampleU3 aa = new CodeEampleU3();
        CodeExampleU3 bb = new CodeEampleU3();
        CodeExampleU3 cc = aa;
        if (aa == bb){   //This will not print out anything since == is used to check the place address of the object when using it with objects.
            System.out.println("oii");
        }
        if (aa == cc){   //This will print out nee since aa and bb reference the same address, the same object.
            System.out.println("nee");
        }
        if (aa.equals(bb)){   //This will print out haa since .equals() method checks the values of the objects when using it with objects.
            System.out.println("haa");
        }
        //This is also the case for String type variables.
    }
}