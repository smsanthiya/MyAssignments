package week1day2ass;

public class fibbonacci {
	public static void main(String[] args) {
		int range=8,firstnumb=0,secnumb=1,sum;
		System.out.println("FIBBONACCI SERIES");
		System.out.println(firstnumb );
		System.out.println(secnumb);
		for(int i=1;i<=range;i++)
		{
		sum=firstnumb+secnumb;
		firstnumb=secnumb;
		secnumb=sum;
		System.out.println(sum);
		}
		
	}

}
