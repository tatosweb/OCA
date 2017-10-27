package co.com.oca.java.chapter6.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionTest {

    final int x=10;
    String x;
    public static IOException checkedExceptionNotThrown() throws IOException{
        try{
            //If you delete this comment, it will generate a compile error because non exce
            //return new IOException();
            throw new IOException();
        }catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }
    }


}
