import java.util.*;
import java.io.*;

public class contains_with_most_water
{
	public static void most_water(int water[])
	{
		int start =0,end=water.length-1;
		int max=0;

		while(start<end)
		{
			int first =water[start];
			int last= water[end];

			int min_val = Math.min(first, last);

			max =Math.max(max ,min_val*(end-start));

			if(first>last)
				end--;
			else
				start++;
		}

		System.out.print(max);
	}

	public static void main(String args[])
	{
		int water[] ={1,8,6,2,5,4,8,3,7};
		most_water(water);
	}
} 