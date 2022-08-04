import java.util.*;
import java.io.*;


 public class conect_n_ropes_minimum_cost
 {
 	public static int minimum_cost(int arr[])
 	{
 		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
              int ans=0;
 		for(int i=0;i<arr.length;i++)
 		{
 			queue.add(arr[i]);
 		}

 		while(queue.size()>1)
 		{
 			int first =queue.poll();
 			int second =queue.poll();
 			int sum =first+second;
 			ans+=sum;
 			queue.add(sum);
 	   }

 	   return ans;
 	}
 	public static void main(String args[])
 	{
 		int arr[]={2,5,4,8,6,9};
 		int data =minimum_cost(arr);
 		System.out.print(data);
 	}
 } 