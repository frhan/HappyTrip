package me.farhan.db.happytrip;

public class Trip {

	private final int id;
	private String name;
	private String place;
	private String startDate;
	private String endDate;
	private double expectedCost;
	private String currency;
	
	public Trip(final int id,String name,String place,String startDate,
			String endDate,double expectedCost,String currency) 
	{
		this.id = id;
		this.name = name;
		this.place = place;
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedCost = expectedCost;
		this.currency = currency;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getExpectedCost() {
		return expectedCost;
	}
	public void setExpectedCost(double expectedCost) {
		this.expectedCost = expectedCost;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getId() {
		return id;
	}	
	
	
}
