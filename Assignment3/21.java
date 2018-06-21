import java.util.Scanner;

public class ques21 {

	 public static void main(String[] args) {

		 Scanner key=new Scanner(System.in);
 
	 	for(double i=0;i<=100;i++)
	 		{
	 		if(i%3==0)
	 		System.out.println("Fizz");
	 		if(i%5==0)
		 		System.out.println("Buzz");
	 		if(i%3==0&&i%5==0)
		 		System.out.println("FizzBuzz");
	 		else
	 			System.out.println(i);
	 		}

	   
	 }
	}

