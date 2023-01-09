package Basic;

public class Bank {
	static int Currentbal=100;
	public void greetcustomer() {
		System.out.println("hello,welcome");
		
	}
	public int Deposit(int amount) {
		Currentbal=Currentbal+amount;
		System.out.println("Amount deposited Successfully");
		return Currentbal;
		
	}
	public int withdrawl(int amount) {
		Currentbal=Currentbal-amount;
		System.out.println("Amount withdrawl succesfully");
		return Currentbal;
	}
	public void getbalance() {
		System.out.println(Currentbal);
	}
	public static void main(String[] args) {
		Bank B=new Bank();
		B.Deposit(7890);
		System.out.println("total bal after deposited:"+Bank.Currentbal);
		B.withdrawl(897);
		System.out.println("total bal after withdrawl:"+Bank.Currentbal);
		B.getbalance();
		
	}

}
