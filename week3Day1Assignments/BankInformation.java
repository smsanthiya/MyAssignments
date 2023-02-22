package week3Day1Assignments;

public class BankInformation {
	public void saving(int a) {
		System.out.println("The savings amount is  :"+a); 
			
		}
	
public void fixed(int b)
{
	System.out.println("The fixed deposit is  :"+b);
}
public void deposit(int c)
{

	System.out.println("The deposited amount is :"+c);
}
public static void main(String[] args) {
	BankInformation bank=new BankInformation();
	bank.deposit(20000);
	
}
}
