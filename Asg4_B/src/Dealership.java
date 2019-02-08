import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dealership {
    private Inventory vehicleInventory;



    public Dealership() {
      //  vehicleInventory = new Inventory();
    }

    public void loadInventoryFromWeb() throws Exception {
        String model;
       // String url_file = "inventory - luxury.csv";

        String url_webpage = "https://goo.gl/phaEbQ";
        List<Vehicle> vehicleList = new ArrayList<>();
        this.vehicleInventory = new Inventory(vehicleList);
        Vehicle vehicle;
        List<String> contentAsStrings = null;
        int currentLine = 0;
        List<List<String>> list2 = null;

        // InputStream in = new FileInputStream(url3);
        InputStream in = new URL(url_webpage).openStream();


        String content = IOUtils.toString(in, "UTF-8");
        String[] lines = content.split("\n");
        for (String line : lines) {
            line = line.trim().substring(1, line.length() - 1);
            line = line.replaceAll("\"", "");
            //System.out.println(line);

            String[] words = line.split(","); // words in each line
            contentAsStrings = new ArrayList<>(Arrays.asList(words));
            //currentLine++;//just incase I need to quicklty chcek what is going on at each lineo

            String vehicleName = contentAsStrings.get(0);
            String[] vehicleMake_Model = vehicleName.split(" ");
            String make = vehicleMake_Model[0];

            if (make.equals("Tesla")) //check for Tesla make and model that is three words. Others are simply two words.
                model = vehicleMake_Model[1] + " " + vehicleMake_Model[2];


            else
                model = vehicleMake_Model[1];


            int year = Integer.parseInt(contentAsStrings.get(1));
            double price = Double.parseDouble(contentAsStrings.get(2));
            boolean isConvertible = Boolean.parseBoolean(contentAsStrings.get(3));

            //System.out.println(currentLine +": vehicleName: " + vehicleName + " year: " + year + " price: " + price + " convertible: "+ isConvertible);
             //System.out.println("Make: " + make +" Model: " + model + " Year: " +year + " Price: " + price + " Convertible: " + isConvertible);


             vehicle = new Car();//create instances that will recursively represent all the Vehicles in the chart.
             vehicle.setMake(make);
             vehicle.setModel(model);
             vehicle.setCarYear(year);
             vehicle.setRetailPrice(price);
            ((Car) vehicle).setConvertible(isConvertible);

            vehicleInventory.add(vehicle);




        }



    }



    public Inventory getVehicleInventory() {
        return vehicleInventory;
    }
}
