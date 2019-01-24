import java.util.ArrayList;

public class InventoryTest {

    public static void main(String[] args) {


        Inventory vehicleInventory = new Inventory(new ArrayList<>());


        Car car1 = new Car("Toyota", "Camry", false, 25000, 40, 2018, false);
        Car car2 = new Car("Ferrari", "Monza -SP1", false, 200000, 20, 2019, true);
        Car car3 = new Car("Tesla", "Model S", true, 45000, 49, 2017, true);

        Truck truck1 = new Truck("Ford", "F_150", true, 55000, 50, 2012, true, 60000);
        Truck truck2 = new Truck("Toyota", "Tacoma", true, 45000, 40, 2017, true, 48000);
        Truck truck3 = new Truck("Nissan", "Frontier", true, 50000, 49, 2019, true, 44000);


        vehicleInventory.add(car1);
        vehicleInventory.add(car2);
        vehicleInventory.add(car3);
        vehicleInventory.add(truck1);
        vehicleInventory.add(truck2);
        vehicleInventory.add(truck3);

        //vehicleInventory.remove(car1);


        for (Vehicle vehicle : vehicleInventory.getVehicleList()) {
           // vehicle.printVehicle();
        }

       // System.out.println("Total No. of vehicles: " + vehicleInventory.getVehicleList().size());
        // Vehicle currentVehicle = vehicleList.get(5);
        //System.out.print(currentVehicle.getCarYear() +" " + currentVehicle.getMake() +" " + currentVehicle.getModel());
       vehicleInventory.findCheapestVehicle();
       System.out.println("Cheapest Vehicle: "  +  vehicleInventory.findCheapestVehicle().getModel());
        System.out.println("Most Expensive Vehicle: "  +  vehicleInventory.findMostExpensiveVehicle().getCarYear());


        vehicleInventory.findMostExpensiveVehicle();
       vehicleInventory.getAveragePriceOfAllVehicles();
       vehicleInventory.printAveragePriceOfAllVehicles();

    }
}
