public class ArrayP2{

    public static int sum(int[] array){
        int sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++){
            sumOfNumbers += array[i];
        }
        return sumOfNumbers;
    }

    public static void minNmax(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Biggest Element: " + max);
        System.out.println("Smallest Element: " + min);
    }

    public static double average(int[] array){
        double average = 0.0;
        for (int i = 0; i < array.length; i++){
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    public static void count(int[] array){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                positive += 1;
            }
            if (array[i] < 0){
                negative += 1;
            }
            else{
                zero += 1;
            }
        }
        System.out.println("Positive Element Number: " + positive);
        System.out.println("Negative Element Number: " + negative);
        System.out.println("Zero Element Number: " + zero);
    }

    public static int[] reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - (i+1)];
        }
        return reversedArray;
    }

    public static int secondLargest(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] == max){
                array[i] = min;
            }
        }

        int newMax = array[0];
        for (int i = 0; i < array.length; i++){
            if (newMax < array[i]){
                newMax = array[i];
            }
        }
        return newMax;
    }

    public static void frequency(int[] array){
        int frequency = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != 300902001){
                int currentNumber = array[i];
                for (int k = 0; k < array.length; k++){
                    if (array[k] == currentNumber){
                        frequency += 1;
                    }
                }
                System.out.println("The number " + currentNumber + " appears " + frequency + " time(s).");
                for (int p = 0; p < array.length; p++){
                    if (array[p] == currentNumber){
                        array[p] = 300902001;
                    }
                }
                frequency = 0;
            }    
        }
    }

    public static void isSorted(int[] array){
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++){
            if (!(array[i] < array[i+1])){
                sorted = false;
            }
        }
        if (sorted){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }

    public static int[] removeDuplicates(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int k = i+1; k < array.length; k++){
                if (array[k] == array[i]){
                    array[k] = 300902001;
                    count += 1;
                }
            }
        }
        int[] newArray = new int[array.length - count];
        int place = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != 300902001){
                newArray[place] = array[i];
                place += 1;
            }
        }
        return newArray;
    }

    public static void bubbleSort(int[] array){
        int[] newArray = sort(array);
        String theArray = "{";
        for (int i = 0; i < newArray.length; i++){
            theArray += newArray[i] + ", ";
        }
        theArray = theArray.substring(0, theArray.length() - 2) + "}";
        System.out.println(theArray);
    }

    public static int[] sort(int[] array){
        int findSmallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array.length; k++){
                if (array[k] != 2003000405 && array[k] < findSmallest){
                    findSmallest = array[k];
                    smallestIndex = k;
                }
            }
            newArray[i] = findSmallest;
            findSmallest = Integer.MAX_VALUE;
            array[smallestIndex] = 2003000405;
        }
        return newArray;
    }

    public static int[] arrayRotate(int[] array, int n){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[(i - n) % array.length] = array[i];
        }
        return newArray;
    }

    public static void compare(int[] array1, int[] array2){
        boolean same = true;
        if (array1.length != array2.length){
            System.out.println();
        }
        else{
            for(int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    same = false;
                }
            }
        }
        if (same){
            System.out.println("The arrays are equal.");
        }
        else{
            System.out.println("The arrays are equal.");
        }
    }

    public static void mode(int[] array){
        String mode = "";
        int amountOfMode = 0;
        for (int i = 0; i < array.length; i++){
            int currentAmount = 0;
            for (int k = 0; k < array.length; k++){
                if (array[k] == array[i]){
                    currentAmount += 1;
                }
            }

            if (currentAmount > amountOfMode){
                amountOfMode = currentAmount;
                mode = array[i] + ", ";
            }
            else if (currentAmount == amountOfMode){
                mode += array[i] + ", ";
            }
        }
        if (mode.length() > 0){
            mode = mode.substring(0, mode.length() - 2);
        }
        System.out.println("Mode(s): " + mode);
    }

    public static String missingNumbers(int[] array){
        int differenceBetween = array[0] - array[1];
        String missing = "";
        for (int i = 0; i < array.length-1; i++){
            if (array[i+1] != array[i] + differenceBetween){
                missing += array[i+1] + ", ";
                array[i+1] = array[i] + differenceBetween;
            }
        }
        if (missing.length() != 0){
            missing = missing.substring(0, missing.length() - 2);
        }
        return missing;
    }

    public static double median(int[] array){
        int[] sorted = sort(array);
        double median;
        if (sorted.length % 2 == 0){
            median = (sorted[sorted.length / 2] + sorted[sorted.length / 2 - 1]) * 1.0 / 2;
        }
        else{
            median = (sorted[sorted.length / 2]);
        }
        return median;
    }

    public static int[] mergeArray(int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length + array2.length - 1; i++){
            if (i < array1.length){
                mergedArray[i] = array1[i];
            }
            else{
                mergedArray[i] = array2[i - array1.length];
            }
        }
        int[] finalArray = sort(mergedArray);
        return finalArray;
    }

    public static void primeNumbers(int[] array){
        int[] newArray = sort(array);
        boolean prime = true;
        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] > 0){
                for (int k = 0; k < i; k++){
                    if (newArray[k] > 0 && newArray[i] * 1.0 % newArray[k] != 0){
                        prime = false;
                    }
                }
                if (prime){
                    System.out.println(newArray[i] + " is prime.");
                }
                prime = true;
            }
        }
    }

    public static int longestSequence(int[] array){
        int longestLength = 0;
        for (int i = 0; i < array.length; i++){
            for (int k = i+1; k < array.length; k++){
                int[] theSequence = {array[i]};
                for(int p = k; p < array.length; p++){
                    if (array[p] > theSequence[theSequence.length - 1]){
                        int[] newSequence = new int[theSequence.length + 1];
                        for (int j = 0; j < theSequence.length; j++){
                            newSequence[j] = theSequence[j];
                        }
                        newSequence[theSequence.length] = array[p];
                        theSequence = newSequence;
                    }
                }
                if (longestLength < theSequence.length){
                    longestLength = theSequence.length;
                }
            }
            
        }
        return longestLength;
    }

    public static int[] arrayRotateInPlace(int[] array, int n){
        for (int t = 0; t < n; t++){
            int tempInt = array[array.length - 1];
            for (int i = 0; i < array.length; i++){
                int newValue = tempInt;
                tempInt = array[i];
                array[i] = newValue;
            }
        }
        return array;
    }

    public static void pairsWithDifference(int[] array, int n){
        String numbers = "";
        for (int i = 0; i < array.length; i++){
            for (int k = i+1; k < array.length; k++){
                if (Math.abs(array[i] - array[k]) == n){
                    numbers += "(" + array[i] + " and " + array[k] + "), ";
                }
            }
        }
        if (numbers.length() != 0){
            numbers = numbers.substring(0, numbers.length() - 2);
        }
        System.out.println(numbers);
    }

    public static boolean binarySearch(int[] array, int n){
        array = sort(array);
        while (array.length > 1){
            if (array[array.length / 2] > n){
                int[] newArray = new int[array.length / 2];
                for (int i = 0; i < array.length / 2; i++){
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            else if (array[array.length / 2] < n){
                int[] newArray = new int[array.length / 2];
                for (int i = array.length / 2; i < array.length; i++){
                    newArray[i - array.length] = array[i];
                }
                array = newArray;
            }
            else{
                return true;
            }
        }
        if (array.length > 0 && array[0] == n){
            return true;
        }
        return false;
    }

    public static int[] intersection(int[] array1, int[] array2){
        int[] intersection;
        int[] longest;
        int[] shortest;
        int[] index;
        if (array1.length > array2.length){
            longest = array1;
            shortest = array2;
        }
        else{
            longest = array2;
            shortest = array1;
        }
        index = new int[longest.length];
        intersection = new int[longest.length];
        for (int i = 0; i < longest.length; i++){
            for (int k = 0; k < shortest.length; k++){
                if (longest[i] == shortest[k] && longest[i] != 300209001){
                    index[i] = 1;
                    intersection[i] = longest[i];
                    longest[i] = 300209001;
                    shortest[k] = 300209001;
                }
            }
        }
        int numberOf1 = 0;
        for (int i = 0; i < index.length; i++){
            if (index[i] == 1){
                numberOf1 += 1;
            }
        }
        int[] finalIntersection = new int[numberOf1];
        int currentIndex = 0;
        for (int i = 0; i < index.length; i++){
            if (index[i] == 1){
                finalIntersection[currentIndex] = intersection[i];
                currentIndex += 1;
            }
        }
        return finalIntersection;
    }
}