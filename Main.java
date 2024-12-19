import java.util.Scanner;

/**
   This program simulates a fishing game for the
   Fishing Game Simulation programming challenge.
*/

public class Main
{
   public static void main(String[] args)
   {
      // Named constants
      final int NUM_SIDES = 6;   // The number of sides on the die

      // Variables
      int total = 0;             // The total number of fishing points
      int points = 0;            // The number of fishing points
      String itemName = "";      // The name of the fishing item
      int itemNumber;            // The number of the fishing item
      char again;                // To hold the user's decision.
      String input;              // To hold a line of input

      // Create a six-sided Die object.
      Die die = new Die(NUM_SIDES);

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Display the introduction.
      System.out.println("Let's go fishing!");

      // Continue fishing as long as the user agrees to try again.
      do
      {
         // Roll the die and get the value.
         die.roll();
         itemNumber = die.getValue();

         // Determine what was caught by the user.
         switch(itemNumber)
         {
            case 1:
               itemName = "an old boot";
               points = 0;
               break;

            case 2:
               itemName = "a huge fish";
               points = 100;
               break;

            case 3:
               itemName = "a leaf";
               points = 1;
               break;

            case 4:
               itemName = "a little fish";
               points = 10;
               break;

            case 5:
               itemName = "a rock";
               points = 2;
               break;

            case 6:
               itemName = "weeds";
               points = 0;
               break;
         }

         // Display the item that was caught be the user.
         System.out.println("\nYou cast your line into the water...");
         System.out.println("You caught [" + itemName + "].");

         // Add the number of points to the total.
         total += points;

         // Ask the user if they would like to try fishing again.
         System.out.print("\nTry fishing again? (Y or N): ");
         input = keyboard.next();   // Read a string.
         again = input.charAt(0);   // Get the first char.

      } while (again == 'y' || again == 'Y');

      // Display the results.
      System.out.println("\nYou got a total of " + total + " fishing points.");

      // Display a message depending on the total fishing points earned.
      if (total >= 100)
      {
         System.out.println("Great Job! You are a natural!");
      }
      else if (total > 50 && total < 100)
      {
         System.out.println("That's some pretty fine fishing.");
      }
      else
      {
         System.out.println("The fish just aren't biting today. Maybe next time.");
      }
   }
}
