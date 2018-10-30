package application;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.TreeItem;


public class TreeViewHelper {

	public TreeViewHelper() {
		
	}
	
	public ArrayList<TreeItem> getProducts() {
		ArrayList<TreeItem> products = new ArrayList<TreeItem>();
		
		TreeItem users = new TreeItem("Users");
		users.getChildren().addAll(getUsers());
		
		TreeItem cars = new TreeItem("Cars");
		cars.getChildren().addAll(getCars());
		
		TreeItem buses = new TreeItem("Buses");
		cars.getChildren().addAll(getBuses());
		
		TreeItem trucks = new TreeItem("Trucks");
		cars.getChildren().addAll(getTrucks());
		
		TreeItem motorcycles = new TreeItem("Motorcycles");
		cars.getChildren().addAll(getMotorcycles());
		
//		products.add(cars);
//		products.add(trucks);
//		products.add(motorcycles);
//		products.add(buses);
		products.add(users);
		
		return products;
	}

	private ArrayList<TreeItem> getUsers() {
		ArrayList<TreeItem> users = new ArrayList<TreeItem>();
		
		File folder = new File("C:\\Users");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    users.add(new TreeItem(listOfFiles[i].getName()));
		  } else if (listOfFiles[i].isDirectory()) {
			users.add(new TreeItem(listOfFiles[i].getName()));
		  }
		}
		
		return users;
	}

	private ArrayList<TreeItem> getMotorcycles() {
		ArrayList<TreeItem> motorcycles = new ArrayList<TreeItem>();
		
		TreeItem harley = new TreeItem("Harley");
		TreeItem suzuki = new TreeItem("Suzuki");
		
		motorcycles.add(harley);
		motorcycles.add(suzuki);
		
		return motorcycles;
	}

	private ArrayList<TreeItem> getTrucks() {
		ArrayList<TreeItem> trucks = new ArrayList<TreeItem>();
		
		TreeItem scania = new TreeItem("scania");
		TreeItem mercedes = new TreeItem("mercedes");
		
		trucks.add(mercedes);
		trucks.add(scania);
		
		return trucks;
	}

	private ArrayList<TreeItem> getBuses() {
		ArrayList<TreeItem> buses = new ArrayList<TreeItem>();
		
		TreeItem gm = new TreeItem("GM");
		TreeItem vw = new TreeItem("VW");
		
		buses.add(gm);
		buses.add(vw);
		
		return buses;
	}

	private ArrayList<TreeItem> getCars() {
		ArrayList<TreeItem> cars = new ArrayList<TreeItem>();
		
		TreeItem mercedes = new TreeItem("Mercedes");
		TreeItem scania = new TreeItem("Scania");
		
		cars.add(mercedes);
		cars.add(scania);
		
		return cars;
	}
	
}
