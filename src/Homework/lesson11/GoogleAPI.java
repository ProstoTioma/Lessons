package Homework.lesson11;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null && price == room.getPrice()) {
                if (persons == room.getPersons())
                    if (city == room.getCityName())
                        if (hotel == room.getHotelName())
                            count++;
            }
        }
            Room[] res = new Room[count];
            int index = 0;
            for(Room room : rooms) {
                if (room != null && price == room.getPrice()) {
                    if (persons == room.getPersons())
                        if (city == room.getCityName())
                            if (hotel == room.getHotelName()) {
                                res[index] = room;
                                index++;
                            }
                }
            }


        return res;
    }
//    private Room[] addRoom(Room[] rooms, Room room) {
//        for(int a = 0; a < rooms.length; a++) {
//            if(rooms[a] == null) {
//                rooms[a] = room;
//                return rooms;
//            }
//
//        }
//        Room[] array = new Room[rooms.length + 1];
//        for(int b = 0; b < rooms.length; b++) {
//            array[b] = rooms[b];
//        }
//        array[rooms.length] = room;
//
//        return array;
//    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
