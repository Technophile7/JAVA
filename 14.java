import java.util.Random;
import java.util.Scanner;

public class ques14 {

	 public static void main(String[] args) {

	 Scanner key=new Scanner(System.in);
	 System.out.println("lets play a number guessing game");
	 System.out.println("i m thinking of a no. from 1 to 10 , u have to guess it ");
	 Random r = new Random();
	 int x = 1 + r.nextInt(10);
 	int a=key.nextInt();
 	  
 	
      Scanner key = new Scanner(System.in);
      int guess;
      do {
            System.out.print("Enter a guess: ");
            guess = key.nextInt();
            System.out.println("Your guess is " + guess);
            if (guess == x)
                  System.out.println("Your guess is correct. Congratulations!");
            else 
       System.out.println("try again");
      } while (guess != x);
}
}
