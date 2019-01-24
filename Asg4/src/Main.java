public class Main {
    public static void main(String [] args) throws Exception {
        Dealership dealership = new Dealership();
        dealership.loadInventoryFromWeb();
        Inventory inventory = dealership.getVehicleInventory();

        System.out.println(inventory.getSizeOfInventory());
        Vehicle cheapest = inventory.findCheapestVehicle();
        System.out.println(cheapest.getMake());
                //

       // dealership.loadInventoryFromWeb(url);
    }
}
