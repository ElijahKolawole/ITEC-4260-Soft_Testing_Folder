public class Car extends Vehicle {
    private boolean convertible;


    public Car(String make, String model, boolean fourWheelDrive, double retailPrice, int milesPerGallon, int carYear, boolean convertible) {
        super(make, model, fourWheelDrive, retailPrice, milesPerGallon, carYear);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void printVehicle() {

        if (convertible == true) {
            super.printVehicle();
            System.out.println(convertible + ": Convertible - enabled");
        } else {
            super.printVehicle();
            System.out.println(convertible + ": Not a Convertible car");


        }
        System.out.println("******************************************************");
    }
}
