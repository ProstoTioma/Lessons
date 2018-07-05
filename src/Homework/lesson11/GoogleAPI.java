package Homework.lesson11;

public class GoogleAPI implements API {
    private Room[] rooms;
    private Room[] rooms1;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (Room room : rooms) {
            if (price == room.getPrice()) {
                if (persons == room.getPersons())
                    if(city == room.getCityName())
                        if(hotel == room.getHotelName())
                    rooms1 = rooms;
            }
        }
        return rooms1;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
