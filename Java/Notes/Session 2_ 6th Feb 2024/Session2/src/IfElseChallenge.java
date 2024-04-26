public class IfElseChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = 0;

        if(gameOver){
            finalScore += (levelCompleted * bonus); // finalScore = finalScore +
            System.out.println("Your final score was " + finalScore);
        }
        // you are defining new variable
        boolean newgameOver = true;
        int newscore = 800;
        int newlevelCompleted = 5;
        int newbonus = 100;
        int newfinalScore = 0;

        if(newgameOver){
            newfinalScore += (newlevelCompleted * newbonus); // finalScore = finalScore +
            System.out.println("Your final score was " + newfinalScore);
        }
        // overwriting the existing varibale
        gameOver = true;
        score = 5000;
        levelCompleted = 10;
        bonus = 500;
        finalScore = 0;

        if(gameOver){
            finalScore += (levelCompleted * bonus); // finalScore = finalScore +
            System.out.println("Your final score was " + finalScore);
        }
        // method



    }
}
