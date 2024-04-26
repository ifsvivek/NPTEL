public class FirstClass {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == true) // = assignment operator, == equality operator
            System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens");
        int topScore = 80;
        if (topScore <= 100) { //best practices - to create a code block for if-else - improves readability
//codeblock
            System.out.println("You got the highscore");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) { // && - Logical AND   - work (true && true)
            System.out.println("Greater than second top score and less than 100");
        }
//operator precedence
// () - parantheses -> highest precedence
// */%
// +-
//        int var1, var2, var3;
//        var3 = var1 + var2 * 100;
//        var3 = (var1 + var2) * 100; // this is what we want
//        var3 = var1 + (var2 * 100); // this is how compiler will read
//        var3 = ((4 % -6) % 5); // the expression will be evaluated from left to right
        // right -> left
        // left -> right
        if ((topScore > 90) || (secondTopScore <= 90)) { // && - Logical AND   - work ( false && true)
            System.out.println("Either or both of the conditions are true");
        }

        //ternery operator - conditional operator (? :)
        // ? if : else
        String makeOfCar = "Tata";
        boolean isDomestic = (makeOfCar == "Tata") ? true : false;
        // () - condition
        // ? value = if the condition is true
        // : value = else (the condition is false
        System.out.println(isDomestic);
        System.out.println((makeOfCar == "Tata") ? true : false);


    }
}
