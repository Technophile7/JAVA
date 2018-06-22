package count;

import java.util.Scanner;

public class vowels {



	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
		String n ; 
		 System.out.println("enter your name");
		  n=key.next();
        int w=0;
	   	int s=n.length();
	   	for(int i=0;i<s;i++)
	   	{
	   		if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
	   	w++;		
	   	}
	   		System.out.println(w);
	   	}
	}
