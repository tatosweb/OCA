package co.com.oca.java.chapter4.constructors;

public class Test extends BiggerTest{
	
	public Test(){
		//it can be seen but the compiler adds a call on the first
		//line of the constructor, comment line 14 to compile.		
		
		this("");
		System.out.println(this.getClass().getCanonicalName());
		
		/*
		 * The first statement of every constructor is a call to another constructor within the class
		 * using this(), or a call to a constructor in the direct parent class using super()
		 */
		super();	
	}
	
	public Test (String testName){
		//The super() call may not be used after the first statement of the constructor.
		//int number = 10;
		super(testName);
		int number = 10;
	}
	
	
	public Test (int testNumber){
		
		//If no super() call is declared in a constructor, Java will insert a no-argument super()
		//as the first statement of the constructor.		
		
	}
	
	
	
}
