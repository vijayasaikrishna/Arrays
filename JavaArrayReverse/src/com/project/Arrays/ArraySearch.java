package com.project.Arrays;

public class ArraySearch {

	private static int[] intArr={2,6,7,5,3,8,0,9,5,7,1,4};
	
	public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			System.out.println("We take an array with missing integer from 1 to 10 , randomly chosen");
			double random=Math.random();
			//int  missing= (int)(100*random)%100;
			//System.out.println("the missign number is " + missing);
			//int[] intArr={2,6,5,7,8,0,9,1,4};
			//only one number is missing
			int find;
			int[] standardArr= {0,1,2,3,4,5,6,7,8,9};
			int smallest =findSmallestInArr();
			int largest= findLargestInArr();
			
			for (int i=0;i<10;i++)
			{
				if(foundInArr(i))
				{
					if(i==9)						
						System.out.println("no missing number found in the array");
				continue;

				//System.out.println();
				
				}
				
				else {
				
					System.out.println("We found the missing number : " + i);
					
				}
				
			}
			
			System.out.println("The smallest and the largest integers are respectively : "+ smallest+ " and "+largest);

			System.out.println("finding duplicates from the array...");
			findDuplicates();
	}
	
	public static boolean foundInArr(int i)
	{
		for (int j=0;j<intArr.length;j++)
		{
			if (i==intArr[j])
				return true;
							
		}	
		
		return false;	
	}
	
	public static int findLargestInArr() {
		
		int i,j;
		i = intArr[0];
		for (j=0;j<intArr.length;j++)
		{	
			//i=intArr[0];
			
		if (i<intArr[j])
			i=intArr[j];
		
			
		}
		
		
		return i;
		
	}
	public static int findSmallestInArr() {
		
		int i,j;
		i = intArr[0];
		for (j=0;j<intArr.length;j++)
		{	
			//i=intArr[0];
			
		if (i>intArr[j])
			i=intArr[j];
		
			
		}
		
		
		return i;
		
	}
	
	public static void printRepeatedInArr(int index)
	
	{
		//it is taken for granted that the number repeating is appearing only twice
		int count =0;
		int j=intArr[index];
		int k=index;
		for (;k<intArr.length-1 ;k++)
			
			
			{
				
				if (k==index)
				
					k++;
			
				
				if(intArr[k]==intArr[index])
				{

					
					System.out.println("found repeat at index "+ index + " and at "+ k+" the number repeated is "+ intArr[index]);
					//System.out.println();
					//System.out.println();
					k++;	
				
				//System.out.println("integer "+ intArr);
				
				}		
			
			}
			
	}
	
	public static void findDuplicates()

	{
			
		for (int i=0;i<intArr.length;i++)

			
		{
			printRepeatedInArr(i);
			
		}		
	
	//	return 1;
	}
	
	

}
