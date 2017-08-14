package co.com.oca.java.chapter5.classes.design;

public class Reptile {

	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}

	protected double getWeight() throws Exception {
		/*
		 * change the method signature and then Snake.java wont compile because getWeight() method on child class is
		 * throwing and exception and father class don't
		 */
		// protected double getWeight() /*throws Exception*/ {
		return 2;
	}

	/*
	 *Second example, uncomment to review
	 * 
	 */
	/*
	protected double getHeight() throws InsufficientDataException {
		return 2;
	}

	protected int getLength() {
		return 10;
	}
	*/

}