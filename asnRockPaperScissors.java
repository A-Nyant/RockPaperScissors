import objectdraw.*;
import java.awt.*;

//Program by Afia Nyantakyi
//Folder/Program Name: asnInvisibleBoxGame
//Date: 9/12/19
//Overview: To create a game in which the player has to
//find boxes that are hidden from them.

   
   
   
public class asnRockPaperScissors extends WindowController
{
    //Positions for some boxes
   private static final int START_X_BOX1 = 100, 
                            START_Y_BOX = 25, 
                            BOX_WIDTH = 120, 
                            BOX_HEIGHT = 250;
                            
   //Boxes where the users and computer choose would be.                         
   private FramedRect User, Computer;
   
   //variables for the score and items.
   private int Rock, Paper, Scissor,
                User_Score,
                Computer_Score;
                
   //Text to display the score
   private Text User_Win, Computer_Win, Condition;
   
   
   public static void main(String[] args){
      new asnRockPaperScissors().startController(400,400);
    }


   public void begin()
   {
        //Creates the area for where the choices will be shown.
        User = new FramedRect (START_X_BOX1, START_Y_BOX, BOX_WIDTH, BOX_HEIGHT, canvas);
        Computer = new FramedRect (START_X_BOX1 + BOX_WIDTH,START_Y_BOX, BOX_WIDTH, BOX_HEIGHT, canvas);
        new Text ( "User", 150, 10, canvas);
        new Text ( "Computer", 250, 10, canvas);
        
        //Create the text where the scores will be displayed.
        User_Win = new Text ("User Score: ", 120, 310, canvas);
        Computer_Win = new Text ("Computer Score: ", 220, 310, canvas);
        Condition = new Text ("Begin", 200, 280, canvas);
   }
   
   //This is where the computer chooses a item.
   public void Computer_Choice
   {
        Choice = RandomIntGenerator (1, 3);
        if (Choice == 1)
        {
            Weapon = Rock
        }
        else if (Choice == 2)
        {
            Weapon = Paper
        }
        else if (Choice ==3)
        {
            Weapon = Scissor
        }   
   } 
   
   //This will compare who won for the round and it will update the scores   
   public void Compare()
   {
        if (User.Contains (Rock))
        {
            if (Computer.Contains (Paper))
            {
                Computer_Score ++;
                Computer_Win.setText("Computer Score: " + Computer_Score);
                Condition.setText("Computer Wins");
            }
            else if (Computer.Contains (Scissor))
            {
                User_Score ++;
                User_Win.setText("User Score: " + User_Score);
                Condition.setText("User Wins");
            }
            else if (Computer.Contains (Rock))
            {
                Condition.setText("Its a tie");
            }           
        }
        else if (User.Contains (Paper))
        {
            if (Computer.Contains (Rock))
            {
                Computer_Score ++;
                Computer_Win.setText("Computer Score: " + Computer_Score);
                Condition.setText("Computer Wins");
            }
            else if (Computer.Contains (Scissor))
            {
                User_Score ++;
                User_Win.setText("User Score: " + User_Score);
                Condition.setText("User Wins");
            }
            else if (Computer.Contains (Paper))
            {
                Condition.setText("Its a tie");
            }        
        else if (User.Contains (Scissor))
        {
            if (Computer.Contains (Paper))
            {
                Computer_Score ++;
                Computer_Win.setText("Computer Score: " + Computer_Score);
                Condition.setText("Computer Wins");
            }
            else if (Computer.Contains (Rock))
            {
                User_Score ++;
                User_Win.setText("User Score: " + User_Score);
                Condition.setText("User Wins");
            }
            else if (Computer.Contains (Scissor))
            {
                Condition.setText("Its a tie");
            } 
        }
   }
         
}