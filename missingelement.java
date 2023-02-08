package week1day2ass;

import java.util.Arrays;

public class missingelement {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,7,8,6};
		Arrays.sort(arr1);
		int length=arr1.length;
		System.out.println("The length of the arr1 is :"+length);
		System.out.print("The missing element in the array is : ");
		for(int i=0;i<length;i++)
		{	
		if(arr1[i]!=i+1) {
			System.out.println(i+1);
			break;
		}
				
					
				}
		}
	}
	
	
			
		
	

	



		



