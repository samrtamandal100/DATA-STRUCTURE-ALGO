import java.util.*;
import java.io.*;
import java.lang.*;

public class jadu
{
	public static void main(String args[])
	{
            for(int i=0;i<4;++i)
            {
            	for(int j=0;j<58;++j)
            	{
            		if(i<10)
            		{
            			System.out.print(i<1?"%.": i>0&&i<9?"_":"$%\n");
            		}
            		else if(i>10 && i<20)
            		{
            			System.out.print(i<12?" %.": i>11&&i<19?"_":"$%'\n");
            		}
            		else if(i>20 && i<26)
            		{
            			System.out.print(i<22?" '.":i>21&&i<25?"_":"$%'\n");
            		}
            		else if(i>26 && i<29)
            		{
            			System.out.print(i<28?" -$%'\n":" .%'_\n");
            		} 
            		else if(i>29 && i<37)  
            		{
            			System.out.print(i<31?" .%$": i>30&&i<36?"_":"'\n");
            		}
            		else if(i>37 && i<47)
            		{
            			System.out.print(i<39?".%$": i>38&&i<46?"_":"$%\n");
            		}
            		else if(i>47 && i<60)
            		{
            			System.out.print(i<49?"%$": i>48&&i<57?"_":"$%\n");
            		}
            	}

            }
	}
}