package edu.uga.cs1302.vehicles;
import java.util.Scanner;

public class VehicleManager {

    //method to print out the menu
    //public to be assessible outside of this class
    //static to allow class access 
    public static boolean menu() {
	boolean print = true;
	System.out.println("Press 1 to see how many vehicles are in the system.");
	System.out.println("Press 2 to see the name and the class of each vehicle.");
	System.out.println("Press 3 to see which vehicles can fly.");
	System.out.println("Press 4 to see which vehicles can float.");
	System.out.println("Press 5 to see which vehicles can float AND fly.");
	System.out.println("Press 6 to see a description of each vehicle.");
	System.out.println("Press h to see brief help information for your system");
	System.out.println("Press q to terminate the program.");
	System.out.println("");
	return print;
    }

    //main method
    public static void main(String args[]) {

	//initializing variables 
	VehicleManagerHelper vmh = new VehicleManagerHelper();
	Vehicle v;
	Ship s;
	Automobile am;
	Airplane ap;
	FlyingBoat fb;
	ElectricAuto ea;
	boolean dontQuit = true;
	
	//initializing Scanner
	Scanner input = new Scanner(System.in);

	//print statement for format
	System.out.println("");
	//calling the menu method to be printed
	menu();

	//while loop to perform the program
	while(dontQuit = true) {

	    //taking in input from the user
	    String option = input.nextLine();
	    System.out.println("");

	    //if case if the user inputs "1"
	    if (option.equals("1")) {
		dontQuit = false;
		//assigning the variable to the array's length
		System.out.println("There are a total number of " + Vehicle.countOfInstances  + " vehicles.");
		System.out.println("");
	    }

	    //else-if the user inputs "2"
	    else if (option.equals("2")) {
                dontQuit = false;
		//for-loop to get the type and name of each vehicles
		for (int i = 0;i < (vmh.arr.length);i++) {
		System.out.println("Type: " + vmh.arr[i].getClass().getSimpleName());
		System.out.println("Name: " + vmh.arr[i].getName());
		System.out.println("");
		}
            }

	    //else-if the user inputs "3"
	    else if (option.equals("3")) {
		//for-loop to find and print only Flyable vehicles
		for (int i = 0;i < (vmh.arr.length);i++) {
		    if ((vmh.arr[i] instanceof Flyable) & (!(vmh.arr[i] instanceof Floatable))) {
			System.out.println("Name: " + vmh.arr[i].getName());
			System.out.println("");
		    }
		}
		System.out.println("These vehicles can fly.");
		System.out.println("");
	    }

	    //else-if the user inputs "4"
	    else if (option.equals("4")) {
		//for-loop to find and print only floatable vehicles
                for (int i = 0;i < (vmh.arr.length);i++) {
                    if ((!(vmh.arr[i] instanceof Flyable)) & ((vmh.arr[i] instanceof Floatable))) {
                        System.out.println("Name: " + vmh.arr[i].getName());
                        System.out.println("");
                    }
                }
                System.out.println("These vehicles can float.");
		System.out.println("");
            }

	    //else-if the user inputs "5"
	    else if (option.equals("5")) {
		//for loop to find and print only vehicles who can fly adn float
                for (int i = 0;i < (vmh.arr.length);i++) {
                    if ((vmh.arr[i] instanceof Flyable) & ((vmh.arr[i] instanceof Floatable))) {
                        System.out.println("Name: " + vmh.arr[i].getName());
                        System.out.println("");
                    }
                }
                System.out.println("These vehicles can float and fly.");
		System.out.println("");
	    }

	    //else if the user inputs "6"
	    else if (option.equals("6")) {
		//for loop to loop through the array
		for (int i = 0;i < vmh.arr.length; i++) {
		    //if the Vehicle is an instance of Ship
		    if (vmh.arr[i] instanceof Ship) {
			s = (Ship) vmh.arr[i];
			System.out.println("Type: " + s.getClass().getSimpleName());
			System.out.println("Name: " + s.getName());
			System.out.println("Manufacturer: " + s.getManufacturer());
			System.out.println("Manufacturer year: " + s.getYearOfMan());
			System.out.println("Tonnage: " + s.getTonnage());
			System.out.println("Owner: " + s.getOwner());
			System.out.println("Max passengers: " + s.getMaxPassengers());
			System.out.println("Top speed: " + s.getTopSpeed() + " mph");
			System.out.println("");
		    }
		    //else-if the vehicle is an instance of Airplane
		    else if (vmh.arr[i] instanceof Airplane) {
			ap = (Airplane) vmh.arr[i];
			System.out.println("Type: " + ap.getClass().getSimpleName());
			System.out.println("Name: " + ap.getName());
			System.out.println("Manufacturer: " + ap.getManufacturer());
			System.out.println("Manufacturer year: " + ap.getYearOfMan());
			System.out.println("Number of engines: " + ap.getNumOfEngines());
			System.out.println("Max altitude: " + ap.getMaxAltitude() + " ft");
			System.out.println("Max Range: " + ap.getMaxRange() + " mi");
			System.out.println("Max passengers: " + ap.getMaxPassengers());
			System.out.println("Top speed: " + ap.getTopSpeed() + " mph");
			System.out.println("");
		    }
		    //else-if the vehicle is an instance of Automobile
		    else if (vmh.arr[i] instanceof Automobile) {
			am = (Automobile) vmh.arr[i];
			System.out.println("Type: " + am.getClass().getSimpleName());
			System.out.println("Name: " + am.getName());
			System.out.println("Manufacturer: " + am.getManufacturer());
			System.out.println("Manufacturer year: " + am.getYearOfMan());
			System.out.println("Engine power: " + am.getHorsepower() + " hp");
			System.out.println("Max passengers: " + am.getMaxPassengers());
			System.out.println("Top speed: " + am.getTopSpeed() + " mph");
			System.out.println("");
		    }
		    //else-if the vehicle is an instance of FlyingBoat
		    else if	(vmh.arr[i] instanceof FlyingBoat) {
			fb = (FlyingBoat) vmh.arr[i];
			System.out.println("Type: " + fb.getClass().getSimpleName());
			System.out.println("Name: " + fb.getName());
			System.out.println("Manufacturer: " + fb.getManufacturer());
			System.out.println("Manufacturer year: " + fb.getYearOfMan());
			System.out.println("Tonnage: " + fb.getTonnage());
			System.out.println("Owner: " + fb.getOwner());
			System.out.println("Number of engines: " + fb.getNumOfEngines());
			System.out.println("Number of propellers: " + fb.getPropellers());
			System.out.println("Max fuel capacity: " + fb.getFuelCapacity() + " L");
			System.out.println("Max altitude: " + fb.getMaxAltitude() + " ft");
			System.out.println("Max Range: " + fb.getMaxRange() + " mi");
			System.out.println("Max passengers: " + fb.getMaxPassengers());
			System.out.println("Top speed: " + fb.getTopSpeed() + " mph");
			System.out.println("");
		    }
		    //else-if the vehicle is an instance of ElectricAuto
		    else if (vmh.arr[i] instanceof ElectricAuto) {
			ea = (ElectricAuto) vmh.arr[i];
			System.out.println("Type: " + ea.getClass().getSimpleName());
			System.out.println("Name: " + ea.getName());
			System.out.println("Manufacturer: " + ea.getManufacturer());
			System.out.println("Manufacturer year: " + ea.getYearOfMan());
			System.out.println("Tansmission: " + ea.getTransmission());
			System.out.println("Battery Size: " + ea.getBatterySize());
			System.out.println("Motor Range: " + ea.getMotorRange());
			System.out.println("Body Style: " + ea.getBodyStyle());
			System.out.println("Engine power: " + ea.getHorsepower());
			System.out.println("Max passengers: " + ea.getMaxPassengers());
			System.out.println("Top speed: " + ea.getTopSpeed() + " mph");
			System.out.println("");
			
		    }
		}
	    }
	    //else-if the user inputs "h"
	    else if (option.equals("h")) {
		menu();
	    }
	    //else-if the user inputs "q"
	    else if (option.equals("q")) {
		System.out.println("Exiting Program. Good Bye.");
		System.out.println("");
		//command to exit program
		System.exit(0);
		System.out.println("");
	    }
	    //else statement for if none of the above commands are entered
	    else {
		System.out.println("Error: Please re-enter a number between 1-6 or the letters 'h' (for help) or 'q' (to quit).");
		//print statement for formatting
		System.out.println("");
	    }
	}
	
    }
    
}
