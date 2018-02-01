package com.solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class RitcheRich {

	
	    static String richieRich(String s, int n, int k){
	        // Complete this function
	    	char [] ms= new char[n];
	    	int [] flag=new int[n];
	    	for (int  i =0; i<n; i++)
	    		ms[i]= s.charAt(i);
	    	int start=n/2-1;
	    	int end= n/2;
	    	if (n%2== 1)
	    		end++;
	    	while(start>=0 && k>0)
	    	{
	    		if(s.charAt(start)!= s.charAt(end))
	    		{
	    			if(s.charAt(start)>s.charAt(end))
	    				ms[end]=ms[start]=s.charAt(start);
	    			else
	    				ms[end]=ms[start]=s.charAt(end);
	    			flag[start]=flag[end]=1;
	    			k--;
	    		}
	    		else
	    			ms[end]=ms[start]=s.charAt(start);
	    			
	    			
	    			
	    	   start--;
	    	   end++;
	    	}
	    	start =0;
	    	end= n-1;
	    	while(start<=end && k>0)
	    	{
	    		if(ms[end]= && ms[start])
	    	}
	    	return new String(ms);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        String s = in.next();
	        String result = richieRich(s, n, k);
	        System.out.println(result);
	    }
	}
