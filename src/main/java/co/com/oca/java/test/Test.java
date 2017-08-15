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


    public void stringTest() {
        StringTest sct = new StringTest();
        System.out.println("***********doConcatenationTest***************");
        sct.doConcatenationTest();
        System.out.println("***********doStringPoolTest***************");
        sct.doStringPoolTest();
        System.out.println("***********doImportStringTest***************");
        sct.doImportStringTest();
    }





    public static void main(String... arg){
        Test t = new Test();
        t.wrapperTest();
        t.stringTest();

    }
}
