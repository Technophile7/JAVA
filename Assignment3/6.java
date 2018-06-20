package q6;

import java.util.Scanner;

public class ques6 {

		public static void main(String[] args) {
			 Scanner key=new Scanner(System.in);
			 float wt;
			 float h,s;
			 float bmi;
			 System.out.println("enter your weight");
			 wt=key.nextFloat();
			 System.out.println("enter your height in metre");
			 h=key.nextFloat();
			 s=h*h;
			 bmi=wt/s;
			 System.out.println("your bmi is ");
			 System.out.println(bmi);
			 



			 
		 }
	}
