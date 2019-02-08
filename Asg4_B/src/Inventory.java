import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Inventory {
    private List<Vehicle> vehicleList;

    public Inventory(){
        vehicleList = new ArrayList<Vehicle>();
    }
    public Inventory(List vehicleList) {

        this.vehicleList = vehicleList;
    }

    public void add(Vehicle vehicle) {
        vehicleList.add(vehicle);

    }

    public void remove(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }


    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }


    public int getSizeOfInventory() {

        return vehicleList.size();
    }

    public double getAveragePriceOfAllVehicles() {
        double sumOfPrices = 0;
        double averagePrice = 0;
        int totalVehicles = getSizeOfInventory();

        for (Vehicle vehicles : vehicleList) {
            sumOfPrices += vehicles.getRetailPrice();
        }
        averagePrice = sumOfPrices / totalVehicles;

        return averagePrice;
    }
    @SuppressWarnings("Duplicates")
    public Vehicle findCheapestVehicle() {
        Vehicle cheapestVehicle;
        if (getSizeOfInventory() == 0) {
            return null;
        }
        else {
            cheapestVehicle = vehicleList.get(0);
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getRetailPrice() < cheapestVehicle.getRetailPrice()) {
                    cheapestVehicle = vehicle;
                }
            }
            return cheapestVehicle;
        }


    }
    @SuppressWarnings("Duplicates")
    public Vehicle findMostExpensiveVehicle() {
        Vehicle mostExpensiveVehicle;
        if (getSizeOfInventory() == 0) {
            return null;
        } else {
            mostExpensiveVehicle = vehicleList.get(0);
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getRetailPrice() > mostExpensiveVehicle.getRetailPrice()) {
                    mostExpensiveVehicle = vehicle;
                }
            }


            return mostExpensiveVehicle;

        }
    }

    public void printAveragePriceOfAllVehicles() {
        double sumOfPrices = 0;
        double averagePrice;

        for (Vehicle vehicle : vehicleList) {
            //sumOfPrices = vehicles.getRetailPrice();
            sumOfPrices += vehicle.getRetailPrice();
        }
        System.out.println("Sum of Prices: " + sumOfPrices + ", Total vehicles available: " + getSizeOfInventory());
        averagePrice = sumOfPrices / getSizeOfInventory();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Average Price: " + formatter.format(averagePrice));
    }

}
