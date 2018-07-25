package Lessons.lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {
        //проверить, можно ли снять -
        //проверить лимит
        //проверить достаточно ли денег
        //снять деньги

        if (!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        if (!checkFund(user, amount))
            return;
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //снимаем деньги с fromUser
        //пополняем toUser

        if (!checkWithdraw(fromUser, amount)) {
            return;
        }

        if (!checkFund(toUser, amount)) {
            return;
        }

        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        if (!checkFund(user, user.getSalary())) {
            return;
        }
        user.setBalance(user.getBalance() + user.getSalary());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(user, amount);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(User user, int amount) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }


    private boolean checkFund(User user, int amount) {
        return checkFundLimits(user, amount, user.getBank().getLimitOfFunding());
    }

    private boolean checkFundLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printFundErrorMsg(user, amount);
            return false;
        }
        return true;
    }

    private void printFundErrorMsg(User user, int amount) {
        System.err.println("Can't funding money " + amount + " from user " + user.toString());
    }
}
