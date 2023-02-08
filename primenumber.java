package week1day2ass;

public class primenumber {
	public void prime(){
	int a=13,i;
	boolean p=false;
	for(i=2;i<=a/2;++i) {
		if(a%i==0) {
		p=true;
		break;
		}
	}
	if (!p)
		System.out.println("The given number "+a+"is a prime number");
	else
		System.out.println("The number "+a+"is not a prime number");
	}
	public void primenot(){
		int a=22,i;
		boolean p=false;
		for(i=2;i<=a/2;++i) {
			if(a%i==0) {
			p=true;
			break;
			}
		}
		if (!p)
			System.out.println("The given number "+a+"is a prime number");
		else
			System.out.println("The number "+a+"is not a prime number");
		}

	public static void main(String[] args) {
	primenumber pi=new primenumber();
	pi.prime();
	pi.primenot();
	
	
}
}
