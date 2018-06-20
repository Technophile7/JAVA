package q8;

import java.util.Scanner;

public class ques8 {
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
			 if(bmi<18.5)
				 System.out.println("u r underweight");
			 if(bmi>18.5&&bmi<24.9)
				 System.out.println("u hv normal weight");
			 if(bmi>25.0&&bmi<30)
				 System.out.println("u r overweight"); 
			 if(bmi>30)
					 System.out.println("u r obese");
			 System.out.println("your bmi is ");
			 System.out.println(bmi);
			 
			
		 }
	}
