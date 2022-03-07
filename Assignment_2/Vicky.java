import java.util.Scanner;

public class Vicky{
	
	public static void main(String args[]){
		
		double travelDistance = 0;
		int count = 0;
		int totalTime = 0;
		boolean valid;
		System.out.println("I am Vicky ..");
		
		do{
			try{
				//create object of scanner class
				Scanner scObj = new Scanner(System.in);
				System.out.println("Enter the total distance : ");
				
				// get and store the user input in travelDistance variable
				travelDistance = scObj.nextInt();
				System.out.println("Vicky should travel for" + travelDistance + "m");
				valid = false;
				
				while(travelDistance > 0){
					travelDistance =travelDistance - 5;
					totalTime=totalTime+1;
					System.out.println("Existing traval distance " + travelDistance + "m");
					System.out.println("totalTime Count " + totalTime);
					if(travelDistance > 0)
					{
						travelDistance =travelDistance - 3;
						totalTime=totalTime+2;
						System.out.println("Existing traval distance " + travelDistance + "m");
						System.out.println("totalTime Count " + totalTime);
						
					}
					if(travelDistance > 0)
					{
						travelDistance =travelDistance - 1;
						totalTime=totalTime+3;
						System.out.println("Existing traval distance " + travelDistance + "m");
						System.out.println("totalTime Count " + totalTime);
					}	
				}
				if(travelDistance == 0){
					System.out.println("Existing traval distance " + travelDistance + "m");
					System.out.println("totalTime Count " + totalTime);
					System.out.println("Vicky do not have more distance to traval ..");
				}
				
				System.out.println("The total time taken for the vicky to finish the distance " + totalTime );	
				
			}catch(Exception e){
				System.out.println("Only allowed integer values");
				valid=true;			
			}
		}
		while(valid);		
	}
}