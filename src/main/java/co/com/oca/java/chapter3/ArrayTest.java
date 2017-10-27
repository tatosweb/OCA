package co.com.oca.java.chapter3;
import java.util.Arrays;
import static java.util.Arrays.toString;
import static java.util.Arrays.asList;
/**
 * Created by developer on 5/08/17.
 */
public class ArrayTest {
    int[] temp3 ;
    public ArrayTest(){
        temp3 = new int[]{2,3,4,5};
    }


    public void doDeclarationAndInizializationTest(){

       String[]a;
       a=new String[]{"1","2","3"};
       int temp[];
       int temp1 [];
       int []temp2 ;
       int[] temp3 ;
       int temp5[]={5,6,7};
    }

    public static void doSortIntTypeTest(){
        int[] temp={-5, -13, -2, 4,8,1,3,11,2};
        System.out.println("***********Before sort***************");
        System.out.println(Arrays.toString(temp));
        System.out.println("***********After sort***************");
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void doSortShortTypeTest(){
         short []temp;
         temp=new short[]{-4,-13,-1,0,8,10,2};
         System.out.println("***********Before sort***************");
         System.out.println(Arrays.toString(temp));
         Arrays.sort(temp);
         System.out.println("***********After sort***************");
         System.out.println(Arrays.toString(temp));
    }

    public static void doSortByteTypeTest(){
        byte temp[]=new byte[]{-2,-7,0,3,8,1,9,2};
        System.out.println("***********Before sort***************");
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println("***********After sort***************");
        System.out.println(Arrays.toString(temp));
        System.out.println("Looking for 1 -->"+Arrays.binarySearch(temp, (byte)1));
    }

    public static void doBinarySearchWithArrayUnSort(){
        byte temp[]=new byte[]{-2,-7,0,3,8,1,9,2};
        System.out.println("***********Unsort***************");
        System.out.println(Arrays.toString(temp));
        System.out.println("***********Binary Search********As soon as you see the array isn’t sorted, look for an answer choice about unpredict" +
                "able output.*******");
        System.out.println("Looking for 1 -->"+Arrays.binarySearch(temp, (byte)1));
    }

    public static void doDeclarationAndInizializationMultidimentionalArrayTest(){
        System.out.println("***********doDeclarationAndInizializationMultidimentionalArrayTest begin***************");
        int temp[][]={{1,2,3},{4,5},{6}};

        for(int number[]: temp ){
          for(int x=0; x<number.length; x++){
            System.out.print(number[x]+" ");
          }
          System.out.println();
        }

    }

    public static void doSortCharTypeTest(){
        char temp []=new char[5];
        for(int i=0; i<5; i++){
            temp[i]=(char)(i-2);
        }
        System.out.println("***********Before sort***************");
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println("***********After sort***************");
        System.out.println(Arrays.toString(temp));
    }

    public static void doSortCharTypeMultidimensionalArrayTest(){
        char[][] temp={{1,2,3},{3,4}};
        asList(temp);

    }

}
