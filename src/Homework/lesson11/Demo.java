package Homework.lesson11;

public class Demo {
    public static void main(String[] args) {
        Room[] rooms = new Room[4];
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        System.out.println(bookingComAPI.findRooms(1000, 3, "Kiev", "Hotel"));


    }
}
