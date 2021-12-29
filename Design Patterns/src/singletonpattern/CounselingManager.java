package singletonpattern;

public class CounselingManager {
	
	//declare a static member
    private static volatile CounselingManager counselingManager;
    
    // Creating private constructor to restrict multiple instances
    private CounselingManager(){
        if(counselingManager != null){
            throw new RuntimeException("Please use getCounselingManager() method");
        }
    }
    
    
    public static CounselingManager getCounselingManager(){
        if(counselingManager == null){
            //Acquire the lock to CounselingManager class to get rid of multithreading issue
            synchronized (CounselingManager.class){
                //Double check before creating an object in order to ensure e thread safety
                if(counselingManager == null){
                    counselingManager = new CounselingManager();
                }
            }
        }
        return counselingManager;
    }

}
