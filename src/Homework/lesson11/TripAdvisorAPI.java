package Homework.lesson11;

public class TripAdvisorAPI implements API{
    private Room[] rooms;


    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] array = new Room[1];
        for (Room room : rooms) {
            if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
                    if(city == room.getCityName())
                        if(hotel == room.getHotelName())
                            if(price == room.getPrice()) {
                        array = addRoom(array, room);
                            }
               // rooms1 = rooms;
            }
        }
        return rooms;
    }

    private Room[] addRoom(Room[] rooms, Room room) {
        for(int a = 0; a < rooms.length; a++) {
                if(rooms[a] == null) {
                    rooms[a] = room;
                    return rooms;
                }

        }
        Room[] array = new Room[rooms.length + 1];
        for(int b = 0; b < rooms.length; b++) {
            array[b] = rooms[b];
        }
        array[rooms.length] = room;

        return array;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}
