package me.farhan.db.happytrip;

public class DbTable 
{
	public static final String TABLE_TRIP = "WhoToCall";
	public static final String CREATE_TABLE_TRIP = "CREATE TABLE "+TABLE_TRIP+"(_id INTEGER"
			+ " PRIMARY KEY AUTOINCREMENT NOT NULL,name TEXT NOT NULL,place TEXT,start_date "
			+ " TEXT,end_date TEXT,currency varchar(15),expected_cost numeric(15,2))";
}
