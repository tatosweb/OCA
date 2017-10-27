/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.oca.java.chapter2.operators.statements;

/**
 *
 * @author Jonathan Fernandez <jonathan.fvargas@gmail.com>
 */
public class Statements {

    public static void switchTest(){
        System.out.println("***********switchTest***************");

        int a=1;

        switch(a){

            case 1: {System.out.println("***********case 1***************");
                    char bNumber=0b111;
                    System.out.println("Aja octal 13 en decimal 11 (decode)="+Integer.decode("12"));
                    System.out.println("Aja octal 13 en decimal 11 ()="+Integer.valueOf(bNumber));};
                    System.out.println("***********case 1***************");

            default: System.out.println("***********case default***************");
                    break;
            case 2: System.out.println("***********case 2***************");
                    char oNumber=013;
                    System.out.println("Aja octal 13 en decimal 11 (decode)="+Integer.decode("13"));
                    System.out.println("Aja octal 13 en decimal 11="+Integer.valueOf(oNumber));
                    System.out.println("***********case 2***************");

            case 3: System.out.println("***********case 2***************");
                    char hNumber=0x13;
                    System.out.println("Aja octal 13 en decimal 11="+Integer.valueOf("14"));
                    System.out.println("***********case 2***************");

        }
    }
}
