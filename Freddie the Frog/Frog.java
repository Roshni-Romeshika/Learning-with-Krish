import java.util.Scanner;

public class Frog{

	//declaring and initializing frog's jumping process realted varibales
	private int distance = 0;
	private double restingTime = 0.0;
	private int hopCount = 0;
	private int userDefinedDistance = 0;


	//creating getters and setters
	public void setDistance(int distance){
		this.distance = distance;
	}
	public int getDistance(){
		return distance;
	}

	public void setRestingTime(double restingTime){
		this.restingTime = restingTime;
	}
	public double getRestingTime(){
		return restingTime;
	}
	
	public void setHopCount(int hopCount){
		this.hopCount = hopCount;
	}
	public int getHopCount(){
		return hopCount;
	}

	public void setUserDefinedDistance(int userDefinedDistance){
		this.userDefinedDistance = userDefinedDistance;
	}
	public int getUserDefinedDistance(){
		return userDefinedDistance;
	}

	//implementation for getUserInput() method to allows user to enter the distance frog should jump
	public void getUserInput(){
		System.out.println("\nReady to enter the distance frog should jump");
		System.out.println("Enter the total distance in meters:  ");
		Scanner distanceInput = new Scanner(System.in);
		userDefinedDistance = distanceInput.nextInt();

		//checks the user input value is a positive number or not
		if(userDefinedDistance <= 0 ) {
			System.out.println("\n");
			System.out.println("!!! Please Do Enter Positive Numeric Value !!!");
			System.out.println("Again Enter the total distance in meters: ");
			userDefinedDistance = distanceInput.nextInt();
		}
		distanceInput.close();

		//invoke calculateHopAndRestingTime() method inside the getUserInput() method
		calculateHopAndRestingTime();


		
	}

	/*implementation of calculateHopAndRestingTime(), which calculate the number of hops
	and total resting time taken by frog while it is jumping.*/
	public void calculateHopAndRestingTime(){

		while(distance<userDefinedDistance){
			hopCount++;
			distance += 5;
			if(distance>=userDefinedDistance){
				break;
			}
			restingTime += 1;

			hopCount++;
			distance += 3;
			if(distance>=userDefinedDistance){
				break;
			}
			restingTime += 2;

			hopCount++;
			distance += 1;
			if(distance>=userDefinedDistance){
				break;
			}
			restingTime += 3.5;
		}
		System.out.println("Total Hop Count for " + userDefinedDistance+"m:    " +  hopCount);
		System.out.println("Total Resting Time (in seconds) for " + userDefinedDistance+"m:   " +  restingTime);


	}



}