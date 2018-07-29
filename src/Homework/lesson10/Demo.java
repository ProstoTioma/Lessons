package Homework.lesson10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //ElectronicsOrder test
        System.out.println("ElectronicsOrder test");
        System.out.println();


        //validateOrder
        System.out.println("validateOrder");
        System.out.println();


        //проверить валидацию +
        //цена меньше 100 +


        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Дерево", new Date(), "Киев", "Одесса", 500, new Customer("Яна", "Харьков", "Женский"), 5);

        electronicsOrder.validateOrder();
        System.out.println(electronicsOrder.getDateConfirmed());


        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Бумага", new Date(), "Одесса", "Киев", 30, new Customer("Анастасия", "Львов", "Женский"), 8);

        electronicsOrder1.validateOrder();
        System.out.println(electronicsOrder1.getDateConfirmed());


        //FurnitureOrder test
        System.out.println();
        System.out.println("FurnitureOrder test");
        System.out.println();


        //validateOrder
        System.out.println("validateOrder");
        System.out.println();


        //проверить валдацию +
        //цена меньше 500 +


        FurnitureOrder furnitureOrder = new FurnitureOrder("Сумки", new Date(), "Киев", "Харьков", 780, new Customer("Свят", "Львов", "Мужской"), "138139dda2");

        furnitureOrder.validateOrder();
        System.out.println(furnitureOrder.getDateConfirmed());


        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Цветы", new Date(), "Киев", "Харьков", 300, new Customer("Свят", "Львов", "Мужской"), "138139dda2");

        furnitureOrder1.validateOrder();
        System.out.println(furnitureOrder1.getDateConfirmed());
    }
}
