import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class InventoryTest {

    private Inventory vehicleInventory = new Inventory(new ArrayList<>());
    private Car car1, car2, car3;
    private Truck truck1, truck2, truck3;


    @BeforeClass
    public static void connectTODatabase(){
        System.out.println("Connecting to database......"); //runs only once.
    }

    @SuppressWarnings("Duplicates")
    @Before//executes for every test only once
    public void setUp(){
        System.out.print("Setting things up");
        vehicleInventory = new Inventory(new ArrayList<>());


        car1 = new Car("Toyota", "Camry", false, 25000, 40, 2018, false);
        car2 = new Car("Ferrari", "Monza -SP1", false, 200000, 20, 2019, true);
        car3 = new Car("Tesla", "Model S", true, 45000, 49, 2017, true);

        truck1 = new Truck("Ford", "F_150", true, 55000, 50, 2012, true, 60000);
        truck2 = new Truck("Toyota", "Tacoma", true, 45000, 40, 2017, true, 48000);
        truck3 = new Truck("Nissan", "Frontier", true, 50000, 49, 2019, true, 44000);

        vehicleInventory.add(car1);
        vehicleInventory.add(car2);
        vehicleInventory.add(car3);
        vehicleInventory.add(truck1);
        vehicleInventory.add(truck2);
        vehicleInventory.add(truck3);

    }

    @Test
    public void testAdd(){
        System.out.print("Inside Test 1");
        Assert.assertEquals(6, vehicleInventory.getSizeOfInventory());
    }

    @Test
    public void testRemove(){
        System.out.print("Inside Test 2");
        Vehicle v = new Car("Toyota", "Camry", false, 25000, 40, 2018, false);


        // vehicleInventory.remove(car1);
        if (car1.equals(v))// You can use equals method to copare similarity before you remoce the car. or else, call the Vehicle as a field from the tester class.
        vehicleInventory.remove(v);
        Assert.assertEquals(5, vehicleInventory.getSizeOfInventory());

    }
    @Test
    public void testFindCheapestVehicle(){
        Vehicle cheapestVehicle = vehicleInventory.findCheapestVehicle();
        System.out.println("Inside Test 3");
        Assert.assertEquals(2018, cheapestVehicle.getCarYear() );
        Assert.assertEquals("Toyota", cheapestVehicle.getMake() );
        Assert.assertEquals("Camry", cheapestVehicle.getModel() );

    }

    @Test
    public void testFindMostexpensiveVehicle(){
        Vehicle mostExpensiveVehicle = vehicleInventory.findMostExpensiveVehicle();
        System.out.println("Inside Test 4");
        Assert.assertEquals(2019, mostExpensiveVehicle.getCarYear() );
        Assert.assertEquals("Ferrari", mostExpensiveVehicle.getMake() );
        Assert.assertEquals("Monza -SP1", mostExpensiveVehicle.getModel() );

    }

    @Test
    public void testAveragePrice(){
        System.out.println("Inside Test 5");
        Assert.assertEquals(70000.0, vehicleInventory.getAveragePriceOfAllVehicles(), 0.1);

    }
}
