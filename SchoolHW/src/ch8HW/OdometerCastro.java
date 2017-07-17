package ch8HW;

public class OdometerCastro {

    public final int MAXIMUM_MILEAGE = 999999;

    public final int MPG = 24;

    private int initialMileage;
    private int mileage;

    private FuelGaugeCastro fuelGauge;

    public OdometerCastro(int mileage, FuelGaugeCastro fuelGauge) {
        this.initialMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public int getMileage() {
        return mileage;
    }

    public void addMileage() {

        if (mileage < MAXIMUM_MILEAGE) {
            mileage++;
        } else {
            mileage = 0;
        }

        int driven = initialMileage - mileage;
        if (driven % MPG == 0) {
            fuelGauge.burnFuel();
        }
    }
}
