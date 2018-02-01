package com.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MinSwap {

	
	  static void minimumBribes(int[] q) {
		  int n = q.length;
		  
	        // Create two arrays and use as pairs where first
	        // array is element and second array
	        // is position of first element
	        ArrayList <Pair> arrpos =
	                  new ArrayList <Pair> ();
	        for (int i = 0; i < n; i++)
	             arrpos.add(new Pair(q[i],i));
	 
	        // Sort the array by array element values to
	        // get right position of every element as the
	        // elements of second array.
	       
	        arrpos.sort(new Comparator<Pair>() {
	        	@Override
	        	public int compare(Pair o1, Pair o2) {
	        		if (o1.getValue() > o2.getValue())
	                    return -1;
	 
	                // We can change this to make it then look at the
	                // words alphabetical order
	                else if (o1.getValue() == o2.getValue())
	                    return 0;
	 
	                else
	                    return 1;
	        	}
			});
	 
	        // To keep track of visited elements. Initialize
	        // all elements as not visited or false.
	        Boolean[] vis = new Boolean[n];
	        Arrays.fill(vis, false);
	 
	        // Initialize result
	        int ans = 0;
	 
	        // Traverse array elements
	        for (int i = 0; i < n; i++)
	        {
	            // already swapped and corrected or
	            // already present at correct pos
	            if (vis[i] || arrpos.get(i).getValue() == i)
	                continue;
	 
	            // find out the number of  node in
	            // this cycle and add in ans
	            int cycle_size = 0;
	            int j = i;
	            while (!vis[j])
	            {
	                vis[j] = true;
	 
	                // move to next node
	                j = arrpos.get(j).getValue();
	                cycle_size++;
	            }
	 
	            // Update answer by adding current cycle.
	            ans += (cycle_size - 1);
	        }
	 
	        System.out.println(ans);
	        // Return result
	        //return ans;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int[] q = new int[n];
	            for(int q_i = 0; q_i < n; q_i++){
	                q[q_i] = in.nextInt();
	            }
	            minimumBribes(q);
	        }
	        in.close();
	    }
}
