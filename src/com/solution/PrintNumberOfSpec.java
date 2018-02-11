package com.solution;

public class PrintNumberOfSpec {

	static int MY_NUM=2;
	
	//finds number of 2's in a specified range
	public static void main(String[] args) {
		
		int limit=25;
		
		int init=1;
		int []arr=new int[10];
		arr[1]=1;
		for(int i=2;i<10;i++)
		{
			init=(int)Math.pow(10, i-1)-1;
			
			int count=(int)Math.pow(10,i-1)+9*arr[i-1]+1;
			arr[i]=count;
			//System.out.println(init+"  "+count);
		}
		int n=99;
		int left=0;
	    int count=0;
	    int total=0;
		while(n>0)
		{
			count++;
			int rem=n%10;
			
			total+=rem*arr[count-1];
			//System.out.println(arr[count-1]);
			if(rem == MY_NUM)
			{
				total+=left+1;
			}
			else if(rem>MY_NUM)
			{
				total+=Math.pow(10,count-1);
			}
			//System.out.println(total);
			left=left*(int)Math.pow(10,count-1)+rem;
			n/=10;
		}
		System.out.println(total);
	}
}
