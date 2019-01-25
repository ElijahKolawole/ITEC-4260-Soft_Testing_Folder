import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.NumberFormat;

public class DealershipTest {
    //String url;

    private Inventory inventory;
    private Dealership dealership;

    @BeforeClass
    public static void beginTesting() {
        System.out.println("Starting testing...");
    }

    @Before
    public void setUp() throws Exception {

        dealership = new Dealership();
        dealership.loadInventoryFromWeb();


    }

    @Test
    public void testFindCheapestVehicle() {

        inventory = dealership.getVehicleInventory();
        Vehicle cheapestVehicle = inventory.findCheapestVehicle();


        System.out.println("cheapest :" + cheapestVehicle.getMake() + " " + cheapestVehicle.getModel());
        Assert.assertEquals(2017, cheapestVehicle.getCarYear());
        Assert.assertEquals("Genesis", cheapestVehicle.getMake());
        Assert.assertEquals("G90", cheapestVehicle.getModel());
        System.out.println("Inside Test Cheapest::Passed");

    }

    @Test
    public void testFindMostExpensiveVehicle() {

        inventory = dealership.getVehicleInventory();
        Vehicle mostExpensiveVehicle = inventory.findMostExpensiveVehicle();
        System.out.println("Inside Test Most-Expensive::Passed");

        System.out.println("most-expensive :" + mostExpensiveVehicle.getMake() + " " + mostExpensiveVehicle.getModel());
        Assert.assertEquals(2017, mostExpensiveVehicle.getCarYear());
      //  Assert.assertEquals("Bugatti", mostExpensiveVehicle.getMake());
        Assert.assertEquals("Chiron", mostExpensiveVehicle.getModel());

    }

    @Test
    public void testGetAveragePriceOfAllVehicles() {
        NumberFormat nFormat = NumberFormat.getCurrencyInstance();
        inventory = dealership.getVehicleInventory();
        double averagePrice = inventory.getAveragePriceOfAllVehicles();
        String output = String.format("%.0f", inventory.getAveragePriceOfAllVehicles());
        System.out.println("average-price; " + nFormat.format(Double.parseDouble(output)));
        Assert.assertEquals(495666, (int) averagePrice, 0.0);
        System.out.println("Inside Test AveragePrice::Passed");


    }
}
