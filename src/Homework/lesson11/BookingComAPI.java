package Homework.lesson11;

public class BookingComAPI implements API {
    private Room[] rooms;


    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] rooms1;
        for (Room room : rooms) {
            if (price >= price - 100 && price <= price + 100) {
                if(persons == room.getPersons()) {
                    if(city == room.getCityName()) {
                        if(hotel == room.getHotelName()) {
                            if(price == room.getPrice())
                            rooms1 = rooms;
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

    public static void main(String[] args) {
        int[] array = new int[100];
        method(array);
    }

    public static int[] method(int[] array) {
        int index = 0;
//        for(int el : array) {
//            if(array[index] == 0) {
//
//                index++;
//            }

            for(int value = 0; value <= 100; value++) {
                System.out.println(value);
                for(int el : array) {
                    if(array[index] == 0) {
                        array[index] = value;
                        index++;
                    }
            }

        }
        return array;
    }

}
