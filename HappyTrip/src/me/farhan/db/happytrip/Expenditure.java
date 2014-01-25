package me.farhan.db.happytrip;

public class Expenditure {
	
	private final int id;
	private Member payer;
	private double cost;
	private String dateTime;
	private String note;
	
	public Expenditure(final int id,Member payer,double cost,String dateTime,String note) 
	{
		this.id = id;
		this.payer = payer;
		this.cost = cost;
		this.dateTime = dateTime;
		this.note = note;
	}

	public Member getPayer() {
		return payer;
	}

	public void setPayer(Member payer) {
		this.payer = payer;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getId() {
		return id;
	}
}
