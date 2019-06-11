package arrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	int randomX;
	int randomY;
	//3. use a for loop to initialize the robots.
	for(int i=0; i<5; i++) {
		//4. make each robot start at the bottom of the screen, side by side, facing up
		robots[i] = new Robot();
		randomX = (int) (Math.random() * ((650 - 1) + 1)) + 1 - 50;
		robots[i].setX(randomX);
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean isRaceOn = true;
	while(isRaceOn) {
	for(int i=0; i<5; i++) {
			randomY = (int) (Math.random() * 50);
			robots[i].setSpeed(70);
		robots[i].move(randomY);
		if(robots[i].getY() < 0) {
			isRaceOn = false;
			System.out.println("Robot " + ++i + " won!");
			break;
		}
	}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
