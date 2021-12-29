package singletonpattern;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CounselingManager counselingManager1 = CounselingManager.getCounselingManager();
        System.out.println("The first counseling handler instance is : " + counselingManager1);
        
        CounselingManager counselingManager2 = CounselingManager.getCounselingManager();
        System.out.println("The second counseling handler instance is : " + counselingManager2);

	}

}
