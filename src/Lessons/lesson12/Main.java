package Lessons.lesson12;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank euBank = new EUBank(145, "Ukraine", Currency.USD, 76, 230, 5, 4872213);
        Bank chinaBank = new ChinaBank(1, "China", Currency.EUR, 4574, 150, 2, 487221);

        User user = new User(1001, "Denis", 12200, 40, "GMD", 1500, usBank);
        User user1 = new User(1323, "Artem", 777333, 120, "ING", 13000, usBank);

        User user2 = new User(138, "Oleg", 2400, 3, "UKM", 290, euBank);
        User user3 = new User(1338, "John", 140000, 1, "ORS", 4000, euBank);


        User user4 = new User(476, "Ki", 3800, 94, "AWL", 390, chinaBank);
        User user5 = new User(9674, "Ron", 678000, 4, "BOP", 9300, chinaBank);


        BankSystem bankSystem = new UkrainianBankSystem();

        bankSystem.fund(user, 600);
        bankSystem.withdraw(user, 150);
        bankSystem.paySalary(user);
        bankSystem.transferMoney(user, user1, 1300);

        bankSystem.fund(user1, 894);
        bankSystem.withdraw(user1, 413);
        bankSystem.paySalary(user1);
        bankSystem.transferMoney(user1, user2, 1400);

        bankSystem.fund(user2, 590);
        bankSystem.withdraw(user2, 30);
        bankSystem.paySalary(user2);
        bankSystem.transferMoney(user2, user3, 1500);

        bankSystem.fund(user3, 49903);
        bankSystem.withdraw(user3, 30000);
        bankSystem.paySalary(user3);
        bankSystem.transferMoney(user3, user4, 1600);

        bankSystem.fund(user4, 2341);
        bankSystem.withdraw(user4, 2400);
        bankSystem.paySalary(user4);
        bankSystem.transferMoney(user4, user5, 1700);

        bankSystem.fund(user5, 9999);
        bankSystem.withdraw(user5, 6666);
        bankSystem.paySalary(user5);
        bankSystem.transferMoney(user5, user1, 2000);


        System.out.println(user.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
    }
}
