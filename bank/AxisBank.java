package org.bank;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("AxisBankDeposit");
	}
	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		BankInfo bi	= new BankInfo();
		
		ax.saving();
		ax.fixed();
		ax.deposit();
		bi.saving();
		bi.fixed();
		bi.deposit();
	}	
}

