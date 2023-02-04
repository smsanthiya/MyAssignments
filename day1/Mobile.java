package week1.day1;

public class Mobile {
	public void sendMsg() {
		System.out.println("From OPPO");
		String mobileModel="oppo";
		float mobileWeight=0.750f;
		System.out.println("My mobile name is:" +mobileModel);
		System.out.println("The weight is:" +mobileWeight);
	}
	public void makecall() {
		boolean isCharged=true;
		int mobileCost=15000;
		System.out.println("if 100% charged:" +isCharged);
		System.out.println("The cost is :" +mobileCost);
	}
public static void main(String[] args){ 
	Mobile calling=new Mobile();
	System.out.println("This is my Mobile");
	calling.sendMsg();
	calling.makecall();
	}

}
