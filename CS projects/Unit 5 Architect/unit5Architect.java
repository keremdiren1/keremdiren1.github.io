public class unit5Architect{
    private String str;

    public unit5Architect(String s){
        str = s;
    }


    public int count(){
        int n = 0;
        str += Character.toString((char) 5000);
        for (int i = 0; !(str.substring(i, i+1).equals(Character.toString((char) 5000))); i++){
            n = i + 1;
        }
        str = str.substring(0, str.length() - 1);
        return n;
    }

    public void reverse(){
        String newStr = "";
        for (int i = str.length() - 1; i > -1; i--){
            newStr += str.substring(i, i+1);
        }
        str = newStr;
    }

    public void divide(String strAdd){
        str = str.substring(0, str.length() / 2) + strAdd + str.substring(str.length() / 2);
    }

    public String caesarCipher(int change){
        String newWord = "";
        for (int i = 0; i < str.length(); i++){
            newWord += Character.toString((char) ((Character.getNumericValue(str.charAt(i)) - 10 + change + 26) % 26 + 97));
        }
        return newWord;
    }

    public static void main(String[] args){
        unit5Architect aa = new unit5Architect("aaazzz");
        System.out.println(aa.str);
        System.out.println(aa.count());
        aa.reverse();
        System.out.println(aa.str);
        aa.divide("iii");
        System.out.println(aa.str);
        System.out.println(aa.caesarCipher(-5));
    }
}
