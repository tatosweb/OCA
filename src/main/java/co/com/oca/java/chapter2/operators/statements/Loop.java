package co.com.oca.java.chapter2.operators.statements;

import java.util.Arrays;
/**
 * Created by developer on 5/08/17.
 */
public class Loop {

    public void doTest(){
        char c=-0;
        int i = 0;
        do {
            i = (true) ? 1 : 2;
        }while(i==2);
    }


    public static void breakLabelTest(){
        System.out.println("***********breakLabelTest begin***************");

        char a[][]=new char[2][];
        a[1]=new char[]{'m','i','n','a'};
        inicio:for(char subA[]:a) {
             System.out.println(Arrays.toString(subA));
            if(subA != null) {
                for (int i = 0; i < subA.length; i++) {
                    System.out.println("Soy i?" + subA[i] + " ");
                    if (subA[i] == 'i') {
                        System.out.println("Soy i y estoy en:" + i + " posicion ");
                        break inicio;
                    }
                }
            }
        }
        System.out.println("Al final ");
        System.out.println("***********breakLabelTest end***************");
    }

    public static void continueLabelTest(){
        System.out.println("***********continueLabelTest begin***************");
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
                    for (char x = 'a'; x <= 'c'; x++) {
                        if (a == 2 || x == 'b')
                            continue FIRST_CHAR_LOOP;
                        System.out.print(" " + a + x);
                    }
                }
        System.out.println("***********continueLabelTest end***************");
            }

    
}
