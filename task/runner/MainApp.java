package by.gvozdev_htp.task.runner;

import by.gvozdev_htp.task.logic.Process;

public class MainApp {

	public static void main(String[] args) {
		
		
		Process countryName = new Process();
		countryName.setCountry("Республика Беларусь");

		//If you need printing list about information of region, 
		//you can change "setPrint" on true.
		Process.setPrint(false);
		//Create head of Region and create array of region
		Process.generateHead();

	}
}
