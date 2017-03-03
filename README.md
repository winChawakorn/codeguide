#codeguide

##Check parameters for validity
Most methods and constructors have some restriction on what value may be passed
into their parameter. It may get the usable value to make that method can work
correctly and won't make an error. We should detect the error as soon as possible
, so we should check them in the first line of the method body. We may use `throw`
to throw an error exception for the invalid value in the parameter.
```
public class Box {
	private int capacity;
	private List<Object> Item;

	/**
	 * Initialize the box with the specific capacity.
	 * @param capacity is the capacity of the box.
	 */
	public Box(int capacity) {
		this.capacity = capacity;
	}
```
In this example, we will see the box with the capacity that shouldn't be the negative number
, so we have to check if the parameter of the constructor is the negative number and throw
the error exception.
```
public class Box {
	private int capacity;
	private List<Object> Item;

	/**
	 * Initialize the box with the specific capacity.
	 * @param capacity is the capacity of the box.
	 * @throws ArithmeticException if capacity is the negative number.
	 */
	public Box(int capacity) {
		if (capacity < 0) {
			throw new ArithmeticException();
		}
		this.capacity = capacity;
	}
```
Then, we added if statement to check the negative number and throw ArithmeticException.
Now Box won't be initialized with the negative capacity anymore.

Reference : Item38 in [Effective Java](http://www.ebooksbucket.com/uploads/itprogramming/java/Effective_Java_2nd_Edition.pdf)

##Always override toString
When we create a class, it's automatically implement java.lang.Object. That's mean we already implement
toString method. If we don't override toString method, program will print out some source code. For
example "PhoneNumber@163b91.". So we need to override toString method to let the program print out
whatever we want.
```
/**
 * A money for the example.
 */
public class Money {
	private double value;
	private String currency;
	.
	.
	.
	@Override
	public String toString() {
		return this.value + " " + this.currency;
	}
}
```
In the example, when this class was printed, it won't print "Money@xxxxxx." any more.
It will print like "20 Baht" instead.

Reference : Item10 in [Effective Java](http://www.ebooksbucket.com/uploads/itprogramming/java/Effective_Java_2nd_Edition.pdf)