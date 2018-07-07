package Homework.lesson11;


public class BookingComAPI implements API {
    private Room[] rooms;



    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] array = new Room[1];
        for (Room room : rooms) {

            //if(room.getPrice() == price)
            if (room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
                if(persons == room.getPersons()) {
                    if(city.equals(room.getCityName()) ) {
                        if(hotel.equals(room.getHotelName()) ) {
//                                array = rooms;
//                                index++;
                            array = addRoom(array, room);
                            }
                        }
                    }
                }
            }
        //return rooms;
        return array;
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

