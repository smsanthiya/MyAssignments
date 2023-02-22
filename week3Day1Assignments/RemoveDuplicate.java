package week3Day1Assignments;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String text="We learn java basics as a part of java";
		int count=0;
		String[] split=text.split(" ");
		for(int i=0;i<split.length;i++)
		{
			for(int j=i+1;j<split.length;j++)
			{if(split[i].equalsIgnoreCase(split[j]));
			{split[i]=" ";
			count++;
			}
			}
		}
		
		if(count>0)
		{for(int k=0;k<split.length;k++)
		{
			System.out.print(split[k]+"");
		}
		}
	}

}
