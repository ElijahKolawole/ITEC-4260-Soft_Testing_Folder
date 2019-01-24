import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dealership {
    private Inventory vehicleInventory;
    private String model;


    public Dealership(Inventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;

    }

    public void loadInventoryFromWeb() throws Exception {
        String url = "inventory - luxury.csv";
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleInventory = new Inventory(vehicleList);
        Vehicle vehicle;
        List<String> list1 = null;
        int currentLine = 0;
        List<List<String>> list2 = null;

        // url = "inventory - luxury.csv";

        InputStream in = new FileInputStream(url);
        //InputStream in = new URL("https://goo.gl/phaEbQ").openStream();

        String content = IOUtils.toString(in, "UTF-8");
        String[] lines = content.split("\n");
        for (String line : lines) {
            line = line.trim().substring(1, line.length() - 1);
            line = line.replaceAll("\"", "");

            String[] words = line.split(",");
            list1 = new ArrayList<>(Arrays.asList(words));
            currentLine++;

            //String word = "";


            // System.out.println(list1);

            // System.out.println(list1.size());
            list2 = new ArrayList<>();

            // if (list2 != null) {
            list2.add(list1);
            // }
            // System.out.println(list1.get(0));
            String name = list1.get(0);
            String[] nameItems = name.split(" ");
            String make = nameItems[0];
            String model = " ";
            if (currentLine == 1)
                model = nameItems[1] + " " + nameItems[2];

            else
                model = nameItems[1];


            int year = Integer.parseInt(list1.get(1));
            double price = Double.parseDouble(list1.get(2));
            boolean isConvertible = Boolean.parseBoolean(list1.get(3));

            // System.out.println(currentLine +": Name: " + name + " year: " + year + " price: " + price + " convertible: "+ isConvertible);
            //  System.out.println("Make: " + make +" Model: " + model + " Year: " +year + " Price: " + price + " Convertible: " + isConvertible);


            vehicle = new Car();
            vehicle.setMake(make);
            vehicle.setModel(model);
            vehicle.setCarYear(year);
            vehicle.setRetailPrice(price);
            ((Car) vehicle).setConvertible(isConvertible);
            /// String name = list1.get(0);
            //String name = list1.get(0);
            //vehicle.printVehicle();
            vehicleInventory.add(vehicle);
            //System.out.println( vehicleInventory.getSizeOfInventory());


            //System.out.println(list2.size());


        }
        String cheapest = vehicleInventory.findCheapestVehicle().getMake() + " " + vehicleInventory.findCheapestVehicle().getModel();
        String mostExpensive = vehicleInventory.findMostExpensiveVehicle().getMake() + " " + vehicleInventory.findMostExpensiveVehicle().getModel();

        System.out.println("Cheapest: " + cheapest);
        System.out.println("Most-Expensive: " + mostExpensive);
        NumberFormat nFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Average: " + nFormat.format(vehicleInventory.getAveragePriceOfAllVehicles()));


    }

    public void setVehicleInventory(Inventory inventory) {
        this.vehicleInventory = inventory;
    }

    public Inventory getVehicleInventory() {
        return vehicleInventory;
    }
}
