package codeguide;

import java.util.List;

/**
 * Box is the box that can contain many String.
 */
public class Exercise1 {
	private int capacity;
	private List<Object> Item;

	/**
	 * Initialize the box with the specific capacity.
	 * @param capacity is the capacity of the box.
	 * @throws ArithmeticException if capacity is the negative number.
	 */
	public Exercise1(int capacity) {
		if (capacity < 0) {
			throw new ArithmeticException();
		}
		this.capacity = capacity;
	}
}
