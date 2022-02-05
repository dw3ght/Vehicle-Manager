This is a simple prgram that takes in input from the user and
allows then to view Vehicles based upon their types such as:
Transporter, Flyable, and Floatable. Subclasses were then created to
create vehicle of those interfaces: Automobiles, Airplanes,
Ship, FlyingBoat, and ElectricAuto.

The package in this project is package edu.uga.cs1302.vehicles.
All classes have this package declaration which mirros the package
and source files of the java class.

To compile any of the java programs in this project:

   - begin in Project2
   - in Project2 source
     	- $ javac -d classes src/edu/uga/cs1302/vehicles/*.java
	- (bash profile must be edited)

and to run it, you need to provide the fully-qualified name
of the class with the main method:

   - $ java edu.uga.cs1302.vehicles.VehicleManager

Your CLASSPATH must include the ./classes directory.
Alternatively, you may provide the -cp option:

   - $ java -cp classes edu.uga.cs1302.vehicles.VehicleManager
