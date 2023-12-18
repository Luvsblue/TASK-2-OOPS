public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.deposit(-100);
        account1.displayBalance();
        account1.withdraw(50);
        account1.displayBalance();

        Account account2 = new Account(500);
        account2.displayBalance();
        account2.withdraw(200);
        account2.displayBalance();
    }
}