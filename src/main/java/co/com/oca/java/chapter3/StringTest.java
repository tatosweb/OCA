package co.com.oca.java.chapter3;

/**
 * Created by developer on 5/08/17.
 */
public class StringTest {

    public void doConcatenationTest(){
        String stringVar= "S";
        int intVar = 1;
        System.out.println(stringVar+intVar+2);
        System.out.println("S"+1+intVar);
        System.out.println(1+intVar+"S");
        String _stringVar="M";
        _stringVar+=0;
        String $stringVar="N";
        _stringVar+=$stringVar+'A';
        System.out.println(_stringVar);
    }
}
