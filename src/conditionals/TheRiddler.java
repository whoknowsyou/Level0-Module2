//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "welcome to the riddler there are four riddles for you to solve!");
		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
  String ridd =JOptionPane.showInputDialog(null, "a box with no edges and no doors with golded treasure in store");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
  if (ridd.equals("an egg")) { 
	score++;
	JOptionPane.showMessageDialog(null, "right + one point try another");
  
  }String	ridd1=JOptionPane.showInputDialog(null, "how do you get out of a room with no windows or doors with only a table and a saw(it's tricky)");
  
if (ridd1.equals("saw the table in half then put two halfs together and make a hole")) {
	score++;
	JOptionPane.showMessageDialog(null, "right + one point try another");

}String	ridd2=JOptionPane.showInputDialog(null, "there are 10 fish in a tank 2 fish drown 4 swim away 3 die how many are left");

	if (ridd2.equals("7")) {
		score++;
		JOptionPane.showMessageDialog(null, "right + one point try another");
	}	String	ridd3=JOptionPane.showInputDialog(null, "I grind mountans but i am untouchable a am around you but invisble what am I");
	
		if (ridd3.equals("the wind")) {
			score++;
			JOptionPane.showMessageDialog(null, "right + one point try another");
		}		String	ridd4=JOptionPane.showInputDialog(null, "one knight a king and a queen are on a bus the bus crashes and the king queen and bus driver die who lived");
		
			if (ridd4.equals("the knight")) {
				score++;
				JOptionPane.showMessageDialog(null, "right");
			
	
	  	JOptionPane.showMessageDialog(null, "your score is "+score+". you got "+score+"/4");

  }else{
	  
	  // 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	
		}
		}
	}
