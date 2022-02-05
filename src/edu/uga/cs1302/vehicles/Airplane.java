package edu.uga.cs1302.vehicles;

class Airplane extends Vehicle implements Flyable{

    //initializing private variables because only Airplane classes will be able to use this class
    private int topSpeed;
    private int maxPassengers;
    private int numOfEngines;
    private int maxAltitude;
    private int maxRange;

    //Defining an Airplane constrcutor
    public Airplane (String name, String manufacturer, int yearOfMan,int numOfEngines 
		     ,int maxAltitude ,int maxRange ,int topSpeed, int maxPassengers) {
	super(name, manufacturer, yearOfMan);
	this.numOfEngines = numOfEngines;
	this.maxAltitude = maxAltitude;
	this.maxRange = maxRange;
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

    //getter for the number of engines
    //public to be assessible outside of this class
    public int getNumOfEngines() {
	return numOfEngines;
    }

    //setter for the number of engined
    //public to be assessible outside of this class
    public void setNumofEngines(int numOfEngines) {
	this.numOfEngines = numOfEngines;
    }

    //getter for the maximum altitude
    //public to be assessible outside of this class
    public int getMaxAltitude() {
	return maxAltitude;
    }

    //setter for the max altitude
    //public to be assessible outside of this class
    public void setMaxAltitude(int maxAltitude) {
	this.maxAltitude = maxAltitude;
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

    //getter for the maximum range
    //public to be assessible outside of this class
    public int getMaxRange() {
	return maxRange;
    }

    //setter for the maximum range
    //public to be assessible outside of this class
    public void setMaxRange(int maxRange) {
	this.maxRange = maxRange;
    }
}
