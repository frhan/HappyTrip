package me.farhan.db.happytrip;

public class TripMember 
{
	private final int id;
	private Member member;
	private final int tripId;
	
	public TripMember(final int id,Member member, int tripId) 
	{
		this.id = id;
		this.tripId = tripId;
		this.member = member;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public int getId() {
		return id;
	}

	public int getTripId() {
		return tripId;
	}
	
	

}
