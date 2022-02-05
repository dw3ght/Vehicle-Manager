package edu.uga.cs1302.vehicles;

//creating a public interface Transporter to be used for feature transporter classes
public interface Transporter {

    //public to be assessible outside of this class
    public int getMaxPassengers();
    public void setMaxPassengers(int maxPassengers);
    public int getTopSpeed();
    public void setTopSpeed(int topSpeed);

}
