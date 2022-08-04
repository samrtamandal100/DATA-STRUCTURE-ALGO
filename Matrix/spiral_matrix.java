import java.io.*;
import java.util.*;


public class spiral_matrix
{
	public static void spiral(int nums[][],int row,int col)
	{
		int left=0, right=col-1;
		int top=0, bottom=row-1;

		while(left<=right && top<=bottom)
		{
			for(int i=left;i<=right;i++)
				System.out.print(nums[top][i]+" ");
			top++;
			for(int i=top;i<=bottom;i++)
				System.out.print(nums[i][right]+" ");
			right--;

			if(top<=bottom)
			{
				for(int i=right;i>=left;i--)
					System.out.print(nums[bottom][i]+" ");
                  bottom--;
			}
			if(left<=right)
			{
				for(int i=bottom;i>=top;i--)
					System.out.print(nums[i][left]+" ");
				left++;
			}

		}
	}

	public static void main(String args[])
	{
		int arr[][]={{1,2,3},
	                {4,5,6},
	                {7,8,9}};

	                spiral(arr ,3,3);


	}
}