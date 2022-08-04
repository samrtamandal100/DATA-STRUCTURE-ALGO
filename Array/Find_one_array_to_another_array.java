import java.util.*;
import java.io.*;


public class Find_one_array_to_another_array
{
	public static boolean check(int arr1[],int arr2[])
	{
		int lth =arr1.length;
		int point1=0,point2=0;
		int count=0,i=0;
		while(lth>i)
		{
            if(arr1[point1]==arr2[point2])
            {
            	point2++;
            	point1++;
            	count++;
            }else
            {
            	count=0;
            	if(arr1[point1]!=arr2[point2])
            	{
            		point1++;
            	}
            }
            i++;
            if(count==arr2.length)
		    {
		 	    return true;
		     }
		}

		 
		 return false;
	}


	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,6};
		int arr2[]={3,1,5};
		System.out.print(check(arr1,arr2));
	}
}