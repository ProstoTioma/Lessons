package Homework.lesson11;

public class TripAdvisorAPI implements API{
    private Room[] rooms;
    private Room[] rooms1;


    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (Room room : rooms) {
            if (persons >= persons - 1 && persons <= persons + 1) {
                if(persons == room.getPersons())
                    if(city == room.getCityName())
                        if(hotel == room.getHotelName())
                            if(price == room.getPrice())
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
