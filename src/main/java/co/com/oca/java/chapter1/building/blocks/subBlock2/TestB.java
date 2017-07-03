package co.com.oca.java.chapter1.building.blocks.subBlock2;
import co.com.oca.java.chapter1.building.blocks.subBlock1.TestA;
public class TestB{
	public static void main (String... args){
		TestA testA = new TestA();
		System.out.println("I'm the top Class-SubBlock2!!! ");
		testA.printJustMe4Now();
	}
}