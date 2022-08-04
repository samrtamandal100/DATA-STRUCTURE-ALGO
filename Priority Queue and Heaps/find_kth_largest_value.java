import java.util.*;
import java.io.*;


public class find_kth_largest_value
{

	// Find kth largest value useing min priorityQueue
	public static int largest(int arr[],int k)
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			queue.add(arr[i]);
		}

		for(int i=k;i<arr.length;i++)
		{
			if(queue.peek()<arr[i])
			{
				queue.poll();
				queue.add(arr[i]);
			}
		}

		return queue.peek();
	}
	
	// Find kth smallest value useing max priorityQueue
	public static int largest(int arr[],int k)
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<k;i++)
		{
			queue.add(arr[i]);
		}

		for(int i=k;i<arr.length;i++)
		{
			if(queue.peek()>arr[i])
			{
				queue.poll();
				queue.add(arr[i]);
			}
		}

		return queue.peek();
	}


	public static void main(String args[])
	{
		int arr[]={20,10,60,30,50,40};
		int data=largest(arr,3);
		System.out.print(data);
	}
}