package co.com.oca.java.chapter3;

/**
 * Created by developer on 5/08/17.
 */
public class StringTest {

    public static void doConcatenationTest(){
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

    public static void doStringPoolTest(){
        String temp1 = "mona";
        String temp2 = "mona";
        String temp3 = new String ("mona");
        System.out.println("StringPool==StringPool: "+temp1 == temp2);
        System.out.println("StringPool==Object: "+temp1 == temp3);
        System.out.println("StringPool==Object: "+temp2 == temp3);
        System.out.println("StringPool==Object: "+temp2.equals(temp3));
    }

    public static void doImportStringTest(){
        String temp1 = "m0na";
        String temp2 = "mamona";
        String temp3 = new String ("monitanita");
        System.out.println("Lenght:"+temp1.length());
        System.out.println("find character (index:2) :"+temp2.charAt(2) +" "+temp2);
        System.out.println("find index (char:'A') :"+temp1.indexOf('A') +" "+temp1);
        System.out.println("find index (char:'a') :"+temp1.indexOf('a') +" "+temp1);
        System.out.println("find index, starting at index 2 (char:'a') :"+temp2.indexOf('a',2) +" "+temp2);
        System.out.println("find index (string:'ni') :"+temp3.indexOf("ni") +" "+temp3);
        System.out.println("find index, starting at index 2  (string:'ni') :"+temp3.indexOf("ni", 4) +" "+temp3);
        System.out.println("Uppercase: "+temp1.toUpperCase());
        System.out.println("Uppercase: "+temp1.toLowerCase());
        System.out.println("Start with: "+temp1+" "+temp1.startsWith("mo"));
        System.out.println("Start with: "+temp1+" "+temp1.startsWith("m0"));
        System.out.println("Contains: "+temp3+"-ni: "+temp3.contains("ni") );
        System.out.println("Ends with: "+temp1+" "+temp1.endsWith("na"));
        System.out.println("Replace * - > "+("*espa*cio*".replace("*","r")).trim());
        System.out.println("Replace * - > "+("*espa*cio*".replace('*','\r')).trim());
        String result = "AniMaL  ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
    }
}
