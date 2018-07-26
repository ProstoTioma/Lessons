package Homework.lesson11;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //BookingComAPI test
        System.out.println("BookingComApi test");
        System.out.println();


        //findRooms

        //нахождение комнат (по параметрам и цена +- 50) +
        //если нужной комнаты нет +
        //нахождение null +

        Room[] rooms = new Room[5];
        rooms[0] = new Room(1, 170, 5, new Date(), "Hotel", "Kiev");
        rooms[1] = new Room(2, 120, 5, new Date(), "Hotel", "Kiev");
        rooms[2] = new Room(3, 110, 5, new Date(), "Hotel", "Kiev");
        rooms[3] = new Room(4, 450, 20, new Date(), "Hotel", "Kiev");
        rooms[4] = new Room(5, 1000, 1, new Date(), "Elite Hotel", "Kiev");

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);

        Room[] findRoomsForBooking = bookingComAPI.findRooms(150, 5, "Kiev", "Hotel");
        for (Room room : findRoomsForBooking) {
            System.out.println(room.toString());
        }

        Room[] findRoomsForBooking1 = bookingComAPI.findRooms(380, 10, "Kiev", "Hotel");
        for (Room room : findRoomsForBooking1) {
            System.out.println(room.toString());
        }

        Room[] findRoomsForBooking2 = bookingComAPI.findRooms(0, 0, null, null);
        for (Room room : findRoomsForBooking2) {
            System.out.println(room.toString());
        }


        System.out.println();
        //GoogleAPI test
        System.out.println("GoogleAPI test");
        System.out.println();


        //findRooms

        //нахождение комнат (по параметрам) +
        //если нужной комнаты нет +
        //нахождение null +

        Room[] rooms1 = new Room[5];
        rooms1[0] = new Room(1, 100, 5, new Date(), "Hotel", "Kiev");
        rooms1[1] = new Room(2, 120, 5, new Date(), "Hotel", "Kiev");
        rooms1[2] = new Room(3, 100, 5, new Date(), "Hotel", "Kiev");
        rooms1[3] = new Room(4, 941, 4, new Date(), "Hotel", "Kiev");
        rooms1[4] = new Room(5, 490, 2, new Date(), "Elite Hotel", "Kiev");

        GoogleAPI googleAPI = new GoogleAPI(rooms1);

        Room[] findRoomsForGoogle = googleAPI.findRooms(100, 5, "Kiev", "Hotel");
        for (Room room : findRoomsForGoogle) {
            System.out.println(room.toString());
        }

        Room[] findRoomsForGoogle1 = googleAPI.findRooms(241, 3, "Kiev", "Hotel");
        for (Room room : findRoomsForGoogle1) {
            System.out.println(room.toString());
        }

        Room[] findRoomsForGoogle2 = googleAPI.findRooms(0, 0, null, null);
        for (Room room : findRoomsForGoogle2) {
            System.out.println(room.toString());
        }


        System.out.println();
        //TripAdvisorAPI test
        System.out.println("TripAdvisorAPI test");
        System.out.println();


        //findRooms

        //нахождение комнат (по параметрам и люди +- 1) +
        //если нужной комнаты нет +
        //нахождение null +

        Room[] rooms2 = new Room[5];
        rooms2[0] = new Room(1, 100, 5, new Date(), "Hotel", "Kiev");
        rooms2[1] = new Room(2, 180, 6, new Date(), "Hotel", "Kiev");
        rooms2[2] = new Room(3, 100, 6, new Date(), "Hotel", "Kiev");
        rooms2[3] = new Room(4, 941, 4, new Date(), "Hotel", "Kiev");
        rooms2[4] = new Room(5, 190, 6, new Date(), "Elite Hotel", "Kiev");

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms2);

        Room[] findRoomsForAdvisor = tripAdvisorAPI.findRooms(100, 6, "Kiev", "Hotel");
        for (Room room : findRoomsForAdvisor) {
            System.out.println(room.toString());
        }

        Room[] findRoomsForAdvisor1 = tripAdvisorAPI.findRooms(489, 11, "Kiev", "Hotel");
        for (Room room : findRoomsForAdvisor1) {
            System.out.println(room.toString());
        }

        Room[] findRoomsForAdvisor2 = tripAdvisorAPI.findRooms(0, 0, null, null);
        for (Room room : findRoomsForAdvisor2) {
            System.out.println(room.toString());
        }

        System.out.println();
        //Controller test
        System.out.println("Controller test");
        System.out.println();


        //requestRooms

        //нахождение комнат +
        //если нужной комнаты нету +
        //нахождение null +

        API apis[] = {bookingComAPI, googleAPI, tripAdvisorAPI};

        Controller controller = new Controller(apis);

        Room[] foundRoomsForController = controller.requestRooms(100, 5, "Kiev", "Hotel");
        for (Room room : foundRoomsForController) {
            System.out.println(room.toString());
            System.out.println();
        }

        Room[] foundRoomsForController1 = controller.requestRooms(894, 9, "Kiev", "Hotel");
        for (Room room : foundRoomsForController1) {
            System.out.println(room.toString());
        }

        Room[] foundRoomsForController2 = controller.requestRooms(0, 0, null, null);
        for (Room room : foundRoomsForController2) {
            System.out.println(room.toString());
        }

        System.out.println();
        //check

        //нахождение общих комнат +
        //если общих комнаты нету +
        //TODO Сделать 3 пункт.

        Room[] checkRoomsForController = controller.check(tripAdvisorAPI, googleAPI);
        for (Room room : checkRoomsForController) {
            System.out.println(room.toString());
        }

        Room[] checkRoomsForController1 = controller.check(bookingComAPI, tripAdvisorAPI);
        for (Room room : checkRoomsForController1) {
            System.out.println(room.toString());
        }




    }
}
