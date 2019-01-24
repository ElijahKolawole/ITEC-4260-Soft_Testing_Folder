public class MainTest {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Ford", "F - 150", true, 40000, 20, 1990);
        vehicle1.printVehicle();
        System.out.println("**********************************");
        Car car1 = new Car("Toyota", "Camry", false, 35000, 35, 2019, false);
        car1.printVehicle();
        System.out.println("**********************************");
        Truck truck1 = new Truck("Optimum", "Prime", true, 150000, 75, 1986, true, 15000);
        truck1.printVehicle();


    }
}
