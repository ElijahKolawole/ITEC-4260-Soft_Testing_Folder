import java.text.NumberFormat;

public class Vehicle implements Comparable<Vehicle> {
    private String make;
    private String model;
    private boolean fourWheelDrive;
    private double retailPrice;
    private int milesPerGallon;
    private int carYear;


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
   public Vehicle(){

   }
    public Vehicle(String make, String model, boolean fourWheelDrive, double retailPrice, int milesPerGallon, int carYear) {
        this.make = make;
        this.model = model;
        this.fourWheelDrive = fourWheelDrive;
        this.retailPrice = retailPrice;
        this.milesPerGallon = milesPerGallon;
        this.carYear = carYear;

    }

    @Override
    public boolean equals(Object obj) {
        boolean response = false;
        Vehicle v = (Vehicle)obj;

        if (this.make.equals(v.getMake()) ){
            response = true;
        }
        else
            response = false;
        return response;
    }

    public void printVehicle() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        if (!fourWheelDrive) {
            System.out.println(carYear + " " + make + " " + model + "\n" + fourWheelDrive + ": not $WD-enabled" + " \n"  + formatter.format(retailPrice) + "\n" + milesPerGallon + "MPG");


        } else {
            System.out.println(carYear + " " + make + " " + model + "\n" + fourWheelDrive + ": $WD-enabled" + " \n" + formatter.format(retailPrice) + "\n" + milesPerGallon + "MPG");

        }
            //System.out.println("******************************************************");
    }

    @Override
    public int compareTo(Vehicle o) {
        return 0;
    }
}
