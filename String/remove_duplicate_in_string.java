import java.io.*;
import java.util.*;


public class remove_duplicate_in_string
{


       static boolean ble[] = new boolean[26];

	public static void remove(String str ,int idx,String cpy)
	{

          
          if(idx==str.length())
          {
          	System.out.print(cpy);
          	return;
          }



		char cur =str.charAt(idx);

		if(ble[cur-'a']==true)
		{
			remove(str,idx+1,cpy);
		}
		else
		{
			cpy+=cur;
                    ble[cur-'a']=true;
                    remove(str,idx+1,cpy);

		}
	}
	public static void main(String args[])
	{
         String str="hellow";
         remove(str,0,"");
	}
}