package week3.day1.assignments;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Override Deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axisBank = new AxisBank();
		axisBank.saving();
		axisBank.fixed();
		axisBank.deposit();

	}

}
