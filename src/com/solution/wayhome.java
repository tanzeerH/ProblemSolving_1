package com.solution;

import java.util.Scanner;

public class wayhome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int d=in.nextInt();
        String s=in.next();
        int count=0;
        for (int i =0 ; i<len;)
        {
        	System.out.println(i);
        	int end=i+d;
        	if(end>len)
        		break;
        	String sub=s.substring(i,end);
        	int index=sub.lastIndexOf('1');
        	if(index == -1)
        	{
        		System.out.println("unreachable");
        		break;
        	}
        	else
        	{
        	i+=index;
        	count++;
        	}
        }
        System.out.println(count);
	}
}
