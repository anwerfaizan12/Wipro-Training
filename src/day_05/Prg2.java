package day_05;

abstract class BankAccount{
	public abstract void deposit();
	public abstract void withdraw();
}

class SavingAccount extends BankAccount {
	public void deposit() {
		System.out.println("Amount deposited to saving account");
	}
	
	public void withdraw() {
		System.out.println("Amount withdrawn from saving account");
		System.out.println();
	}
}

class CurrentAccount extends BankAccount{
	public void deposit() {
		System.out.println("Amount deposited to current account");
	}
	
	public void withdraw() {
		System.out.println("Amount withdrawn from current account");
	}
}

public class Prg2 {
  public static void main(String[] args) {
	  
	  SavingAccount s = new SavingAccount();
	  s.deposit();
	  s.withdraw();
	  
	  CurrentAccount c  =new CurrentAccount();
	  c.deposit();
	  c.withdraw();
  }
}
