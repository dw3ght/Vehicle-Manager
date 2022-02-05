package edu.uga.cs1302.vehicles;

class Automobile extends Vehicle {

    //initializing private variables because only Automobiles classes will be able to use this class
    private int horsepower;
    private int topSpeed;
    private int maxPassengers;

    //Defining an Automobile constrcutor 
    public Automobile (String name, String manufacturer, int yearOfMan
		       , int horsepower, int topSpeed, int maxPassengers) {
	super(name, manufacturer, yearOfMan);
	this.horsepower = horsepower;
	this.topSpeed =topSpeed;
	this.maxPassengers = maxPassengers;
    }

    //getter for the name                                                                        
    //public to be assessible outside of this class
    public String getName() {
	return name;
    }

    //setter for the name                                                                          
    //public to be assessible outside of this class
    public void setName(String name) {                                                           
	this.name = name;                                                                          
    }                                                                                            

    //getter for the manufacturer                                                                  
    //public to be assessible outside of this class
    public String getManufacturer() {
	return manufacturer;
    }

    //setter for the manufacturer                                                                  
    //public to be assessible outside of this class
    public void setManufacturer(String manufacturer) {                                          
	this.manufacturer = manufacturer;                                                          
    }                                                                                            

    //getter for the year of manufacturer                                                          
    //public to be assessible outside of this class
    public int getYearOfMan() {
	return yearOfMan;
    }

    //setter for the year of manufacturer                                        
    //public to be assessible outside of this class
    public void setYearOfMan(int setYearOfMan) {                                              
	this.yearOfMan = yearOfMan;    
    }

    //getter for the top speed                                                                     
    //public to be assessible outside of this class
    public int getTopSpeed() {
	return topSpeed;
    }

    //setter for the top speed                                                                     
    //public to be assessible outside of this class
    public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
    }

    //getter for the maximum number of passengers                                                  
    //public to be assessible outside of this class
    public int getMaxPassengers() {
	return maxPassengers;
    }

    //setter for the maximum number of passengers                                                  
    //public to be assessible outside of this class
    public void setMaxPassengers(int maxPassengers) {
	this.maxPassengers = maxPassengers;
    }

    //getter for the horsepower
    //public to be assessible outside of this class
    public int getHorsepower() {
	return horsepower;
    }

    //getter for horsepower
    //public to be assessible outside of this class
    public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
    }
}
