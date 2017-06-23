package com.qa.bank;

public class CreditAccount implements BankAccount {
private BankAccount bankAccount;
	public CreditAccount(BankAccount accountHandler) {
		// TODO Auto-generated constructor stub
		this.bankAccount  = accountHandler;
	}
//@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		//return bankAccount.getBalance();
		return 0.00;
	}
public double debt() {
	// TODO Auto-generated method stub
	return 0;
}
public double credit() {
	// TODO Auto-generated method stub
	return 0;
}

}
