package week3Day1Assignments;

public class OddToUppercase {
	public static void main(String[] args) {
		
		String name="nathiya";
		char[] charArray=name.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(Character.toUpperCase(charArray[i]));
			}
			else 
				System.out.println(charArray[i]);
		}
	}

}
