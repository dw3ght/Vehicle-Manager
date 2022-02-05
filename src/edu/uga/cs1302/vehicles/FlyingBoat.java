package edu.uga.cs1302.vehicles;

class FlyingBoat extends Vehicle implements Flyable,Floatable {

    //initializing private variables because only FlyingBoat  classes will be able to use this class
    private String owner;
    private int topSpeed;
    private int maxPassengers;
    private int tonnage;
    private int propellers;
    private int fuelCapacity;
    private int numOfEngines;
    private int maxAltitude;
    private int maxRange;
    
    //Defining an Airplane constrcutor                                                             
    public FlyingBoat(String name, String manufacturer, int yearOfMan, int tonnage
		      , String owner, int topSpeed, int maxPassengers, int propellers, 
		      int fuelCapacity, int numOfEngines, int maxAltitude, int maxRange) {
        super(name, manufacturer, yearOfMan);
        this.tonnage = tonnage;
        this.owner = owner;
        this.topSpeed =topSpeed;
        this.maxPassengers = maxPassengers;
	this.propellers = propellers;
	this.fuelCapacity = fuelCapacity;
	this.numOfEngines = numOfEngines;
	this.maxAltitude = maxAltitude;
	this.maxRange = maxRange;
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

    //getter for the vehicle's fuel capacity
    //public to be assessible outside of this class
    public int getFuelCapacity() {
	return fuelCapacity;
    }

    //setter for the vehicle's fuel capacity
    //public to be assessible outside of this class
    public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
    }

    //getter for the vehicle's propellers
    //public to be assessible outside of this class
    public int getPropellers() {
	return propellers;
    }

    //setter for the vehicle's propellers
    //public to be assessible outside of this class
    public void setPropellers(int propellers) {
	this.propellers = propellers;
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
}
