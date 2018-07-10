package Homework.lesson11;

public class Controller {
    private API[] apis;
    private Room[] rooms;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for(Room room : rooms) {
            if(room.getPersons() == persons && room.getPrice() == price && room.getHotelName() == hotel && room.getCityName() == city) {
                count++;
            }
        }
        Room[] res = new Room[count];
        int index = 0;
        for(Room room : rooms) {
            if(room.getPersons() == persons && room.getPrice() == price && room.getHotelName() == hotel && room.getCityName() == city) {
                res[index] = room;
            }
        }
        return res;
    }
    public Room[] check(API api1, API api2) {
        return null;
    }
}
