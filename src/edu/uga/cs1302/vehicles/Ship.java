package edu.uga.cs1302.vehicles;

class Ship extends Vehicle implements Floatable {

    //initializing private variables because only Airplane classes will be able to use this class
    private String owner;
    private int topSpeed;
    private int maxPassengers;
    private int tonnage;

    //Defining an Airplane constrcutor
    public Ship(String name, String manufacturer, int yearOfMan, int tonnage
		     , String owner, int topSpeed, int maxPassengers) {
        super(name, manufacturer, yearOfMan);
	this.tonnage = tonnage;
        this.owner = owner;
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

    //getter for the vehicle's tonnage
    //public to be assessible outside of this class
    public int getTonnage() {
	return tonnage;
    }

    //setter for the vehicle's tonnage
    //public to be assessible outside of this class
    public void setTonnage(int tonnage){
	this.tonnage = tonnage;
    }

    //getter for the vehicle's owner
    //public to be assessible outside of this class
    public String getOwner() {
	return owner;
    }

    //setter for the vehicle's owner
    //public to be assessible outside of this class
    public void setOwner(String owner) {
	this.owner = owner;
    }

    //getter for the vehicle's top speed
    //public to be assessible outside of this class
    public int getTopSpeed() {
        return topSpeed;
    }

    //setter for the vehicle's top speed
    //public to be assessible outside of this class
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    //getter for thr vehicle's maximum passengers
    //public to be assessible outside of this class
    public int getMaxPassengers() {
        return maxPassengers;
    }

    //setters for the maximum number of passengers
    //public to be assessible outside of this class
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
