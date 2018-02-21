
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday=JOptionPane.showInputDialog("Whos birthday would you like to know?");
		// 3. Print out what the user typed
		if(birthday.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "January 24th");
			
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(birthday.equals("Dad")) {
			JOptionPane.showMessageDialog(null, "June 9th");
			
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(birthday.equals("Me")) {
			JOptionPane.showMessageDialog(null, "April 16th");
			
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "That info isn't in my database");
		}

	} 
}
