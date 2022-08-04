import java.io.*;
import java.util.*;

class implement
{
	static class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			this.next =null;
		}
	}
	static node fornt;
    static node rear;

	public static void add(int data)
	{
       node newnode = new node(data);

       if(fornt==null)
       {
       	 fornt = rear =newnode;
       	 return;
       }


       rear.next=newnode;
       rear= newnode;
	}
	public static int remove()
	{
		if(fornt ==null)
		{
			System.out.print("queue is empty");
		}
        int result = fornt.data;
		fornt= fornt.next;
		return result;

	}

	public static void print()
	{
		if(fornt ==null)
		{
			System.out.print("queue is empty");
		}

		node curr =fornt;
		while(curr!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.print("null");
	}
}

public class queue_using_linkedlist
{
	public static void main(String args[])
	{
		implement qu = new implement();
		qu.add(10);
		qu.add(20);
		qu.add(30);
		qu.add(40);
		qu.add(6);
		qu.print();
		System.out.println("");

		qu.remove();
		qu.print();


	}
}


