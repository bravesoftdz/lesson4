package by.gvozdev_htp.task.logic;

import by.gvozdev_htp.task.bean.City;
import by.gvozdev_htp.task.bean.District;
import by.gvozdev_htp.task.bean.DistrictDB;
import by.gvozdev_htp.task.bean.Region;

public class Process {
	private String capital;
	private static String country;
	public static boolean printInformation = true;

	public String getCapital(City[] cities) {
		for (City city : cities) {
			if (city.isCapital() == true) {
				capital = city.getCityName();
				break;
			}
		}
		return capital;
	}

	private int countRegions;

	public int getRegionsAmount(City[] cities) {
		countRegions = 0;
		for (City city : cities) {
			if (city.returnRegionSquare() != 0) {
				countRegions++;
			}
		}
		return countRegions;
	}

	public void printRegions(City[] cities) {
		double sumSquare = 0;
		for (City city : cities) {
			if (city.returnRegionSquare() != 0) {
				sumSquare = sumSquare + city.returnRegionSquare();
				System.out.println(city.returnRegionName() + " область: площадь: " + city.returnRegionSquare() + " км²,"
						+ " плотнность населения: " + city.getPopulation() + " чел./км²");

			}
		}
		System.out.println("\nИтого: площаль страны: " + sumSquare + " км²");
	}

	public void printRegionalCenters(City[] cities) {
		int countRegion = 0;
		System.out.println("\nРегиональные центры:");
		for (City city : cities) {
			if (city.isRegioanlCenter() == true) {
				countRegion++;
				System.out.println(countRegion + ". " + city.getCityName());
				String[][] newArr = DistrictDB.getArrRegion();
				if (this.printInformation == true) {
					System.out.printf("        %15s %20s %20s \t \n", "Наименование района", "Площадь (км²)",
							"Плотность (чел/км²)");
				}

				for (int i = 0; i < newArr.length; i++) {
					if (newArr[i][0] == city.getCityName() && this.printInformation == true) {
						System.out.printf("        %15s %20s %20s \t \n", newArr[i][1], newArr[i][2], newArr[i][3]);
					}
				}
			}
		}
	}

	public static boolean isPrint() {
		return printInformation;
	}

	public static void setPrint(boolean printInformation) {
		Process.printInformation = printInformation;
	}

	public static String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		Process.country = country;
	}

	public static void generateHead() {

		City[] cities = new City[6];

		cities[0] = new City("Минск", new Region("Минская", 1902.66, 208787), new District("Минский"), true, true,
				208787);
		cities[1] = new City("Гродно", new Region("Гродненская", 2594.05, 49987), new District("Гродненский"), false,
				true, 49987);
		cities[2] = new City("Брест", new Region("Брестская", 1544.11, 42037), new District("Брестский"), false, true,
				42037);
		cities[3] = new City("Гомель", new Region("Гомельская", 1951.42, 68210), new District("Гомельский"), false,
				true, 68210);
		cities[4] = new City("Витебск", new Region("Витебская", 2705.12, 37206), new District("Витебский"), false, true,
				37206);
		cities[5] = new City("Могилёв", new Region("Могилёвская", 1895.40, 40130), new District("Могилёвский"), false,
				true, 40130);

		Process state = new Process();

		System.out.println("Государство: " + Process.getCountry());
		System.out.println("Столица государства:  " + state.getCapital(cities));
		System.out.println("\nКоличество регионов: " + state.getRegionsAmount(cities) + "\n");
		state.printRegions(cities);
		state.printRegionalCenters(cities);
	}

}
