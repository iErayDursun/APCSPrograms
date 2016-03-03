//Listing 10.11
//********************************************************************
//  Guests.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a HashSet.
//********************************************************************

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Guests
{
   //-----------------------------------------------------------------
   //  Creates a set of guests’ names and allows the user to
   //  check if a name is in the set.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String name;
      Scanner scan = new Scanner (System.in);
      Set<String> guestSet = new HashSet<String>();

      guestSet.add("Paul");
      guestSet.add("Wendy");
      guestSet.add("Jared");
      guestSet.add("Eric");
      guestSet.add("Ayame");
      guestSet.add("Ian");
      guestSet.add("Isobel");
      guestSet.add("Hakem");

      System.out.print ("Enter a name: ");
      name = scan.nextLine();

      if (guestSet.contains(name))
         System.out.println (name + " is on the guest list.");
      else
         System.out.println (name + " is not on the guest list.");
   }
} 