import java.util.Scanner;
import java.util.Random;

public class ques13 {

	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
		 Random r = new Random();
		 int x = 1 + r.nextInt(7);
		 int y = 1 + r.nextInt(7);
         System.out.println("click any no. to roll dice first time");
		 int a=key.nextInt();
	 	 System.out.println("click any no. to roll dice second time");
		 int b=key.nextInt();
	   System.out.println("your dice roll was ");
	   System.out.println(x);
	   System.out.println(y);
	   System.out.println("sum is ");
	   System.out.println(x+y);



	   
	 }
	}

