package week1day2ass;

public class palindrome {
	public static void main(String[] args) {
		int a=34343;
		int c=a;
		int b=0;
		while(a!=0) {
		int t=a/10;
		 b=a%10+b*10;
		System.out.println(b);
		a=t;}
		if(c==b)
		{
			System.out.println("The number is palindrome");
				}
		else
		{System.out.println("The number is not a palindrome");
		}
		
	}}
	


