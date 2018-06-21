package q12;
import java.util.Scanner;
import java.util.Random;

public class ques12 {
	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
		 System.out.println("lets play a fortune game");
		 System.out.println("enter any no. n i will tell ur fortune ");
		 Random r = new Random();
		 int x = 1 + r.nextInt(7);
	     int a=key.nextInt();
	     if (x==0)
	    	 System.out.println("u will b richer soon");
	     if (x==1)
	    	 System.out.println("u will buy a new car soon");
	     if (x==2)
	    	 System.out.println("u  will travel the whole world soon ");
	     if (x==3)
	    	 System.out.println("u will buy a new house soon");
	     if (x==4)
	    	 System.out.println("u will buy a new phone soon");
	     if (x==5)
	    	 System.out.println("u will get a new job soon ");
	     if (x==6)
	    	 System.out.println("u will get married soon");
		 
		
	 }
	}
