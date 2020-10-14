package Lab2;

public class HotelDriver {

	public static void main(String[] args) {
		HotelRoom[] rooms=new HotelRoom[3];
		HotelRoom roomA=new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		HotelRoom roomB=new HotelRoom(201, "Double");
//		System.out.println("Room number is "+roomA.getRoomNumber()+", type is "+roomA.getRoomType());		
//		System.out.println("Room number is "+roomB.getRoomNumber()+", type is "+roomB.getRoomType());
		roomA.setVacant(false);
		roomA.setRate(100.0);
		roomB.setVacant(true);
		roomB.setRate(80.0);
		HotelRoom roomC=new HotelRoom(202,"Single",true,90.0);
		rooms[0]=roomA;
		rooms[1]=roomB;
		rooms[2]=roomC;
		for(HotelRoom h:rooms)
		{
			if (h!=null)
			{
				System.out.println(h.toString());
			}
		}
		roomA.isOccupied();
	}

}