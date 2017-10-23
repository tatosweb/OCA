package co.com.oca.java.chapter4.classes.design;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;
import co.com.oca.java.chapter4.interfaces.Study;
import co.com.oca.java.chapter4.interfaces.Job;

public abstract class Species implements Study, Job{

    public static String ARCHES= "Arches";
    public static String BACTERIA= "Bacteria";
    public static String EUKARYOTES= "Eukaryotes";

    public static String breath(){
        return "General breath";
    }

    public void evolution(){
        getAJob(1);
        studing();
    }

    private void getType(String type, int a)  {

    }

}