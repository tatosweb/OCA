package co.com.oca.java.chapter1.building.blocks;

import java.util.Date;


public class Test {

    public static void main(String args[]) {

        Date d1 = new Date(99, 11, 31);

        Date d2 = new Date(99, 11, 31);

        method(d1, d2);

        System.out.println("d1 is " + d1
                + "\nd2 is " + d2);

    }

    public static void method(Date d1, Date d2) {

        d2.setYear(100);

        //this line do not change anything
        d1 = d2;
        
    }

}