/**
   This program assimilates a simple trivia
   game for two players. Where each player
   gets five questions, a point is given for
   every right answer and whoever has the 
   highest number of points wins.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Question
{
   // Declare variables
   private String triviaQuestion;
   private ArrayList<String> choices;
   private String possibleAnswer;
   private int correctAnswer;
   
   /**
      Constructor that sets the trivia question, 
      possible answers, and the choices the 
      player has.
  */

   public Question(String triviaQuestion, String[] choices, String possibleAnswer)
   {
      this.triviaQuestion = triviaQuestion;
      this.choices = new ArrayList<String>();
      for (int i = 0; i < choices.length; i++)
      {
         this.choices.add(choices[i]);
      }
      
      // Makes sure each question is shown in different order
      Collections.shuffle(this.choices);
      this.possibleAnswer = possibleAnswer;
   }
   
   /**
      The getTriviaQuestion method returns the trivia question.
      @return The value to store in the triviaQuestion field.
   */

   public String getTriviaQuestion()
   {
      return triviaQuestion;
   }
   
   /**
      The getChoices method returns the choices.
      @return The value to store in the choices field.
   */

   public ArrayList<String> getChoices()
   {
      return choices;
   }
   
   /**
      The getPossibleAnswer method returns the possible
      answer.
      @return The value to store in the possibleAnswer
      field.
   */

   public String getPossibleAnswer()
   {
      return possibleAnswer;
   }
   
   /**
     getAnswer method returns the answer
     @return The value in the correctAnswer 
     field.
  */
  public int getAnswer()
  {
      return correctAnswer;
  }

}