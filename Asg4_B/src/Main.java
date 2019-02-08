public class Main {
    public static void main(String [] args) throws Exception {
        final Dealership DEALERSHIP = new Dealership();
        DEALERSHIP.loadInventoryFromWeb();
         Inventory inventory = DEALERSHIP.getVehicleInventory();//test if vehicles have been siuccessfully loaded

        System.out.println(inventory.getSizeOfInventory());
        Vehicle cheapest = inventory.findCheapestVehicle();
       // System.out.println(cheapest.getMake());
        inventory.getVehicleList().get(0).printVehicle();

                //

       // dealership.loadInventoryFromWeb(url);
    }
}
