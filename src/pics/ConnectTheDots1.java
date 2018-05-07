package pics;

import org.jointheleague.graphical.robot.Robot;

public class ConnectTheDots1 {
	public static void commands() {
		// Put your code here!
		Robot hate = new Robot(370, 170);
		hate.setSpeed(10);
		hate.penDown();
		hate.move(85);
		hate.turn(66);
		hate.move(85);
		hate.turn(80);
		hate.move(85);
		hate.turn(20);
		hate.move(135);
		hate.turn(200);
		hate.move(120);
		hate.move(80);
		hate.turn(80);
		hate.move(120);
		hate.turn(80);
		hate.move(120);
	}

	private static Robot rob = new Robot(370, 170);

	public static void main(String[] args) {
		rob.setSpeed(10);
		rob.penDown();
		commands();
	}

	public static void move(int amt) {
		rob.move(amt);
	}

	public static void turn(int amt) {
		rob.turn(amt);
	}
}