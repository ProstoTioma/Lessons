package Homework.lesson11;

public class BookingComAPI implements API {
    private Room[] rooms;
    private Room[] rooms1;


    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        for (Room room : rooms) {
            if (price >= price - 100 && price <= price + 100) {
                System.out.println(price + " " + persons + " " + city + " " + hotel);
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
