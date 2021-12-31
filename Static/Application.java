public class Application{

	//default constructor
	public Application(){
		System.out.println("Default Constructor Executed");
	}

	//overloaded contructor
	public Application(String s){
		System.out.println(s);
	}
	
	//static block
	static{
		System.out.println("\nStatic Block Executed");

	}

	//empty block
	{
		System.out.println("Empty Block Executed");
	}

	public static void main(String []args){
		
		System.out.println("\nMain is running!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");

		System.out.println("\nCreating App Object1--------------------------------------");
		Application app1 = new Application();
		System.out.println("App Object 1 Created--------------------------------------\n");
		
		System.out.println("\nCreating App Object2--------------------------------------");
		Application app2 = new Application("OverLoaded Constructor Executed");
		System.out.println("App Object 2Created--------------------------------------\n");
		
		System.out.println("\nTerminating Main!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
		
	}
}