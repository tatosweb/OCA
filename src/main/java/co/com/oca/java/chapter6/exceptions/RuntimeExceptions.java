package co.com.oca.java.chapter6.exceptions;

import java.io.FileInputStream;

public class RuntimeExceptions {

    /*Runtime exceptions extend RuntimeException class.
      They don’t have to be handled or declared. They can be thrown by the programmer or by the JVM.
    */
    //ArithmeticException is thrown by the JVM when code attempts to divide by zero
    public static void ArithmeticExceptionTest(){
        int divider =3;
        int dividend =0;
        //
        int result =  divider /dividend;

    }

    public static void ArithmeticExceptionDeclaredTest() throws ArithmeticException{
        int divider =3;
        int dividend =0;
        // ArithmeticException doesn't have to be declared, even that, here it's thrown and it doesn't matter.
        int result =  divider /dividend;

    }

    public static void ArithmeticExceptionHandledTest() throws ArithmeticException{
        int divider =3;
        int dividend =0;
        // ArithmeticException doesn't have to be handled, however, it can be handle
        try {
            int result = divider / dividend;
        }catch(ArithmeticException a){
            System.out.println("Arithmetic issue");
        }

    }

    //ArrayIndexOutOfBoundsException Thrown by the JVM when code uses an illegal index to access an array

    public static void ArrayIndexOutOfBoundExceptionTest() {
        int numArray[] = {1, 2, 3};
        int num = numArray[3];
    }

    public static void ArrayIndexOutOfBoundExceptionDeclaredTest() throws ArrayIndexOutOfBoundsException {
        int numArray[] = {1, 2, 3};
        // ArrayIndexOutOfBoundException doesn't have to be declared, even that, here it's thrown and it doesn't matter.
         int num = numArray[3];
    }
    public static void ArrayIndexOutOfBoundExceptionHandledTest() {
        int numArray[] = {1, 2, 3};
        // ArrayIndexOutOfBoundException doesn't have to be handled, however, it can be handle
        try{
            int num = numArray[3];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds issue");
        }

    }


    //ClassCastException Thrown by the JVM when an attempt is made to cast an exception to a subclass of which it is not an instance

    public static void classCastExceptionTest() {
        Object i = Integer.valueOf(42);
        String s = (String)i;
    }

    public static void classCastExceptionDeclaredTest() throws ClassCastException {
        Object i = Integer.valueOf(42);
        // ClassCastException doesn't have to be declared, even that, here it's thrown and it doesn't matter.
        String s = (String)i;
    }
    public static void classCastExceptionHandledTest() {
        Object i = Integer.valueOf(42);
        // ClassCastException doesn't have to be handled, however, it can be handle
        try{
            String s = (String)i;
        }catch(ClassCastException e){
            System.out.println("ClassCastException issue");
        }

    }

    //IllegalArgumentException Thrown by the programmer to indicate that a method has been passed an illegal or inappropriate argument

    public static int illegalArgumentExceptionTest(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException(Integer.toString(value));
        }
        return value;
    }

    // NullPointerException Thrown by the JVM when there is a null reference where an object is required

    public static void nullPointerExceptionTest() {
        String s = null;
        s.charAt(0);
    }

    public static void nullPointerExceptionDeclaredTest() throws NullPointerException {
        String s = null;
        // NullPointerException doesn't have to be declared, even that, here it's thrown and it doesn't matter.
        s.charAt(0);
    }
    public static void nullPointerExceptionHandledTest() {
        String s = null;
        // NullPointerException doesn't have to be handled, however, it can be handle
        try{
            s.charAt(0);
        }catch(NullPointerException e){
            System.out.println("NullPointerException issue");
        }

    }

    //NumberFormatException Thrown by the programmer when an attempt is made to convert a string to a numeric type but the string doesn’t have an appropriate format

    public static void numberFormatExceptionTest() {
        String s = "1-2";
        int value=Integer.valueOf(s);
    }

    public static void numberFormatExceptionDeclaredTest() throws NumberFormatException {
        String s = "1-2";
        // NumberFormatException doesn't have to be declared, even that, here it's thrown and it doesn't matter.
        int value=Integer.valueOf(s);
    }
    public static void numberFormatExceptionHandledTest() {
        String s = "1-2";
        // NumberFormatException doesn't have to be handled, however, it can be handle
        try{
            int value=Integer.valueOf(s);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException issue");
        }

    }

    public static void main(String[] args) {

        //ArithmeticExceptionTest();
        //ArithmeticExceptionDeclaredTest();
        //ArithmeticExceptionHandledTest();
        //ArrayIndexOutOfBoundExceptionTest();
        //ArrayIndexOutOfBoundExceptionDeclaredTest();
        //ArrayIndexOutOfBoundExceptionHandledTest();
        //classCastExceptionTest();
        //classCastExceptionDeclaredTest();
        //classCastExceptionHandledTest();
        //illegalArgumentExceptionTest(200);
        //nullPointerExceptionTest();
        //nullPointerExceptionHandledTest();
        //numberFormatExceptionTest();
        numberFormatExceptionHandledTest();

    }
}
