package co.com.oca.java.cap1.contructors;

/**
 *
 * @author Jonathan Fernandez <jonathan.fvargas@gmail.com>
 */
public class Dog { 
   private String color; 
   private int height; 
   private int length; 
   public Dog(int length, int theHeight) { 
      length = this.length;     // backwards
      height = theHeight;          // fine because a different name 
      this.color = "white";     // OK, but redundant 
   }  
  public static void main(String[] args) { 
    Dog b = new Dog(1, 2); 
    System.out.println(b.length + " " + b.height + " " + b.color); 
   
    //Output:it takes zero as height cuz the asignation in constructor is backwards
    //so it is taking de default value of int. otherwise    this.length = ;
    //0 2 white
 } 
} 