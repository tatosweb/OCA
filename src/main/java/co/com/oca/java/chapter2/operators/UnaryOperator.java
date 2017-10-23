package co.com.oca.java.chapter2.operators;

public class UnaryOperator {

    public void doTest(){
        System.out.println("***********Before initialization***************");
        short x=1;
        System.out.println("**After x:"+x);
        short y=++x;
        System.out.println("**After ++x (short):"+x);
    }
}
