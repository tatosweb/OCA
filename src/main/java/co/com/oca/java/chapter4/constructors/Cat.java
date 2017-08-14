package co.com.oca.java.chapter4.constructors;

public class Cat extends BiggerCat{

	/*
	 *  if the parent doesn’t have a no-argument constructor and the child doesn’t define any
	 *	constructors, the compiler will throw an error and try to insert a default no-argument
	 *	constructor into the child class.
	 */
	
	public Cat (){
		/*
		 * if the parent doesn’t have a no-argument constructor, the compiler requires an explicit
		 * call to a parent constructor in each child constructor.
		 */
		

	}
	
}
