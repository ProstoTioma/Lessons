package Homework.lesson11;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] rooms1;
        for (Room room : rooms) {
            if (price == room.getPrice()) {
                if (persons == room.getPersons())
                    if(city == room.getCityName())
                        if(hotel == room.getHotelName())
                    rooms1 = rooms;
            }
        }
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
