public class ArrayP2Test{
    public static void main(String[] args){
        int[] testScores = {98, 81, 54, 3, 67, 78, 91, 88};
        ArrayP2.minNmax(testScores);
        System.out.println("Sum: " + ArrayP2.sum(testScores));
        System.out.println("Average: " + ArrayP2.average(testScores));
    }
}