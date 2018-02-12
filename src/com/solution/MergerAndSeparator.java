package com.solution;

public class MergerAndSeparator {

	static Node root=null;
	static Node odd;
	static Node even;
	class Node
	{
		
		Node(int n)
		{
			number=n;
		}
		int number;
		Node next=null;
		
	}
	public static void main(String[] args) {
		MergerAndSeparator m=new MergerAndSeparator();
		
		m.insert(1);
		m.insert(2);
		m.insert(3);
		m.insert(4);
		m.insert(5);
		System.out.println("Printing All.....");
		m.printAll(root);
		m.seperator(root);
		System.out.println("Printing odd.....");
		m.printAll(even);
		System.out.println("Printing even.....");
		m.printAll(odd);
		//
	}
	private  void insert(int number)
	{
		
		if(root == null)
		{
		    root=new Node(number);
		    return;
		}
		Node node=root;
		while(node.next!= null)
		{
			node=node.next;
		}
		node.next=new Node(number);
		
	}
	private void printAll(Node root)
	{
		Node node=root;
		while(node!= null)
		{
			System.out.println(node.number);
			node=node.next;
		}
	}
	private  void seperator(Node root)
	{
		Node node=root;
		int count=0;
		Node node_odd=null;
		Node node_even=null;
		while(node!=null)
		{
			if(count%2==0)
			{
				if(count==0)
				{
				 even=new Node(node.number);
				 node_even=even;
				}
				else
				{
					node_even.next=new Node(node.number);
					node_even=node_even.next;
				}
				//System.out.println(node.number);
		        
			}
			else
			{
				if(count==1)
				{
				 odd=new Node(node.number);
				 node_odd=odd;
				}
				else
				{
					node_odd.next=new Node(node.number);
					node_odd=node_odd.next;
				}
			}
			count++;
			node=node.next;
				
		}
	}
	private static void merger(Node root)
	{
		
	}
}
