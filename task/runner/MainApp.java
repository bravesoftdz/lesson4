package by.gvozdev_htp.task.runner;

import by.gvozdev_htp.task.logic.Process;

public class MainApp {

	public static void main(String[] args) {

		//If you need printing list about information of region, 
		//you can change "setPrint" on true.
		//Print information about districts (true/false)
		Process.setPrint(true);
		//Create head of Region and create array of region
		Process.generateHead();

	}
}
