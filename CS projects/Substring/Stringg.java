public class Stringg{
    public String str;

    public Stringg(String s){
        str = s;
    }

    public String substring(int a, int b){
        String newStr = "";
        if (a < 0 || a > b || b > str.length() || a > str.length() || b < 0){
            System.out.println("Error");
        }
        else{
            for (int i = a; i < b; i++){
                for (int k = 0; k < 65536; k++){
                    if (str.indexOf(Character.toString((char) k)) == i){
                        newStr = newStr + Character.toString((char) k);
                    }
                }
            }
        }
        
        return newStr;
    }

    public static void main(String[] args){
        Stringg aa = new Stringg("abcdef");
        System.out.println(aa.substring(2,4));
    }
}