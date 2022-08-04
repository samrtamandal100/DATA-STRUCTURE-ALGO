import java.util.*;
import java.io.*;



public class recursion {
     
   public static void recursion(int i,int n,int sum)
   {
   
    if(i==n)
    {
       
        System.out.println(sum);
        return;
    }
         sum+=i;
         recursion(i+1,n,sum);

   }
    public static void main(String args[])
    {
           recursion(1,6,0);
    }
}
