/**
  The TriviaGame class serves to demonstrate 
  the methods of the Question class. Which 
  assimilates a simple trivia game for two players. 
  Where each player gets five questions, a point is 
  given for every right answer and whoever has the   
  highest number of points wins.
*/

import java.util.ArrayList; // Needed for the ArrayList class
import java.util.Collections; // Needed for the Collections class
import java.util.Random; // Needed for the Random class
import java.util.Scanner; // Needed for the Scanner class

public class TriviaGame
{
   private ArrayList<Question> questionSet;
              
      public TriviaGame()
      {
         // Instantiates 10 questions with 4 possible answers for each
         questionSet = new ArrayList<Question>();
         String triviaQuestion = "Where is the mitral valve located in the heart?";
         String[] possibleAnswer ={"Between the right atrium and the rigth ventricle", 
         "Between the left chamber and the right chamber", 
         "Between the left atrium and the left ventricle",
         "Inside of the pulmonary trunk"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer,
         "Between the left atrium and the left ventricle")); 
         triviaQuestion = "How many flaps/cusps does the mitral valve normally have?";
         possibleAnswer = new String[]{"2", "1", "0", "3"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer,"2"));
         triviaQuestion = "What heart chamber has the thickest wall?";
         possibleAnswer = new String[]{"The right ventricle", "The left ventricle",
         "The right atrium", "The left atrium"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "The left ventricle"));
         triviaQuestion = "Which vessel has the highest content of nutrients after a meal?";
         possibleAnswer = new String[]{"Hepatic artery", "Splenic vein", "Pancreaticoduodenal veins", 
         "Hepatic Portal vein"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "Hepatic Portal vein"));
         triviaQuestion = "What heart chamber receives oxygenated blood from the lungs?";
         possibleAnswer = new String[]{"The left atrium", "The right atrium", "Septum", 
         "Vena Cava"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "The left atrium"));
         triviaQuestion = "Which brain lobe is the largest?";
         possibleAnswer = new String[]{"occipital lobe", "Parietal lobe", "Frontal lobe", 
         "Temporal lobe"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "Frontal lobe"));
         triviaQuestion = "Which of the following is NOT part of the brainstem?";
         possibleAnswer = new String[]{"Pons", "Medulla Oblongata", "Midbrain", 
         "Cerebellum"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "Cerebellum"));
         triviaQuestion = "Where is the cerebellum located?";
         possibleAnswer = new String[]{"On top of the brainstem", "Next to the pituitary gland", 
         "Between the frontal and temporal lobe", "Between the thalamus and hypothalamus"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "On top of the brainstem"));
         triviaQuestion = "Which of the following lobes is responsible for vision and color perception?";
         possibleAnswer = new String[]{"Parietal lobe", "Occipital lobe", "Frontal lobe", "Temporal lobe"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "Occipital lobe"));
         triviaQuestion = "Which of the following triggers the fight or flight response?";
         possibleAnswer = new String[]{"Parasympathetic Nervous System", "Somatic Nervous System", 
         "Peripheral Nervous System", "Sympathetic Nervous System"};
         questionSet.add(new Question(triviaQuestion, possibleAnswer, "Sympathetic Nervous System"));
         Collections.shuffle(questionSet, new Random()); // Shuffles questions and answers
      }
           
      public void start()
      {
         // Create Scanner class for keyboard input
         Scanner keyboard = new Scanner(System.in);
         
         // Initialize variables
         String player1Name;
         String player2Name;
         int player1NumCorrect = 0;
         int player2NumCorrect = 0;
         int player1Score = 0;
         int player2Score = 0;
         
         // Prompt player 1 for Name
         System.out.println("Please enter your name player 1: ");
         player1Name = keyboard.next(); // Reads users name input
         
         // Display questions for player 1
         System.out.println("                          ");
         System.out.println("Welcome to the Trivia Game " +player1Name+ "!\n"
                            + "Please answer the following questions: \n");
         for (int triviaQuestion = 0; triviaQuestion < questionSet.size() / 2; triviaQuestion++)
         {                        
            System.out.println(questionSet.get(triviaQuestion).getTriviaQuestion());
            int numChoices = questionSet.get(triviaQuestion).getChoices().size();      
         
            // Display choices to player 1
            for (int choice = 0; choice < numChoices; choice++)
            {
               System.out.println((choice + 1) +". " +
               questionSet.get(triviaQuestion).getChoices().get(choice));
            }
            
            // Prompt player 1 to enter answer
            System.out.println("\nPlease enter your answer: ");
            int player1Answer = keyboard.nextInt(); // Reads users name input
            System.out.println("                          ");
            ArrayList<String> choiceSet = questionSet.get(triviaQuestion).getChoices();
            String correctAnswer = questionSet.get(triviaQuestion).getPossibleAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (player1Answer == correctAnswerIndex + 1)
            {
               player1NumCorrect++;
               player1Score++;               
            }
         }
          
         System.out.println("You got " +player1NumCorrect+ " correct answer(s) "
                            +player1Name+ ".\n");
         
         // Prompt player 2 for Name
         System.out.println("Please enter your name player 2: ");
         player2Name = keyboard.next();
         
         // Display questions for player 2
         System.out.println("                          ");
         System.out.println("Welcome to the Trivia Game " +player2Name+ "!\n"
                            + "Please answer the following questions: \n");
         for (int triviaQuestion = 0; triviaQuestion < questionSet.size() / 2; triviaQuestion++)
         {                        
            System.out.println(questionSet.get(triviaQuestion).getTriviaQuestion());
            int numChoices = questionSet.get(triviaQuestion).getChoices().size();      
         
            // Display choices to player 2
            for (int choice = 0; choice < numChoices; choice++)
            {
               System.out.println((choice + 1) +". " +
               questionSet.get(triviaQuestion).getChoices().get(choice));
            }
            
            // Prompt player 2 to enter answer
            System.out.println("\nPlease enter your answer: ");
            int player2Answer = keyboard.nextInt();
            System.out.println("                          ");
            ArrayList<String> choiceSet = questionSet.get(triviaQuestion).getChoices();
            String correctAnswer = questionSet.get(triviaQuestion).getPossibleAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (player2Answer == correctAnswerIndex + 1)
            {
               player2NumCorrect++;
               player2Score++;
            }
        }   
        keyboard.close();
        System.out.println("You got " +player2NumCorrect+ " correct answer(s) "
                           +player2Name+ ".\n");
        
        // Check if player 1 and player 2 scores are equal
        if (player1Score == player2Score)
        {
            System.out.println("The Trivia Game is a tie between " +player1Name+
                               " and " +player2Name+ ".");
        }
     
        /** 
           Check if score of player 1 is greater than that
           of player 2 score.
        */
     
        else if (player1Score > player2Score)
        {
            System.out.println("Congratulations " +player1Name+ ", you won the game!! "
                               + "\nBetter luck next time, " +player2Name+ ".");
        }
        else 
        {
            System.out.println("Congratulations " +player2Name+ ", you won the game!! "
                               + "\nBetter luck next time, " +player1Name+ "." );
        }

      }         
}