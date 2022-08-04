import java.io.*;
import java.util.*;

public class best_time_sell_and_buy_stock  
{
    public static void main(String args[])
    {
        int arr[]={5,6,8,7,2,8,3,9,2};

       int minvalue =Integer.MAX_VALUE;
       int maxprofit =0;


       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<minvalue)
           {
               minvalue=arr[i];
           }
           else if(minvalue-arr[i]>maxprofit)
           {
              maxprofit = minvalue-arr[i];
           }
       }
       System.out.println(maxprofit+" is profit value");
}
}