package com.project.Arrays;

public class ArrayReverse {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] beforeRev= {1,2,3,4,5};
	    int[] afterRev=reverseArr(beforeRev);
	    int length = beforeRev.length;
	    for (int i=0;i<length;i++)
	    {
	    	System.out.println(afterRev[i]);
	    }
	}
	
	public static int[] reverseArr(int[] beforeRev) {
		
		int[] afterRev=new int[beforeRev.length];		
		int length=beforeRev.length;
		for (int i=0;i< length;i++)
		{
			afterRev[length-i-1]=beforeRev[i];			
		}
			return afterRev;		
	}
}

