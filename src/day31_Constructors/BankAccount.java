package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;
    public final double hourlyRate=30;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber=accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance= $" + balance +
                ", balance= $" + hourlyRate +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your avaliable balance is " + balance);
    }
    public void deposit(double deposit){
        if (deposit<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;//exits the method if it is invalid number
        }

        balance+=deposit;

    }
    public void withdraw(double withdraw){
       if (withdraw>balance ){
           System.out.println("Insufficent balance");
           return;
       }
        if (withdraw<=0){
            System.out.println("Withdrawing amount can not be negative or zero.");
            return;
        }
        balance-=withdraw;

    }


}
/*
	BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount


 */