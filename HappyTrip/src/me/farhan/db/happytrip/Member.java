package me.farhan.db.happytrip;

public class Member implements ISpinner{

	private final int id;
	private String name;
	private String mobileNo;
	private String email;
	
	public Member(final int id,String name,String mobileNo,String email) 
	{
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}

	@Override
	public void setTitle(String title) 
	{
		this.name = title;
	}

	@Override
	public String getTitle() {
		return this.name;
	}	
	
}
