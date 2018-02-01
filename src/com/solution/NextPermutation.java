package com.solution;

import java.util.HashMap;
import java.util.HashSet;

public class NextPermutation {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println(a+"  "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+"  "+b);
		/*int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		printpermutations("",arr,3);*/
		
	}
	private static void printpermutations(String number, int [] arr,int size)
	{
		if(number.length()==size)
		{
			System.out.println(number);
			return;
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]!= -1)
			{
			 String mynum=number+arr[i];
			 arr[i]=-1;
			 printpermutations(mynum, arr, size);
			 arr[i]=i+1;
			}
		}
	}
}
