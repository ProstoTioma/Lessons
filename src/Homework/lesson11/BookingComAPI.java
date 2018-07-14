package Homework.lesson11;


public class BookingComAPI implements API {
    private Room[] rooms;

    public Room[] getRooms() {
        return rooms;
    }

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;

        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getPrice() >= price - 100 && room.getPrice() <= price + 100 && room.getCityName() == city && room.getHotelName() == hotel) {
                count++;
            }
        }
        Room[] res = new Room[count];
        int index = 0;
        for(Room room : rooms) {
            if(room.getPersons() == persons && room.getPrice() >= price - 100 && room.getPrice() <= price + 100 && room.getCityName() == city && room.getHotelName() == hotel) {
                res[index] = room;
                index++;
            }
        }
        //return rooms;
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

