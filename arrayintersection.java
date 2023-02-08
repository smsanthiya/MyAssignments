package week1day2ass;

public class arrayintersection {
	public static void main(String[] args) {
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		int length=arr1.length;
		int length1=arr2.length;
		System.out.println("The length of the arr1 is "+length);
		System.out.println("The length of the arr2 is "+length1);
		System.out.println("The duplicated numbers in the array are:");
		for(int i=0;i<length;i++) {
			for(int j=0;j<length1;j++)
			{
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					
				}
				}
			}
		}
		
}


