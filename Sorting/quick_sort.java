import java.util.*;
import java.io.*;

public class quick_sort
{
     public static void main(String args[])
     {
     	int arr[] ={3,5,1,7,9,10,8,3};
     	int legth=arr.length-1;
     	quick(arr,0,legth);

     	print(arr);
 
     }
     public static int partition(int arr[], int low,int high)
     {
     	int pivot =arr[(low+high)/2];

     	while(low<=high)
     	{
     		while(arr[low]<pivot)
     		{
     			low++;
     		}
     		while(arr[high]>pivot)
     		{
     			high--;
     		}
     		if(low<=high)
     		{
     			int temp =arr[low];
     			arr[low]=arr[high];
     			arr[high]=temp;
     			low++;
     			high--;
     		}

     	}
     	return low;
     }


     public static void quick(int arr[], int low,int high)
     {
     	int pivot =partition(arr,low,high);

     	if(low <pivot-1)
     	{
     		quick(arr,low,pivot-1);
     	}
     	if(pivot<high)
     	{
     		quick(arr,pivot,high);
     	}
     }

     public static void print(int arr[])
     {
     	for(int i:arr)
     	{
     		System.out.print(i+" ");
     	}
     }
}