package co.com.oca.java.test;

import co.com.oca.java.chapter2.operators.statements.WrapperTest;
import co.com.oca.java.chapter3.StringTest;

/**
 * Created by developer on 5/08/17.
 */
public class Test {

    public void wrapperTest(){
        WrapperTest wt= new WrapperTest();
        for(int i=0; i<11; i++)
            wt.add(i);
        wt.print();
        wt.poolTest(127);


    }


    public void stringConcatenationTest() {
        StringTest sct = new StringTest();
        sct.doConcatenationTest();
    }





    public static void main(String... arg){
        Test t = new Test();
        t.wrapperTest();
        t.stringConcatenationTest();
    }
}
