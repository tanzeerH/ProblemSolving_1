package com.solution;

import java.util.HashSet;

// https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
public class LongestSubstringWithNoCharRepeat {

	public static void main(String[] args) {
		
		String input="ABDEFGABEF";
		HashSet<Character> hashSet=new HashSet<>();
		int[] counts=new int[input.length()];
		int max_length=0;
		int max=0;
		for(int i=0; i<input.length();i++)
		{
			if(hashSet.contains(input.charAt(i)))
			{
				max_length=1;
				hashSet.clear();
			}
			else
			{
				max_length++;
				hashSet.add(input.charAt(i));
			}
			counts[i]=max_length;
			if(max_length>max)
				max=max_length;
		}
		System.out.println(max);
		
		for(int i=0; i<input.length();i++)
		{
		  System.out.print(counts[i]+" ");
		}
	}
}
