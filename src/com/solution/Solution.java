package com.solution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curmin=Integer.MAX_VALUE;
        boolean isFound =  false;
        String brand="";
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int value = in.nextInt();
            String temp=""+value;
            int length=temp.length();
            int num4=0;
            int num7=0;
            boolean isValid=true;
            for (int i= 0 ;i <length;i++)
            {
            	if(temp.charAt(i)== '4')
            		num4++;
            	else if(temp.charAt(i)== '7')
            		num7++;
            	else
            		isValid=false;
            }
            if(num4>0 && num7>0 && num4 == num7 && isValid)
            {
            	isFound=true;
            	if(value<curmin)
            	{
            		curmin = value;
            		brand=name;
            		
            	}
            }
        }
        in.close();
        if(isFound)
        	System.out.println(brand);
        else
        	System.out.println("-1");
    }
}
