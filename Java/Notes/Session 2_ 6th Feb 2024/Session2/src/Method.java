public class Method {

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        // void -> no return type
        // calculateScore -> method name
        // gameOver, score, levelCompleted, bonus -> arguments/parameters of the method
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus); // finalScore = finalScore +
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = 0;
        calculateScore(true,10000, 8, 2000);
        calculateScore(false,100, 3, 200);
        calculateScore(true,9000, 10, 2500);
        // calling a method
        // ways to pass an arguments
        // 1. pass variables name
        calculateScore(gameOver, score, levelCompleted, bonus);
        // 2. pass direct literal value
        calculateScore(true,10000, 8, 2000);
        // 3. mix of variable and literal value
        calculateScore(true, score, levelCompleted, 2000);

        // invalid ways
        //calculateScore(1000, true, 8, 2000);
        // calculateScore(true, 8, 1000, 2000); // logic error
        // default value in method are not allowed
        calculateScore(gameOver, score, levelCompleted, 2000);




    }

}
