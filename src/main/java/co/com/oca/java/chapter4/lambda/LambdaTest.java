package co.com.oca.java.chapter4.lambda;

public class LambdaTest {
	
	public static void main(String[] args) {
		LambdaDemo demo = new LambdaDemo();
	    String something = "I am Lambda";
	    demo.printSomething(something, System.out::println);
	    
	    //params -> expressions
	}

}
