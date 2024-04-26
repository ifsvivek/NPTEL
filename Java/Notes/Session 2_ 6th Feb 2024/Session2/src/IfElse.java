public class IfElse {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <=5000) {
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("Got Here");
        }

        if (score < 5000 && score > 1000) {
            System.out.println(" Your score was less than or equal to 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }


    }
}
