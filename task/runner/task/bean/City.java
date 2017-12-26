package by.gvozdev_htp.task.bean;

public class City {

	private String cityName;
	private String region;
	private double regionSquare;
	private String district;
	private boolean isCapital;
	private boolean isRegionalCenter;
	private double population;

	public City(String cityName, Region region, District district, boolean isCapital, boolean isRegioanlCenter, double population) {
		this.cityName = cityName;
		this.region = region.getRegionName();
		this.regionSquare = region.getSquare();
		this.setDistrict(district.getDistrict());
		this.isCapital = isCapital;
		this.isRegionalCenter = isRegioanlCenter;
		this.population = population;
	}

	public String getCityName() {
		return cityName;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public double returnRegionSquare() {
		return regionSquare;
	}

	public String returnRegionName() {
		return region;
	}

	public boolean isRegioanlCenter() {
		return isRegionalCenter;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

}