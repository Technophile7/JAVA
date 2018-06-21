import java.util.Scanner;
import java.util.Random;

public class ques22 {

	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
		 Random r = new Random();
		 int x = 1 + r.nextInt(11);
		 int y = 1 + r.nextInt(11);
		 int z = 1 + r.nextInt(11);
		 int w = 1 + r.nextInt(11);
         System.out.println("click any no. for players turn");
		 int a=key.nextInt();
	 	 System.out.println("click any no. for dealers turn");
		 int b=key.nextInt();
	   System.out.println("players no.s are  ");
	   System.out.println(x);
	   System.out.println(y);
	   System.out.println("players sum is ");
	   System.out.println(x+y);
	   int s=x+y;
	   System.out.println("dealers no.s are  ");
	   System.out.println(w);
	   System.out.println(z);
	   System.out.println("dealers sum is ");
	   System.out.println(w+z);
	   int g=w+z;
	   if(s>g)
		   System.out.println("player wins");
	   if(s<g)
		   System.out.println("dealer wins"); 
	   if(s==g)
			   System.out.println("match tied wins");



	   
	 }
	}

