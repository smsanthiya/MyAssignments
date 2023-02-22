package week3Day1Assignments;

public class Student {
	public void getStudInfo(int a)
	{
		System.out.println("The student id is:"+a);
	}
	public void getStudInfo(int b,String c)
	{
		System.out.println("The student id is   :"+b);
		System.out.println("The student name is :"+c);
	}
	public void getStudInfo(String d,int e)
	{

		System.out.println("The student email is   :"+d);
		System.out.println("The student mobile no  is :"+e);
	}

	public static void main(String[] args) {
		Student info=new Student();
		info.getStudInfo(302);
		info.getStudInfo(303,"akash");
        info.getStudInfo("akash@gmail", 3425678);
		
	}
}
