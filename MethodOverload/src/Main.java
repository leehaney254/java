public class Main {
    public static void main(String[] args){
      int newScore =  calculateScore("Tim", 50);
      System.out.println("New score is " + newScore);
      calculateScore(75);
      calculateScore();
    }

    public static void calculateScore(){
        System.out.println("Unnamed player, unset score");
    }
    public static int calculateScore(int score){
        calculateScore("Anonymus ", score);
        return score * 100;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored " + score + " points");
        return score * 100;
    }
}
