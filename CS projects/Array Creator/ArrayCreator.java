import java.util.Scanner;
public class ArrayCreator{
    private double[] array;


    public void createArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Elements in Your Array:");
        int arrayLength = input.nextInt();
        array = new double[arrayLength];
        input.nextLine();
        for (int i = 0; i < array.length; i++){
            System.out.println("Do you want to continue? (yes / no)");
            if (input.nextLine().equals("no")){
                break;
            }
            System.out.println("Enter your number at index " + i);
            array[i] = input.nextDouble();
            input.nextLine();
        }
    }

    public double sum(){
        double sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++){
            sumOfNumbers += array[i];
        }
        return sumOfNumbers;
    }

    public void sort(){
        double findSmallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        double[] tempArray = new double[array.length];
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array.length; k++){
                if (array[k] != 0.000200030001 && array[k] < findSmallest){
                    findSmallest = array[k];
                    smallestIndex = k;
                }
            }
            tempArray[i] = findSmallest;
            findSmallest = Integer.MAX_VALUE;
            array[smallestIndex] = 0.000200030001;
            System.out.println(printSortArray(tempArray));
        }
        array = tempArray;
    }

    public double smallest(){
        double smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public double biggest(){
        double biggest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > biggest){
                biggest = array[i];
            }
        }
        return biggest;
    }

    public String toString(){
        String arr = "";
        for (double i : array){
            arr += i + ", ";
        }
        arr = arr.substring(0, arr.length() - 2);
        return "Array: " + arr;
    }

    public String printSortArray(double[] ar){
        String arr = "";
        for (double i : ar){
            arr += i + ", ";
        }
        arr = arr.substring(0, arr.length() - 2);
        return arr;
    }
}