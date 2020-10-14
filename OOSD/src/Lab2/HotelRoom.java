package Lab2;

public class HotelRoom 
{

	private int roomNumber;
	private String roomType;
	private boolean vacant;
	private double rate;

	public HotelRoom(int roomNumber, String roomType) 
	{
		   setRoomNumber(roomNumber);
		   setRoomType(roomType);
	}
	public HotelRoom(int roomNumber, String roomType, boolean vacant, double rate)
	{
		   setRoomNumber(roomNumber);
		   setRoomType(roomType);
		   setVacant(vacant);
		   setRate(rate);
	}

	public HotelRoom() 
	{
		    setRoomNumber(0);
		    setRoomType("");
		    setVacant(true);
		    setRate(0.0);
	}

	public int getRoomNumber() 
	{
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) 
	{
		if(roomNumber>=0)
		{
			this.roomNumber = roomNumber;
		}
		else
		{
			System.out.println("Invalid room");
		}
	}
	
	public String getRoomType() 
	{
		return roomType;
	}
	
	public void setRoomType(String roomType) 
	{
		this.roomType = roomType;
	}

	public boolean getVacant() 
	{
		return vacant;
	}

	public void setVacant(boolean vacant) 
	{
		this.vacant = vacant;
	}

	public double getRate() 
	{
		return rate;
	}

	public void setRate(double rate) 
	{
		this.rate = rate;
	}
	
	public void isOccupied()
	{
		if(vacant)
		{
			System.out.println("Room is occupied");
		}
		else
		{
			setVacant(true);
			System.out.println("Room is not occupied");
		}
	}
	@Override
	public String toString() 
	{
		return "HotelRoom [roomNumber=" + roomNumber + ", roomType=" + roomType + ", vacant=" + vacant + ", rate=" + rate + "]";
	}
}	

