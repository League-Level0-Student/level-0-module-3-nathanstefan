package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotValentine {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setPenColor(255, 0, 0);
		rob.setWindowImage("elseif/unnamed.jpg");
		rob.setPenWidth(10000);
		rob.penDown();
		rob.setSpeed(2999999);
		rob.turn(45);
		rob.move(160);
		rob.setAngle(0);
		for (int i = 0; i < 180; i++) {
			rob.move(1);
			rob.turn(-360 / 360);
		}
		rob.setAngle(0);
		for (int i = 0; i < 180; i++) {
			rob.move(1);
			rob.turn(-360 / 360);
		}
		rob.setAngle(135);
		rob.move(161);
		rob.hide();
		JOptionPane.showMessageDialog(null, "I hate you, you got pranked with the heart hahhahha");
	}
}
