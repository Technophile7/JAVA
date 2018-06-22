package password;

import java.util.Scanner;

public class pass {


	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
		String n ; 
		 System.out.println("enter your password");
		  n=key.next();
       int w=0;
	   	int s=n.length();
	   	if(s==8)
	   	{
	   	for(int i=0;i<s;i++)
	   	{
	   		if(n.charAt(i)=='1'||n.charAt(i)=='2'||n.charAt(i)=='3'||n.charAt(i)=='4'||n.charAt(i)=='5'||n.charAt(i)=='6'||n.charAt(i)=='7'||n.charAt(i)=='8'||n.charAt(i)=='9'||n.charAt(i)=='0')
	   	w++;}
	   	}
		else
	   		System.out.println("invalid password");
	   	
	   	if(w>2)
	   {if(n.matches(".*[a-z].*")|| n.matches(".*[0-9].*")|| n.matches(".*[A-Z].*" ))
			   {
		   System.out.println("correct");
			   }
	   	}
	   else
		   System.out.println("invalid");
	   	}
	    
	 }
