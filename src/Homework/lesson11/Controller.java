package Homework.lesson11;

public class Controller {
    private API[] apis;
    private Room[] rooms;
//    BookingComAPI bookingComAPI;
//    TripAdvisorAPI tripAdvisorAPI;
//    GoogleAPI googleAPI;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        bookingComAPI.findRooms(price, persons, city, hotel);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
        tripAdvisorAPI.findRooms(price, persons, city, hotel);
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        googleAPI.findRooms(price, persons, city, hotel);
//        int count = 0;
//        for(Room room : rooms) {
//            if(room.getPersons() == persons && room.getPrice() == price && room.getHotelName() == hotel && room.getCityName() == city) {
//                count++;
//            }
//        }
//        Room[] res = new Room[count];
//        int index = 0;
//        for(Room room : rooms) {
//            if(room.getPersons() == persons && room.getPrice() == price && room.getHotelName() == hotel && room.getCityName() == city) {
//                res[index] = room;
//            }
//        }
//        return res;
//        for(API api : apis) {
//
//            bookingComAPI.findRooms(price, persons, city, hotel);
//            tripAdvisorAPI.findRooms(price, persons, city, hotel);
//            googleAPI.findRooms(price, persons, city, hotel);
//        }
        return rooms;

    }
    public Room[] check(API api1, API api2) {
//        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
//        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
//        GoogleAPI googleAPI = new GoogleAPI(rooms);
        int count = 0;

        for(Room room : rooms) {
            if(api1.findRooms(room.getPrice(), room.getPersons(), room.getCityName(), room.getHotelName()) == api2.findRooms(room.getPrice(), room.getPersons(), room.getCityName(), room.getHotelName())) {
                count++;
            }
        }
        Room[] res = new Room[count];
        int index = 0;
        for(Room room : rooms) {
            if(api1.findRooms(room.getPrice(), room.getPersons(), room.getCityName(), room.getHotelName()) == api2.findRooms(room.getPrice(), room.getPersons(), room.getCityName(), room.getHotelName())) {
                res[index] = room;
                index++;
            }
        }
        return res;
    }
}
