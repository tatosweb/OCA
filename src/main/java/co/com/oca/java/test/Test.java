package co.com.oca.java.test;

import co.com.oca.java.chapter2.operators.statements.WrapperTest;
import co.com.oca.java.chapter3.StringTest;
import co.com.oca.java.chapter3.StringBuilderTest;
import co.com.oca.java.chapter3.ArrayTest;
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
        System.out.println("***********doConcatenationTest***************");
        StringTest.doConcatenationTest();
        System.out.println("***********doStringPoolTest***************");
        StringTest.doStringPoolTest();
        System.out.println("***********doImportStringTest***************");
        StringTest.doImportStringTest();
    }

    public void stringBuilderTest() {
        StringBuilderTest sbt = new StringBuilderTest();
        System.out.println("***********mainAppend***************");
        sbt.mainAppend();
        System.out.println("sbt:"+sbt.getSb());
        System.out.println("***********chartAtStringBuilder***************");
        StringBuilderTest.stringBuilderMethodsTest(sbt.getSb(), 10, "a", 25);

    }

    public void arraysTest(){
        ArrayTest.doSortIntTypeTest();
        ArrayTest.doSortShortTypeTest();
        ArrayTest.doSortCharTypeTest();
        ArrayTest.doSortByteTypeTest();
        ArrayTest.doBinarySearchWithArrayUnSort();
    }


    public static void main(String... arg){
        Test t = new Test();
        t.wrapperTest();
        t.stringTest();
        t.stringBuilderTest();
        t.arraysTest();
    }
}
