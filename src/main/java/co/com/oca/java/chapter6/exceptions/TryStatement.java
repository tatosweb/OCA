import java.io.*;
public class TryStatement{

    public static void tryFinallyStructureForRuntimeException(){
      int numArray[] = {1,2,3};
      try{
          // If any of the statements throw an exception, the try block stops running and execution goes to the  finally
          int num = numArray[-1];
      }finally{
          int num = 0;
          System.out.println("Even a runtime exception appears in line 6, the finally block is ");
      }

    }
    public static void tryCatchFinallyStructureForCheckedException(){
      FileInputStream fis = null;
      /*This constructor FileInputStream(File filename)
	     * throws FileNotFoundException which is a checked
	     * exception*/
       //
      //To make this code compiles properly, just remove the line that starts with REMOVE word and these characters ->*/
         /*REMOVE

           try{
           //The code in the try block, run normally. If any of the statements throw an exception that can be caught by the exception type listed in the catch block, the try block stops running and execution goes to the catch  statement .
           //If none of the statements in the try block throw an exception that can be caught, the catch clause not run.
               */

        fis = new FileInputStream("B:/myfile.txt");
	         int k;
           /* Method read() of FileInputStream class also throws
	          * a checked exception: IOException*/
	         while(( k = fis.read() ) != -1)
	         {
		           System.out.print((char)k);
	         }
           fis.close();
        /*REMOVE

      }catch(FileNotFoundException  ex){
          System.out.println("FileNotFoundException is a subclass of IOException: "+ex);
      }catch(IOException ex){
          System.out.println("I/O error occurred: "+ex);
      }finally{
          System.out.println("Finally Block: It'll always happen ");
	    }
*/
    }
    public static void main(String[] args) {
          tryCatchFinallyStructureForCheckedException();
          tryFinallyStructureForRuntimeException();


    }
}
