package ch8HW;


public class FuelOdometerDriverCastro {

	public static void main(String[] args) {

	    FuelOdometerDriverCastro Simulator = new FuelOdometerDriverCastro();

	    FuelGaugeCastro fuel = Simulator.new FuelGaugeCastro();
	    OdometerCastro odometer = Simulator.new OdometerCastro(0, fuel);

	    for (int x = 0; x < FuelGaugeCastro.MAXIMUM_GALLONS; x++) {
	        fuel.addGallons();
	    }

	    while (fuel.getGallons() > 0) {

	        odometer.addMileage();

	        System.out.println("Mileage: " + odometer.getMileage());

	        System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
	        System.out.println("------------------------------");
	    }
	}
}
