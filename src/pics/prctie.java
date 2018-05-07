package pics;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class prctie {
	public static void main(String[] args) {
		Robot hate = new Robot();
		hate.penDown();
		hate.setPenWidth(10);
		JOptionPane.showInputDialog("What color would you like for the robot to draw?");
		JOptionPane.showInputDialog("How many shapes would you like to draw?");

	}
}
