package Homework.lesson11;

public class TripAdvisorAPI implements API{
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (Room room : rooms) {
            if (persons >= persons - 1 && persons <= persons + 1) {
                System.out.println(price + " " + persons + " " + city + " " + hotel);
            }
        }
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
