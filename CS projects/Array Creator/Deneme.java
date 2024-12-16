public class Deneme{
    public static void main(String[] args){
        ArrayCreator array = new ArrayCreator();
        array.createArray();
        array.sort();
        System.out.println(array);
        System.out.println(array.biggest());
        System.out.println(array.smallest());
        System.out.println(array.sum());
    }
}