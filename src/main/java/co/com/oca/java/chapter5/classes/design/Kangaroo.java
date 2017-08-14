package co.com.oca.java.chapter5.classes.design;

public class Kangaroo extends Marsupial {
	
	public static boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		//calls isBiped(); from the father
		joey.getMarsupialDescription(); 
		//calls isBiped(); from Kangaroo class 
		joey.getKangarooDescription();  
	}
}