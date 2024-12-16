public class Player{
    private String name;
    private int score;
    private static int highestScore;

    public Player(String n, int s){
        name = n;
        score = s;
        if (Player.highestScore < score){
            Player.highestScore = score;
        }
    }


    public void add(int n){
        if (n > 0){
            score += n;
        }
    }

    public boolean winning(){
        if (Player.highestScore == score){
            return true;
        }
        return false;
    }

    public String toString(){
        return name + "| " + score;
    }
}