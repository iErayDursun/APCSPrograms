//Listing 10.5
//********************************************************************
//  VocabTester.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a map.
//********************************************************************

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class VocabTester
{
   //-----------------------------------------------------------------
   //  Creates a list of vocabulary words and tests the user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String guess;
      Scanner scan = new Scanner (System.in);
      Map<String,String> vocabWords = new TreeMap<String,String>();

      vocabWords.put ("initialize",
                      "to give a starting value to a variable");
      vocabWords.put ("token",
                      "part of a string defined by a set of delimiters");
      vocabWords.put ("bit",
                      "a binary digit, either 0 or 1");
      System.out.println ("Welcome to the vocabulary tester!");
      System.out.println ("For each definition, tell me the word.");
      System.out.println();
      for (String word : vocabWords.keySet())
      {
         System.out.println ("Definition: " + vocabWords.get(word));
         System.out.print ("What is the word? ");

         guess = scan.nextLine();

         if (guess.equals(word))
            System.out.println("That’s right!");
         else
            System.out.println("Sorry, the answer was " + word);

         System.out.println();
      }
   }
} 