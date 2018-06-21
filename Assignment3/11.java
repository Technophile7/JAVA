That's right!  My secret number was 2!
import java.util.Scanner;
import java.util.Random;

public class eleven {
	 
	 public static void main(String[] args) {

	 Scanner key=new Scanner(System.in);
	 System.out.println("lets play a number guessing game");
	 System.out.println("i m thinking of a no. from 1 to 10 , u have to guess it ");
	 Random r = new Random();
	 int x = 1 + r.nextInt(10);
     int a=key.nextInt();
     if (a==x){
    	 System.out.println("ya right");
     }
     else
    	 System.out.println("srry,i guessed "+x);
    	 
	 
	
 }
}
