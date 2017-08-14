package co.com.oca.java.chapter2.operators.statements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 5/08/17.
 */
public class WrapperTest {
    private List<Integer> list;

    public WrapperTest(){
        list =  new ArrayList();
    }

    public void poolTest(int testNumber){
        Integer a = new Integer(testNumber);
        Integer b = new Integer(testNumber);
        Integer c = Integer.valueOf(testNumber);
        Integer d = Integer.valueOf(testNumber);
        Integer e = testNumber;
        Integer f = testNumber;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==f);

    }

    public void add (Integer i){
        list.add(i);
    }
    public void print(){
        for(Integer i:list){
            System.out.println(" "+i.intValue()%2);

        }


    }

}
