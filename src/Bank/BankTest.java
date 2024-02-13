package Bank;

public class BankTest {
    public static void main(String[] args) {
        // Creating new User
        Account userAccount = new Account("Vedat Ermuşat");

        // User welcome message
        userAccount.displayWelcome();

        // User detail
        userAccount.displayUserDetail();

        // Deposit money in account
        userAccount.depositMoney(500);

        // Withdraw money in account
        userAccount.withdrawMoney(350);
    }
}
