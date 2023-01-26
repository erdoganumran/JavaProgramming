package day31_Constructors;

import day31_Constructors.BankAccount;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();//default constructor
        account1.setInfo("Ahmet Ozkok",123456789);

        System.out.println(account1);


        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();// it returns a texts because it is void

        account1.deposit(900);

        account1.checkBalance();

        System.out.println("--------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(10000);

        account2.checkBalance();
        account2.withdraw(2000);
        account2.checkBalance();
    }
}
