package Homework.lesson11;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
//        Room[] rooms = new Room[6];
//        rooms[0] = new Room(1, 100, 5, new Date(), "Hotel", "Kiev");
//        rooms[1] = new Room(2, 120, 5, new Date(), "Hotel", "Kiev");
//        rooms[2] = new Room(3, 100, 5, new Date(), "Hotel", "Kiev");
//        rooms[3] = new Room(4, 450, 20, new Date(), "Hotel", "Kiev");
//        rooms[4] = new Room(5, 1000, 1, new Date(), "Elite Hotel", "Kiev");
//        rooms[5] = new Room(6, 49832, 6, new Date(), "Elite Big Hotel", "Kiev");
//
//        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
//
//
//        Room[] array = bookingComAPI.findRooms(150, 5, "Kiev", "Hotel");
//        for(Room room : array) {
//            System.out.println(room.getId() + " "  + room.getPersons() + " " + room.getHotelName() + " " + room.getPrice());
//        }

//        Room[] rooms = new Room[4];
//        rooms[0] = new Room(1, 100, 3, new Date(), "Lawandowe Zgórze", "Paris");
//        rooms[1] = new Room(2, 100, 4, new Date(), "Lawandowe Zgórze", "Paris");
//        rooms[2] = new Room(3, 700, 1, new Date(), "Elite Club", "NewYork");
//        rooms[3] = new Room(4, 1200, 10, new Date(), "Elite Hotel", "LasVegas");
//
//        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
//
//        Room[] room = tripAdvisorAPI.findRooms(100, 3, "Paris", "Lawandowe Zgórze");
//        for (Room room1 : room) {
//            System.out.println(room1.getId() + " " + room1.getPrice() + " " + room1.getPersons());
//        }

        Room[] rooms = new Room[4];
        rooms[0] = new Room(1, 100, 3, new Date(), "Lawandowe Zgórze", "Paris");
        rooms[1] = new Room(2, 100, 4, new Date(), "Lawandowe Zgórze", "Paris");
        rooms[2] = new Room(3, 700, 1, new Date(), "Elite Club", "NewYork");
        rooms[3] = new Room(4, 1200, 10, new Date(), "Elite Hotel", "LasVegas");

        GoogleAPI googleAPI = new GoogleAPI(rooms);

        Room[] room = googleAPI.findRooms(100, 3, "Paris", "Lawandowe Zgórze");
        for (Room room1 : room) {
            System.out.println(room1.getId() + " " + room1.getPrice() + " " + room1.getPersons());
        }

    }
}
