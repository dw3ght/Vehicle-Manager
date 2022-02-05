package edu.uga.cs1302.vehicles;

public class ElectricAuto extends Vehicle {

    //initializing private variables because only ElectricAuto classes will be able to use this class
    private String transmission;
    private String batterySize;
    private String motorRange;
    private String bodyStyle;
    private int horsepower;
    private int topSpeed;
    private int maxPassengers;

    //Defining an ElectricAuto constrcutor
    public ElectricAuto (String name, String manufacturer, int yearOfMan
			 , int horsepower, int topSpeed, int maxPassengers, String transmission 
			 , String batterySize, String motorRange, String bodyStyle) {
        super(name, manufacturer, yearOfMan);
        this.horsepower = horsepower;
        this.topSpeed = topSpeed;
        this.maxPassengers = maxPassengers;
	this.transmission = transmission;
	this.batterySize = batterySize;
	this.motorRange = motorRange;
	this.bodyStyle = bodyStyle;
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

    //setter for the horsepower
    //public to be assessible outside of this class
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    //getter for the transmission
    //public to be assessible outside of this class
    public String getTransmission() {
	return transmission;
    }

    //setter for the transmission
    //public to be assessible outside of this class
    public void setTransmission(String transmission) {
	this.transmission = transmission;
    }

    //getter for the batter size
    //public to be assessible outside of this class
    public String getBatterySize() {
	return batterySize;
    }

    //setter for the better size
    //public to be assessible outside of this class
    public void setBatterySize(String batterySize) {
	this.batterySize = batterySize;
    }

    //getter for the motor range
    //public to be assessible outside of this class
    public String getMotorRange() {
	return motorRange;
    }

    //setter for the motor range
    //public to be assessible outside of this class
    public void setMotorRange (String motorRange) {
	this.motorRange = motorRange;
    }

    //getter for the body style
    //public to be assessible outside of this class
    public String getBodyStyle() {
	return bodyStyle;
    }

    //setter for the body style
    //public to be assessible outside of this class
    public void setBodyStyle(String bodyStyle) {
	this.bodyStyle = bodyStyle;
    }

}

