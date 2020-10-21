/**
   This program allows the user to enter a girl's name, boy's name, 
   or both in order to find out if the entered names are within
   the most popular ones.
*/

import java.io.*; // I/O import statement
import java.util.Scanner; // Needed for the Scanner class
import java.util.ArrayList; // Needed for the Array class 
public class Name_Search
{
   public static void main(String[] args) throws IOException 
   {
      // ArrayList class object that stores girl's names
      ArrayList<String> girls = new ArrayList<String>();
      
      // ArrayList class object that stores boy's names
      ArrayList<String> boys = new ArrayList<String>();
      
      // Declare variables
      String girlName = " ";
      String boyName = " ";
      boolean girlNameIsPopular = false;
      boolean boyNameIsPopular = false;
      
      int choice;
      char letter; // The user's Y or N decision
          
      // Create Scanner class for keyboard input
      Scanner sc = new Scanner(System.in);
      
      // Call readNames method 
      girls = readNames("GirlNames.txt");
      boys = readNames("BoyNames.txt");
      
      // The do loop allows the menu to be displayed first
      do
      {
         printMenu();
         choice = sc.nextInt();
         
         switch(choice)
         {
         
            // Prompt user to enter girl name
            case 1:
               if(choice == 1)
               {
               System.out.println("                     ");
               System.out.println("Enter a girl's name: ");
               girlName = sc.next(); // Reads users girl name input
               girlName = girlName.toUpperCase();
               girlNameIsPopular = girls.contains(girlName);              
               }
               
               // Lets user know whether the girl's name entered is popular or not
               if(girlNameIsPopular)
               {
                   System.out.println("\"" + girlName + "\" is one of the most popular "
                                      + "names in girls.");
               }
               if((choice == 1) && !girlNameIsPopular)
               {
                  System.out.println("\"" +girlName + "\" is not one of the most "
                                     + "popular names in girls.");
                                                  
               }
               break;
               
            // Prompt user to enter boy name  
            case 2:
               if(choice == 2)
               {
               System.out.println("                     ");
               System.out.println("Enter a boy's name: ");
               boyName = sc.next(); // Reads users boy name input
               boyName = boyName.toUpperCase();
               boyNameIsPopular = boys.contains(boyName);
               }
               
               // Lets user know whether the boy's name entered is popular or not 
               if(boyNameIsPopular)
               {
                  System.out.println("\"" + boyName + "\" is one of the most popular "
                                     + "names in boys.");
                            
               }
               if((choice == 2) && !boyNameIsPopular)
               {
                  System.out.println("\"" +boyName + "\" is not one of the most "
                                     + "popular names in boys.");
               }
               break;
               
               // Prompt user to enter girl's and boy's name
               case 3:
                  if(choice == 3)
                  {
                  System.out.println("                     ");
                  System.out.println("Enter a girl's name: ");
                  girlName = sc.next(); // Reads users girl name input
                  girlName = girlName.toUpperCase();
                  girlNameIsPopular = girls.contains(girlName);
                  System.out.println("                     ");
                  System.out.println("Enter a boy's name: ");
                  boyName = sc.next(); // Reads users boy name input
                  boyName = boyName.toUpperCase();
                  boyNameIsPopular = boys.contains(boyName);
                  }
              
               // Lets user know whether the girl's name entered is popular or not
               if(girlNameIsPopular)
               {
                   System.out.println("\"" + girlName + "\" is one of the most popular "
                                      + "names in girls.");
               }
               if((choice == 3) && !girlNameIsPopular)
               {
                  System.out.println("\"" + girlName + "\" is not one of the most "
                                     + "popular names in girls.");
                                                  
               }
               
               // Lets user know whether the boy's name entered is popular or not 
               if(boyNameIsPopular)
               {
                  System.out.println("\"" + boyName + "\" is one of the most popular "
                                     + "names in boys.");
                            
               }
               if((choice == 3) && !boyNameIsPopular)
               {
                  System.out.println("\"" +boyName + "\" is not one of the most "
                                     + "popular names in boys.");
               }
               break;                 
               default:
               System.out.println("You did not enter a valid choice.");
         } 
         sc.nextLine(); // Consume the new line
         System.out.println("\nDo you want to exit the program (Y/N)?");
         String answer = sc.nextLine();
         letter = answer.charAt(0);
      }
         while(letter != 'Y' && letter != 'y');
         System.out.println("\nThank you for using our name search menu.\n" +
                            "Wishing nothing short of happiness, joy and\n" + 
                            "health for both yourself and your newborn!");
   }
   
  /**
     The printMenu method prints the menu for the user to choose from.
  */
   
   public static void printMenu()
   {
      // Prompt user to enter a name
      System.out.println("Welcome!\nThis is the name search menu: ");
      System.out.println("                                        ");
      System.out.println("1. Search for girl name");
      System.out.println("2. Search for boy name");
      System.out.println("3. Search for both gender names");
      System.out.println("\nEnter your choice from the above selection: ");
   }
      
      /**
         The readNames method reads the names from the input file entered
         as an ArrayList. Then it returns that ArrayList as a result.
      */
      
      public static ArrayList<String> readNames(String fileName) throws IOException
      {
         // ArrayList class object that stores names
         ArrayList<String> names = new ArrayList<String>();
         
         // Create a Scanner class object that reads file data
         Scanner inputFile = new Scanner(new File(fileName));
         
         // Declare variables
         String name;
         
         // Priming read that reads the first line of the file
         while(inputFile.hasNextLine())
         {
         
            // Read name from file
            name = inputFile.nextLine();
            
            // Add name to ArrayList
            names.add(name.toUpperCase());
         }        
         inputFile.close(); //// Closes the input file
         return names; // returns the name list
     }
}

         
  
            
    

               
            



