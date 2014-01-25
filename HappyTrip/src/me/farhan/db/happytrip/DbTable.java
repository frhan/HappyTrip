package me.farhan.db.happytrip;

public class DbTable 
{
	public static final String TABLE_TRIP = "trip";
	public static final String TABLE_MEMBER = "member";
	public static final String TABLE_MEMBER_TRIP = "member_trip";
	public static final String TABLE_EXPENDITURE = "expenditure";
	
	public static final String CREATE_TABLE_TRIP = "CREATE TABLE "+TABLE_TRIP+"(_id INTEGER"
			+ " PRIMARY KEY AUTOINCREMENT NOT NULL,name TEXT NOT NULL,place TEXT,start_date "
			+ " TEXT,end_date TEXT,currency varchar(15),expected_cost numeric(15,2));";
	
	public static final String CREATE_TABLE_MEMBER = "CREATE TABLE "+TABLE_MEMBER+"(_id INTEGER"
			+ " PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,mobile_no TEXT,email TEXT);";
	
	public static final String CREATE_TABLE_MEMBER_TRIP ="CREATE TABLE "+TABLE_MEMBER_TRIP+"(_id INTEGER"
			+ " PRIMARY KEY AUTOINCREMENT,member_id INTEGER,trip_id INTEGER,FOREIGN KEY(member_id)"
			+ " REFERENCES member(_id) ON DELETE CASCADE,FOREIGN KEY(trip_id) REFERENCES trip(_id) ON DELETE CASCADE);";
	
	public static final String CREATE_TABLE_EXPENDITURE ="CREATE TABLE" +TABLE_EXPENDITURE+"(_id INTEGER PRIMARY KEY AUTOINCREMENT,cost "
			+ " REAL NOT NULL,payer_id INTEGER NOT NULL,trip_id INTEGER NOT NULL,date_time TEXT,note TEXT,FOREIGN KEY(trip_id)  REFERENCES "
			+ " trip(_id)  ON DELETE CASCADE,FOREIGN KEY(payer_id)  REFERENCES  member(_id) ON DELETE CASCADE);";
	
		
}
