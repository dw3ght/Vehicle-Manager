package edu.uga.cs1302.vehicles;

//creating public interface to be assessible by other vehicles that are flyable
public interface Flyable {

    //public to be assessible outside of this class
    public int getMaxAltitude();
    public void setMaxAltitude(int maxAltitude);
    public int getMaxRange();
    public void setMaxRange(int maxRange);

}
