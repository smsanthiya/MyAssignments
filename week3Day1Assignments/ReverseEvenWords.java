package week3Day1Assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String name="I am a software tester";
		String[] words=name.split(" ");
		for(int i=0;i<=words.length-1;i++)
		{
			if(i%2!=0)
			{
				char[] charArray=words[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					System.out.println(charArray[j]);
				}
			}
			else
				System.out.println(" "+words[i]+" ");
		}
		
	}

	
}
