import java.util.Random;
import java.util.Scanner;

public class ques15 {

	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
		 System.out.println("lets play a dice");
		 Random r = new Random();
		 int x = 1 + r.nextInt(10);

		   System.out.println("1 st throw is " + x); 
		     int y;
		     do {
		            System.out.print("game onn: ");
		   		  y = 1 + r.nextInt(10);
		            System.out.println("2nd throw" + y);
		            if (y == x)
		                  System.out.println("Your guess is correct. Congratulations!");
		            else 
		       System.out.println("try again");
		      } while (y != x);
		}
		}

