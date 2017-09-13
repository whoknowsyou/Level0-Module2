//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog(null, "what is your name");		
		//1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog(null, "do you like bananas");
		//2. if they say no,
		if (banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy");			
		}
			//tell them they are crazy 
			//and end quiz
		
		//3. if they say yes
		if (banana.equals("yes")) {
			String hobby = JOptionPane.showInputDialog(null, "what is your favorit hobbie");			
		if (hobby.equals("legos" + "reading")) {
			JOptionPane.showMessageDialog(null, hobby + " is much better than bananas");			
		}else{
	

JOptionPane.showMessageDialog(null, name + " you are bananas!");
}		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}
