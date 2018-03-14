//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String mattismart = JOptionPane.showInputDialog("How many times do you want the robot to spin?");
int mattismarter= Integer.parseInt(mattismart);
dance (mattismarter);
	
	
}
 // 1. Use the dance method to make the robot spin.

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(5000);
			System.out.println(i);
			robot.turn(360);
		}
	}
}

