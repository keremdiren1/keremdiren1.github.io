import java.util.Scanner;
public class ArrayP1{
    private int[] array;


    public ArrayP1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Elements in Your Array:");
        int arrayLength = Integer.parseInt(input.nextLine());
        array = new int[arrayLength];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter your number at index " + i);
            String number = input.nextLine();
            boolean isNumber = true;
            for (int k = 0; k < number.length(); k++){
                if ("-0123456789".indexOf(number.substring(k,k+1)) == -1){
                    isNumber = false;
                }
            }
            if (isNumber){
                array[i] = Integer.parseInt(number);
            }
        }
        input.close();
    }

    public void analysis(){
        System.out.println("Smallest Element: " + smallest());
        System.out.println("Biggest Element: " + biggest());
        System.out.println("Sum Of Elements: " + sum());
        System.out.println("Average Of Elements: " + sum() * 1.0 / array.length);
    }

    private int sum(){
        int sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++){
            sumOfNumbers += array[i];
        }
        return sumOfNumbers;
    }

    public void sort(){
        int findSmallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array.length; k++){
                if (array[k] != 2003000405 && array[k] < findSmallest){
                    findSmallest = array[k];
                    smallestIndex = k;
                }
            }
            tempArray[i] = findSmallest;
            findSmallest = Integer.MAX_VALUE;
            array[smallestIndex] = 2003000405;
            printSortArray(tempArray);
        }
        array = tempArray;
    }

    private int smallest(){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    private int biggest(){
        int biggest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > biggest){
                biggest = array[i];
            }
        }
        return biggest;
    }

    public String toString(){
        String arr = "";
        for (int i : array){
            arr += i + ", ";
        }
        arr = arr.substring(0, arr.length() - 2);
        return "Array: " + arr;
    }

    private void printSortArray(int[] ar){
        String arr = "";
        for (int i : ar){
            arr += i + ", ";
        }
        arr = arr.substring(0, arr.length() - 2);
        System.out.println(arr);
    }
}
