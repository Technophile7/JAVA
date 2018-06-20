package q7;

import java.util.Scanner;

public class ques7 {
		public static void main(String[] args) {
			 Scanner key=new Scanner(System.in);
			 int a,b,c,d,e,f,g,h,i;
			 a=0;
			 b=0;
			 c=0;
			 System.out.println("lets play quiz");
			 System.out.println("Q1 What is the capital of Alaska? 1) Melbourne2) Anchorage3) Juneau");
			 d=key.nextInt();
			 if(d==3)
		     g=1;
			 else {
			 System.out.println("wrong");
			 g=0;
			 }
			 System.out.println(" Can you store the value cat in a variable of type int?1>yes 2>no");
			 e=key.nextInt();
			 if(e==2)
    		     h=1;
    			 else{ 
    			 System.out.println("wrong");
			 h=0;}
			 
             System.out.println(" What is the result of 9+6/3? 1) 5  2) 11  3) 15/3");
             f=key.nextInt();
             if(f==2)
    		     i=1;
    			 else{ 
    			 System.out.println("wrong");
			 i=0;}

             System.out.println("your score is");
             System.out.println(g+h+i);

			 
		 }
	}	
