package Lessons.lesson12;

public class Main {
    public static void main(String[] args) {
        //UkrainianBankSystem test
        System.out.println("UkrainianBankSystem test");
        System.out.println();


        //withdraw
        System.out.println("withdraw");
        System.out.println();

        //снять деньги +
        //снять больше лимита +
        //если нету денег на счету +


        BankSystem bankSystem = new UkrainianBankSystem();


        Bank usBank = new USBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank euBank = new EUBank(145, "Ukraine", Currency.USD, 76, 230, 5, 4872213);
        Bank chinaBank = new ChinaBank(1, "China", Currency.EUR, 4574, 150, 2, 487221);


        User user = new User(1001, "Denis", 200, 40, "GMD", 1500, usBank);


        bankSystem.withdraw(user, 150);

        System.out.println(user.toString());

        bankSystem.withdraw(user, 3574);

        bankSystem.withdraw(user, 460);

        //fund
        System.out.println();
        System.out.println("fund");
        System.out.println();


        //пополнить счет +
        //пополнить больше лимита +


        User user1 = new User(1323, "Artem", 777333, 120, "ING", 13000, euBank);

        bankSystem.fund(user1, 80);

        System.out.println(user1.toString());

        bankSystem.fund(user1, 50000);

        //transferMoney
        System.out.println();
        System.out.println("transferMoney");
        System.out.println();


        //переводем деньги +
        //превышин лимит ввода +
        //когда нету денег на счету у userFrom +


        User user2 = new User(138, "Oleg", 90, 3, "UKM", 20000, chinaBank);

        bankSystem.transferMoney(user2, user, 30);
        System.out.println(user2.toString());
        System.out.println(user.toString());

        System.out.println();

        bankSystem.transferMoney(user2, user, 80);


        //paySalary
        System.out.println();
        System.out.println("paySalary");
        System.out.println();


        //дать зарплату +
        //если зарплата больше лимита +


        User user3 = new User(8923, "James", 19000, 14, "WOG", 3000, euBank);

        bankSystem.paySalary(user3);
        System.out.println(user3);

        bankSystem.paySalary(user2);
    }
}
