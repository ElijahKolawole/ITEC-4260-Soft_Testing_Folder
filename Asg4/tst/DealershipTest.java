import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        //System.out.println("Setting things up");
        dealership = new Dealership();
        dealership.loadInventoryFromWeb();
        //inventory = dealership.getVehicleInventory();
        //url = "inventory - luxury.csv";
        //System.out.println("Set Up ends  >>>");


    }

    @Test
    public void testFindCheapestVehicle() {

        inventory = dealership.getVehicleInventory();
        Vehicle cheapestVehicle = inventory.findCheapestVehicle();


        // System.out.println("cheapest :" + cheapestVehicle.getMake());
        Assert.assertEquals(2017, cheapestVehicle.getCarYear());
        Assert.assertEquals("Genesis", cheapestVehicle.getMake());
        Assert.assertEquals("G90", cheapestVehicle.getModel());
        System.out.println("Inside Test Cheapest::Passed");

    }

    @Test
    public void testFindMostExpesiveVehicle() {

        inventory = dealership.getVehicleInventory();
        Vehicle mostExpensiveVehicle = inventory.findMostExpensiveVehicle();
        System.out.println("Inside Test Most-Expensive::Passed");

        // System.out.println("cheapest :" + cheapestVehicle.getMake());
        Assert.assertEquals(2017, mostExpensiveVehicle.getCarYear());
        Assert.assertEquals("Bugatti", mostExpensiveVehicle.getMake());
        Assert.assertEquals("Chiron", mostExpensiveVehicle.getModel());

    }

    @Test
    public void testGetAveragePriceOfAllVehicles() {
        inventory = dealership.getVehicleInventory();
        double averagePrice = inventory.getAveragePriceOfAllVehicles();
        //System.out.println(averagePrice);
        Assert.assertEquals((int) 495666, (int) averagePrice, 0.0);
        System.out.println("Inside Test AveragePrice::Passed");


    }
}
