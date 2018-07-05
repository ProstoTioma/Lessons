package Homework.lesson11;

public class BookingComAPI implements API {
    private Room[] rooms;


    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        for (Room room : rooms) {
            if (price >= price - 100 && price <= price + 100) {
                if(persons == room.getPersons()) {
                    if(city == room.getCityName()) {
                        if(hotel == room.getHotelName()) {
                            if(price == room.getPrice())
                            System.out.println(price + " " + persons + " " + city + " " + hotel);
                        }
                    }
                }
            }
        }
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

}
