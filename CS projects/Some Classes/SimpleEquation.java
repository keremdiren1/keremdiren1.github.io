public class SimpleEquation{
    private int a;
    private int b;

    public SimpleEquation(){
        a = 1;
        b = 1;
    }


    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public void setA(int aa){
        if (aa > 0){
            a = aa;
        }
    }

    public void setB(int bb){
        if (bb > 0){
            b = bb;
        }
    }

    public int getY(int x){
        return a*x + b;
    }
}