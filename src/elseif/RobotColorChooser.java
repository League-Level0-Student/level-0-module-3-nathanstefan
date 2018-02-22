
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot bob=new Robot();
		//3. ask the user what color they would like the robot to draw
		String answer=JOptionPane.showInputDialog("What color would you like the robot to print out?");
		
		//4. use an if/else statement to set the pen color that the user requested
		if(answer.equals("Green")) {
			bob.setPenColor(Color.green);
		}
	
		if(answer.equals("Yellow")) {
			bob.setPenColor(Color.yellow);
		}
		if(answer.equals("red")) {
			bob.setPenColor(Color.red);
		}
		if(answer.equals("Blue")) {
			bob.setPenColor(Color.blue);
		}
        //5. if the user doesn’t enter anything, choose a random color
		else {
			bob.setRandomPenColor();
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		for (int i = 0; i < 999999999; i++) {
			
		}
		//2. set the pen width to 10
		bob.setPenWidth(10);
		bob.penDown();
	    //1. make the robot draw a shape (this will take more than one line of code)
for (int i = 0; i < 4; i++) {
	bob.move(100);
	bob.turn(360/4);
}

	}
}
