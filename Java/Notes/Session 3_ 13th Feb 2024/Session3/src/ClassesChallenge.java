public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(); // a constructor - default constructor
        account1.setAccountNumber(67826);
        account1.setAccountBalance(10000);
        account1.setCustomerName("Eashaan");
        account1.setPhoneNumber(7987201092l);
        account1.setEmail("eas@xyz.com");

        account1.depositingFunds(4000);
        account1.withdrawingFunds(15000);
        BankAccount account2 = new BankAccount(89723, 15000,
                "Viren", 9372974201l, "viren@ins.com");
        account2.depositingFunds(9000);

        BankAccount account3 = new BankAccount(65271, 5000);
    }

}
