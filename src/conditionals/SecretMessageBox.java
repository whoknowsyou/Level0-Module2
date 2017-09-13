//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
		String make = JOptionPane.showInputDialog(null, "enter password");
	// 1. Set the passcode in a String variable
			// 2. Using a pop-up, ask for a secret message and store it in a variable
			String mess="";
	// 3. Ask your friend for the passcode and store it in a variable
if (make.equals("me")) {
	mess = JOptionPane.showInputDialog(null, "enter message");
}else{
	JOptionPane.showMessageDialog(null, "INTRUDER!!");	
	String password = JOptionPane.showInputDialog(null, "enter password");	
	// 4. If the passcode matches, show the secret message
if (password.equals("password")) {
	JOptionPane.showMessageDialog(null, mess );	
}else{
	JOptionPane.showMessageDialog(null, "INTRUDER!!");	
	}
}
}

	// 5. If the passcode does not match, pop-up "INTRUDER!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

}
