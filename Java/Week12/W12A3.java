/*
Write a program that analyzes a given text and provides the following information:

§ Number of words: The total number of words in the text.

§ Longest word: The longest word found in the text.

§ Vowel count: The total number of vowels (a, e, i, o, u) in the text.

Take the following assumptions regarding the input:

§ The input will only contain lowerspace characters[a-z] and spaces.

§ The last word will not end with a space nor with any special character.

You need to print exactly as shown in the test case.

Do not print anyting else while taking input.
*/

// from here
import java.util.Scanner;

public class W12_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        String[] words = text.split(" ");
        int wordCount = words.length;

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int vowelCount = 0;
        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Vowel count: " + vowelCount);
    }
}
// till here