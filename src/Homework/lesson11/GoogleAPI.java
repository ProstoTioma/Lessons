package Homework.lesson11;

public class GoogleAPI implements API{
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (Room room : rooms) {
                System.out.println(price + " " + persons + " " + city + " " + hotel);
        }
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
