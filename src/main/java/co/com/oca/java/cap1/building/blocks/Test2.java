public class Test2{
/*1. This class is the only top class in this file that can have the public access modifier
As you can see the Test3 class has also the public access modifier, that is an error.
*/
/*2. if you delete this class, and compile again with the same statement:
javac Test2.java
-> At this point the Test2 class doesn't exist, however,  the Test2 file exists, and have the extension .java, 
for that reason the classes inside the file can be compile. The result is two files of bytecode with the same
name of the classes, but with a .class filename extension.
*/
}

public class Test3{
//error: The Test3 class is public, should be declared in a file named Test3.java
//you can delete de public access modifier to solve the problem
}
class Test4{
// This is the only class with main method, to execute this class 
/* 1. remove the public access modifier from Test3 class.
 * 2. compile the Test2.java file
 * 3. execute -> java Test4 
 */
	public static void main (String... args){
		System.out.println("I'm the only class with a main method!!! ");
	}
}
