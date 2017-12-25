package by.gvozdev_htp.task.bean;

public class Region {

	private String regionName;
	private double square;

	public Region(String regionName, double square, double population) {
		this.regionName = regionName;
		this.square = square;
	}

	public String getRegionName() {
		return regionName;
	}

	public double getSquare() {
		return square;
	}



}
