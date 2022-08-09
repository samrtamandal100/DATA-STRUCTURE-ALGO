import java.util.*;

 class node 
	{
		 node child[];
		 boolean ischeck;
		 public node()
		 {
		    child =new node[26];
		    ischeck =false;
		}
		
	}

public class Trie_data_structure_implement
{
	static node root;
	Trie_data_structure_implement()
	{
         root= new node();
	}
   

	public  void insert(String data)
	{
		node curr =root;
		for(int i=0;i<data.length();i++)
		{
			char ch =data.charAt(i);
			if(curr.child[ch-'a']==null)
			{
				node newnode = new node();
				curr.child[ch-'a']=newnode;
			}
			curr =curr.child[ch-'a'];
		}
		curr.ischeck =true;
	}

	public  boolean search(String key)
	{
		node curr =root;
		for(int i=0;i<key.length();i++)
		{
			char ch =key.charAt(i);
			if(curr.child[ch-'a']==null)
				return false;

			curr =curr.child[ch-'a'];
		}

		return curr.ischeck;
	}
	public static void main(String args[])
	{
		Trie_data_structure_implement t = new Trie_data_structure_implement();
		t.insert("hellow");
		t.insert("hell");
		t.insert("world");
		System.out.print(t.search("world"));

	}
}