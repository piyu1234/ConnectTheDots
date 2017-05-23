package pics;


import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class ConnectTheDots1
{
	public static void commands(){
		//Put your code here!
		
	}
	
	private static Robot rob = new Robot(370, 170);

	public static void main(String[] args)
	{
		rob.setSpeed(10);
		rob.penDown();
		commands();
	}
	
	public static void move(int amt){
		rob.move(amt);
	}
	
	public static void turn(int amt){
		rob.turn(amt);
	}
}