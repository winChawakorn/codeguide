package codeguide;

import java.util.Random;

/**
 * Exercise for code guide Always override toString.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.03.03
 */
public class Exercise2 {
	/**
	 * Print toString method from Robot.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Robot(true));
	}
}

/**
 * Robot is a robot that contain identity code and activate status.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.03.03
 */
class Robot {
	private boolean isActivated;
	private String identityCode;

	/**
	 * initialize a new robot.
	 * 
	 * @param isActivated
	 *            the activate status of the robot.
	 */
	public Robot(boolean isActivated) {
		this.isActivated = isActivated;
		this.identityCode = getIdentityCode();
	}

	/**
	 * Create the identity code.
	 * 
	 * @return the identity code like "A11111".
	 */
	static String getIdentityCode() {
		Random rand = new Random();
		return "A" + (rand.nextInt(99999 - 10000) + 10000) + "";
	}
	// TODO Make the program print something doesn't like
	// "codeguide.Robot@6d06d69c".by override toString method to
	// print something like this
	// "Robot[A12345] is not activated right now!".
}
