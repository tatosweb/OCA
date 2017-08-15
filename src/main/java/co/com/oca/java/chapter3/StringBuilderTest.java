package co.com.oca.java.chapter3;

/**
 * Created by developer on 5/08/17.
 */
public class StringBuilderTest {

   StringBuilder sb;

   public StringBuilderTest(){
       sb= new StringBuilder(10);

   }
   public void mainAppend(){
       sb.append("cambié cambié cambié");
       append(sb);
   }

   public void append(StringBuilder sb){
        sb=null;
   }

   public static void stringBuilderMethodsTest(StringBuilder sb, int index, String charLookedAt, int charLookedAtIndex){
       System.out.println("Char at index ("+index+") - "+sb+"->"+sb.charAt(index));
       System.out.println("Find first index of this char("+charLookedAt+") - "+sb+"->"+sb.indexOf(charLookedAt));
       System.out.println("Find index "+charLookedAtIndex+"of this char("+charLookedAt+") - "+sb+"->"+sb.indexOf(charLookedAt, charLookedAtIndex));
   }

   public StringBuilder getSb() {
        return sb;
   }
}
