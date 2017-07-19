package co.com.oca.java.chapter5.classes.design;

public class Snake extends Reptile {
	protected boolean hasLegs() {
		return false;
	}

	protected double getWeight() throws InsufficientDataException {
		return 2;
	}

	/*
	 * Uncomment to review
	 * Second example:
	 * Since Exception is not
		a subclass of InsufficientDataException, the third rule of overriding methods is
		violated and the code will not compile. 
	 */
	
	/*
	protected double getHeight() throws Exception { // DOES NOT COMPILE
		return 2;
	}

	/*
	 *Uncomment to review
	 *The getLength() method doesn’t throw an exception in the parent class, but it
	  does throw an exception, InsufficientDataException, in the child class. In this manner,
	  the child class defnes a new exception that the parent class did not, which is a violation of
	  the third rule of overriding methods.
	 * 
	 */
	
	/*
	protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
		return 10;
	}*/

}
