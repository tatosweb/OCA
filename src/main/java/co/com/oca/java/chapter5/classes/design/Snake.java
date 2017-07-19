package co.com.oca.java.chapter5.classes.design;

public class Snake extends Reptile {
	protected boolean hasLegs() {
		return false;
	}

	protected double getWeight() throws InsufficientDataException {
		return 2;
	}
}
