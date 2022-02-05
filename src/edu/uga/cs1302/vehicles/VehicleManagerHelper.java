package edu.uga.cs1302.vehicles;

public class VehicleManagerHelper{

    //initializing an array
    //public to be assessible outside of this class
    public Vehicle[] arr = new Vehicle[15];

    //method to give array values for specific vehicles
    //public to be assessible outside of this class
    public VehicleManagerHelper() {
	    arr[0] = new Ship("SS United States", "Newport News Shipbuilding and Drydock Company",
			      1949, 53330, "SS United States Conservancy", 80, 1928);
	    arr[1] = new Ship("Queen Elizabeth 2", "John Brown and Company", 1964, 70327,
                              "Dubai Istithmar", 63, 1892);
            arr[2] = new Ship("Queen Mary 2", "Chantiers de Atlantique", 2004, 149215, "Carnival"
                              , 35, 2695);
            arr[3] = new Automobile("F8 Tributo", "Ferrari", 2019, 710, 211, 2);
            arr[4] = new Automobile("McLaren 720S", "McLaren Automotive", 2017, 710, 212, 2);
            arr[5] = new Automobile("Mustang Shelby GT350R", "Ford", 2017, 526, 175, 2);
            arr[6] = new Airplane("Airbus A320 family", "Airbus", 1986, 1, 41000, 6112, 871, 196);
            arr[7] = new Airplane("Douglas DC-3", "Douglas Aircraft Company", 1936, 2, 23200
                                  , 1491, 230, 32);
            arr[8] = new Airplane("Boeing 787", "Boeing", 2014, 2, 43000, 8500, 587,280);
            arr[9] = new FlyingBoat("Cessna 208 Caravan", "Cessna", 1984, 3070,
                                    "FedEx Feeder", 324, 13, 3, 2224, 1, 25000, 5300);
            arr[10] = new FlyingBoat("Seastar", "Dornier Seawings", 1984, 1700,
                                     "Claudius Dornier Jr", 417, 12, 4, 1387, 2, 14800, 2830);
            arr[11] = new FlyingBoat("PBY Catalina", "Consolidated Aircraft", 1936, 6581,
                                     "United States Navy", 315, 10, 3, 6624, 2, 15800, 2520);
            arr[12] = new ElectricAuto("Tesla Model X", "Tesla, Inc.", 2020, 259, 155, 7,
                                   "Single-speed", "75 kWh max", "305 miles", "5-Door SUV");
            arr[13] = new ElectricAuto("Nissan Leaf", "Nisan", 2020, 214, 150, 5,
				       "Single-speed", "40 kWh max", "149 miles", "5-Door Hatchback");
            arr[14] = new ElectricAuto("Jaguar I-Pace", "Jaguar Land Rover", 2020, 394, 200, 5,
				       "Single-speed", "90 kWh max", "246 miles", "5-Door SUV");
    }
}
