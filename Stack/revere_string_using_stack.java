import java.util.*;
import java.io.*;

class stack
{
    int size;
    int top;
    char[] st;

    stack(int size)
    {
        top=-1;
        this.size=size;
        st = new char[size];
    }

    public  void push(char data)
    {
        if(top>=size)
        {
            System.out.println("stack is overflow");
        }
        else if(top==-1)
        {
            top+=1;
        }
        
            st[top++]=data;
        
        
     }
     public char pop()
     {
         if(top==-1)
         {
             System.out.print("stack is underflow");
         }

         char x =st[top--];
         return x;
     }
}




public class revere_string_using_stack
{
     public static void revers(StringBuffer str)
     {
         int n =str.length();
         stack stk = new stack(n);

         int i;
         for(i=0;i<n;i++)
         {
             stk.push(str.charAt(i));
         }
  
         for(i=0;i<n;i++)
         {
             char obj =stk.pop();
             str.setCharAt(i,obj);
         }

     } 




    public static void main(String args[])
    {
        StringBuffer ob = new StringBuffer("hellow world");

        revers(ob);

        System.out.print("revers String is "+ob);

    }  
}