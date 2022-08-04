import java.io.*;
import java.util.*;
 
 
class Stack
{     
	 static int max=10;
     Stack(int maxs)
     {
       this.max=maxs;
     }
     static int Stack[] = new int[max];
     static int top=-1;
	public static void push(int data)
	{
        if(top==max)
        	System.out.print("Stack is overFlow");
        else if(top==-1)
        	top+=1;
        
        Stack[top]=data;
        top++;    	
	}

	public static void pop()
	{
         if(top==-1)
            System.out.print("underFlow");
        else
        	System.out.print("Delete "+ Stack[top-1]+"\n");
        	top=top-1;

	}

	public static void display() 
	{
		if(top==-1)
		{
			System.out.print("Stack is emty");
		}
		 else
		 {
		 	 for(int i=0;i<top;i++)
		 	 {
		 	 	System.out.print(Stack[i]+" ");
		 	 }
		 	 System.out.println("");
		 }
	   }

}


class stack_implement
{
	public static void main(String args[])
	{
	   Stack rf = new Stack(10);
	   rf.push(50);
	   rf.push(32);
	   rf.push(43);
	   rf.push(56);
	   rf.push(77);
	   rf.push(99);
	   rf.display();
	   rf.pop();
	   rf.display();
	   rf.pop();
	   rf.display();



	   	}
}
