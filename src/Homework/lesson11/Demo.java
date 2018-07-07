package Homework.lesson11;

        import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1, 100, 5, new Date(), "Hotel", "Kiev");
        rooms[1] = new Room(2, 120, 5, new Date(), "Hotel", "Kiev");
        rooms[2] = new Room(3, 100, 5, new Date(), "Motel", "Kiev");
        rooms[3] = new Room(4, 450, 20, new Date(), "Hotel", "Kiev");
        rooms[4] = new Room(5, 1000, 1, new Date(), "Elite Hotel", "Kiev");
        rooms[5] = new Room(6, 49832, 6, new Date(), "Elite Big Hotel", "Kiev");

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);


        Room[] array = bookingComAPI.findRooms(150, 5, "Kiev", "Hotel");
        for(Room room : array) {
            System.out.println(room.getId() + " "  + room.getPersons() + " " + room.getHotelName() + " " + room.getPrice());
        }


    }
}
