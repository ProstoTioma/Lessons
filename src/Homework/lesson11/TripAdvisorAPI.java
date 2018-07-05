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
                if(persons == room.getPersons())
                    if(city == room.getCityName())
                        if(hotel == room.getHotelName())
                            if(price == room.getPrice())
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
