package co.com.oca.java.chapter3;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * Created by developer on 5/08/17.
 */
public class TimeTest {

    public static void doTimeTest(){
        System.out.println (LocalDate.now());
        System.out.println (LocalTime.now());
        System.out.println (LocalDateTime.now());
    }

    public static void doLocalDateTest(int year, int month, int day){
        LocalDate birthDate= LocalDate.of(year,month,day);
        System.out.println ("Birth date:"+birthDate);
        System.out.println ("birthDate < todayDate?: "+ birthDate.isBefore(LocalDate.now()));
        System.out.println ("birthDate > todayDate?: "+ birthDate.isAfter(LocalDate.now()));
        System.out.println ("birthDate = todayDate?: "+ birthDate.isEqual(LocalDate.now()));
        System.out.println ("birthDate + 2 "+ birthDate.plusDays(2));
    }

    public static void doLocalTimeTest(int hour, int minutes, int seconds, int x){
        LocalTime temp2 = LocalTime.of(hour, minutes);
        LocalTime temp3 = LocalTime.of(hour, minutes, seconds);
        LocalTime temp4 = LocalTime.of(hour, minutes, seconds, x);
        System.out.println("just hours, minutes:"+temp2);
        System.out.println("just hours, minutes, seconds:"+temp3);
        System.out.println("just hours, minutes, seconds, x:"+temp4);
    }

    public static void doLocalTimeAllTest(int year, int month, int days, int hour, int minutes, int seconds, int x){
        LocalDateTime temp2 = LocalDateTime.of(year, month, days, hour, minutes);
        LocalDateTime temp3 = LocalDateTime.of(year, month, days, hour, minutes, seconds);
        LocalDateTime temp4 = LocalDateTime.of(year, month, days, hour, minutes, seconds, x);
        System.out.println("just hours, minutes:"+temp2);
        System.out.println("just hours, minutes, seconds:"+temp3);
        System.out.println("just hours, minutes, seconds, x:"+temp4);
    }


}
