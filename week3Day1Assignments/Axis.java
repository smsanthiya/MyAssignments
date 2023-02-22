package week3Day1Assignments;

public class Axis extends BankInformation {
	public void deposit(int x)
	{
		System.out.println("The deposit is  :"+x);
	}
	public static void main(String[] args) {
		Axis bank1=new Axis();
		bank1.deposit(50000);
		bank1.saving(25000);
		bank1.fixed(65000);
	}
	}


