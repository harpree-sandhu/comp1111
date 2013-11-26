package p1;
//***************************************************************
//StringManips.java
//
//Test several methods for manipulating String objects
//***************************************************************
import java.util.Scanner;
public class StringManip
{
    public static void main (String[] args)
    {
        String phrase = new String ("This is a String test.");
        int phraseLength = 0; // number of characters in the phrase String
        int middleIndex = 0;  // index of the middle character in the String
        String middle3 = new String();
        String city;

        String state;
        Scanner input = new Scanner(System.in);
        String firstHalf;  // first half of the phrase String
        String secondHalf; // second half of the phrase String

        String switchedPhrase; //a new phrase with original halves switched
        // compute the length and middle index of the phrase

        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2); 
        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        // concatenate the firstHalf at the end of the secondHalf

        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(' ','*');
        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
                " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
                phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println();

        System.out.println("Middle 3 characters : " + middle3); 
        System.out.print("Enter your city: ");

        city = input.nextLine();

        System.out.print("Enter your state: ");

        state = input.nextLine();

        String hometown = state.toUpperCase() + city.toLowerCase() + state.toUpperCase();

        System.out.println ("Hometown: " + hometown);
    }
}