package  co.com.oca.java.chapter4.interfaces;

public abstract interface Job{

    public static int PAINTING_JOB = 1;

    public default boolean getAJob(int job){
        if(job!=-1) {
            System.out.println("no trabajo");
            return false;
        }
        System.out.println("si trabajo");
        return true;
    }


}