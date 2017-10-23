package co.com.oca.java.chapter4.interfaces;

public abstract interface Study extends Job{

    default boolean studing(){
        getAJob(1);
        return true;
    }

    public default boolean getAJob(int job){
        if(job!=-1)
            return false;
        return true;
    }
}