package edu.uga.cs1302.vehicles;

public abstract class Vehicle implements Transporter {

    //initializinfg variables
    String name;
    String manufacturer;
    int yearOfMan;

    //initializing a count-of-instances variable
    //public to be assessible outside of this class
    //static because only one copy of countOfInstances will be shared amongst any other classes
    public static int countOfInstances;
    
    //creating a vehicle constructor
    public Vehicle (String name, String manufacturer, int yearOfMan) {    
	this.name = name;
	this.manufacturer  = manufacturer;
	this.yearOfMan = yearOfMan;
	countOfInstances++;
    }

    //public methods to be assessible outside of this class
    public abstract String getName();
    public abstract String getManufacturer();
    public abstract int getYearOfMan();
}
