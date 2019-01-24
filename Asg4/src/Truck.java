public class Truck extends Vehicle {
    private boolean sideStep;
    private double towCapacity;

    public Truck(String make, String model, boolean fourWheelDrive, double retailPrice, int milesPerGallon, int carYear, boolean sideStep, double towCapacity) {
        super(make, model, fourWheelDrive, retailPrice, milesPerGallon, carYear);
        this.sideStep = sideStep;
        this.towCapacity = towCapacity;
    }

    public boolean isSideStep() {
        return sideStep;
    }

    public void setSideStep(boolean sideStep) {
        this.sideStep = sideStep;
    }

    public double getTowCapacity() {
        return towCapacity;
    }

    public void setTowCapacity(double towCapacity) {
        this.towCapacity = towCapacity;
    }

    public void printVehicle() {

        if (sideStep == true) {
            super.printVehicle();
            System.out.println("tow capacity: " + towCapacity + "tons");
            System.out.println(sideStep+ ": Sidestep - enabled");
        } else {
            super.printVehicle();
            System.out.println("tow capacity: " + towCapacity + " tons");
            System.out.println(sideStep + ": Not Sidestep - enabled");


        }
        System.out.println("******************************************************");
    }
}
