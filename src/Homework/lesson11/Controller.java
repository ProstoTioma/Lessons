package Homework.lesson11;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (API api : apis) {
            for (Room tempRoom : api.getAll()) {
                if (tempRoom != null && tempRoom.getPersons() == persons && tempRoom.getPrice() == price && tempRoom.getHotelName().equals(hotel)
                        && tempRoom.getCityName().equals(city)) {
                    count++;
                }
            }
        }

        Room[] res = new Room[count];
        int index = 0;

        for (API api : apis) {
            for (Room tempRoom : api.getAll()) {
                if (tempRoom != null && tempRoom.getPersons() == persons && tempRoom.getPrice() == price && tempRoom.getHotelName().equals(hotel)
                        && tempRoom.getCityName().equals(city)) {
                    res[index] = tempRoom;
                    index++;
                }
            }
        }


        return res;

    }

    public Room[] check(API api1, API api2) {
        int count = 0;
        Room[] rooms1 = api1.getAll();
        Room[] rooms2 = api2.getAll();

        for (Room room : rooms1) {
            boolean res = check(rooms2, room);
            if (res) {
                count++;
            }
        }
        Room[] result = new Room[count];
        int index = 0;
        for (Room room : rooms1) {
            if (check(rooms2, room)) {
                result[index] = room;
                index++;
            }
        }
        return result;
    }

    private boolean check(Room[] rooms, Room room) {
        for (Room tempRoom : rooms) {
            if (tempRoom.getCityName().equals(room.getCityName()) && tempRoom.getHotelName().equals(room.getHotelName())
                    && tempRoom.getPrice() == room.getPrice() && tempRoom.getPersons() == room.getPersons()) {
                return true;
            }
        }
        return false;
    }

//     public static int[] check(int[] array1, int[] array2) {
//        int count = 0;
//        for(int el : array1) {
//            if (array1[el] == array2[el]) {
//                count++;
//            }
//        }
//        int[] res = new int[count];
//        int index = 0;
//        for(int el : array1) {
//            if (array1[el] == array2[el]) {
//                res[index] = el;
//                index++;
//            }
//        }
//
//        return res;
//    }

}
