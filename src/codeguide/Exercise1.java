package codeguide;

import java.util.Scanner;

/**
 * The exercise for the code guide check parameter for validity.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.03.03
 *
 */
public class Exercise1 {
	/**
	 * Calculate and print out the rectangle's area.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out
				.println("Welcome to area calculator\nPlease input the rectangle's side");
		System.out.print("width : ");
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		System.out.print("length : ");
		double l = sc.nextDouble();
		System.out.println("The area of the rectangle is "
				+ rectangleArea(w, l));
	}

	/**
	 * Calculate the area of the rectangle.
	 * 
	 * @param width is the width of the rectangle. Can't be a negative number.
	 * @param length is the length of the rectangle. Can't be a negative number.
	 * @return the area of the rectangle.
	 */
	public static double rectangleArea(double width, double length) {
		// TODO Check if the parameter is valid and throw the exception.
		return width * length;
	}
}
