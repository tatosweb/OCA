package co.com.oca.java.chapter4.lambda;

public class LambdaDemo {
    interface Printer {
        void print(String val);
    }
 
    public void printSomething(String something, Printer printer) {
        printer.print(something);
    }
}