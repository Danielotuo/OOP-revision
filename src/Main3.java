public class Main3 {
    public static void main(String[] args) {
        Account DansAccount = new Account("7777 8888 7777", 0.00, "Dan Dan", "dan@dan.com", "(004) 456-7890");

        System.out.println(DansAccount.getNumber());
        System.out.println(DansAccount.getCustomerName());
        System.out.println(DansAccount.getBalance());

        DansAccount.deposit(50000000);
        DansAccount.withdraw(200.00);

    }
}
