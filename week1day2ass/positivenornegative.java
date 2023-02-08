package week1day2ass;

public class positivenornegative {
	public void negative() {
		int number=0;
		if(number<0) {
			System.out.println("The given number "+number+" is Negative number");
		
			}
			else if(number>0)
			{
				System.out.println("The given number "+number+" is Positive number");
				
				}
			else
				{
				System.out.println("The number is neither positive nor negative");
				}
				}
			
		public static void main(String[] args) {
			positivenornegative pn=new positivenornegative();
			pn.negative();
			
		}

	}

