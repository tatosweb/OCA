package co.com.oca.java.test;

import co.com.oca.java.chapter2.operators.statements.WrapperTest;
import co.com.oca.java.chapter3.StringTest;
import co.com.oca.java.chapter3.StringBuilderTest;
import co.com.oca.java.chapter3.ArrayTest;
import co.com.oca.java.chapter3.TimeTest;
import co.com.oca.java.chapter3.Trip;
import co.com.oca.java.chapter4.classes.design.*;
import static co.com.oca.java.chapter4.classes.design.Species.breath;
import co.com.oca.java.chapter2.operators.UnaryOperator;

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
        System.out.println("***********StringBuilderVsStringTest***************");
        StringBuilderTest.StringBuilderVsStringTest();

    }

    public void arraysTest(){
        ArrayTest.doSortIntTypeTest();
        ArrayTest.doSortShortTypeTest();
        ArrayTest.doSortCharTypeTest();
        ArrayTest.doSortByteTypeTest();
        ArrayTest.doBinarySearchWithArrayUnSort();
        ArrayTest.doSortCharTypeMultidimensionalArrayTest();
    }


    public void timeTest(){
        TimeTest.doTimeTest();
        TimeTest.doLocalDateTest(2017,01,02);
        TimeTest.doLocalTimeTest(3,30, 33,33333);
        TimeTest.doLocalTimeAllTest(2017,01,02,3,30,33,33333);
    }
    public void unaryOperatorTest(){
        UnaryOperator uo= new UnaryOperator();
        uo.doTest();
    }


    private int a=1;
    private void privateMethod(){
        System.out.println("siiii entreeee");
    }
    public static void main(String... arg){
        Test t = new Test();
        t.unaryOperatorTest();
        t.wrapperTest();
        t.stringTest();
        t.stringBuilderTest();
        t.arraysTest();
        t.timeTest();
        t.a=2;
        t.privateMethod();
        Species species=null;
        System.out.println(species.EUKARYOTES);
        Human human=new Human();
        System.out.println(human.getType());
        human.evolution();
        System.out.println(species.breath());
        System.out.println(breath());
    }
}


