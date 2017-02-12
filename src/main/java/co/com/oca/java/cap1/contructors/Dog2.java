package co.com.oca.java.cap1.contructors;

/**
 * Constructor Chaining  usage of this keyword over constructors
 * @author Jonathan Fernandez <jonathan.fvargas@gmail.com>
 */
public class Dog2 { 
   private int numTeeth; 
   private int numWhiskers; 
   private int weight; 
   public Dog2(int weight) { 
     this(weight, 16);  // calls constructor with 2 parameters 
   } 

   public Dog2(int weight, int numTeeth) { 
    this(weight, numTeeth, 6);  // calls constructor with 3 parameters 
   } 

   public Dog2(int weight, int numTeeth, int numWhiskers) { 
     this.weight = weight; 
     this.numTeeth = numTeeth; 
     this.numWhiskers = numWhiskers; 
   } 
   public void print() { 
     System.out.println(weight + " " + numTeeth + " " + numWhiskers); 
   } 
   public static void main(String[] args) { 
     Dog2 mouse = new Dog2(15); 
     mouse.print(); 
   } 
} 