//5. Write a Java program to print all vowels in given string and count number of vowels and consonants present in given string

import java.util.Scanner;

class VowelCounter {
    private static boolean isVowel(char ch) {
    char lowercaseCh = Character.toLowerCase(ch);
    return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u';
    }

    // Method to print vowels and count vowels and consonants
     static void countVowelAndConso(String str) {
        int vowelCnt = 0;
        int consonantCnt = 0;

        System.out.println("Vowels in the given string:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
                vowelCnt++;
            } else if (Character.isLetter(ch)) {
                consonantCnt++;
            }
        }

        System.out.println("\nNumber of vowels: " + vowelCnt);
        System.out.println("Number of consonants: " + consonantCnt);
    }
}
class Count
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = in.nextLine();

        VowelCounter.countVowelAndConso(inputString);
        in.close();
    }
}
