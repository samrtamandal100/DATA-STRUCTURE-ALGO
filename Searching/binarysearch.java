import java.util.*;
import java.io.*; 

class search
{
    public static void fun(int a[])
    {
         int start=0,mid,end=a.length;
         Scanner sc = new Scanner(System.in);
         System.out.print("enter find your taget");
         int target =sc.nextInt();
         while(start<=end)
         {
                mid=(start+end)/2;

                if(a[mid]==target)
                {
                    System.out.print("this number is present"+a[mid]);
                    break;

                }
                else if(target>a[mid])
                {
                    start =mid+1;
                }
                else if(target<a[mid])
                {
                    end = mid-1;
                }
                else
                {
                    System.out.print("this number is not present");
                }

                
         }
         
    }
}








public class binarysearch {
     
     public static void main(String args[])
    {
         int a[]={20,25,30,40,45,50};
         search.fun(a);  
    }
}
