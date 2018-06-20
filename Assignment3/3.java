package q3;
import java.util.Scanner;

public class ques3 {

	 public static void main(String[] args) {
		 Scanner key=new Scanner(System.in);
		 String fname,lname,logname;
		 int grade;
		 int id,gpa;
		 System.out.println("enter your first name");
		 fname=key.next();
		 System.out.println("enter your last name");
		 lname=key.next();
		 System.out.println("enter your login name");
         logname=key.next();
		 System.out.println("enter your grade");
		 grade=key.nextInt();
		 System.out.println("enter gpa 0-4.0");
		 gpa=key.nextInt();
		 System.out.println("your first name ,last name ,login name ,grade n gpa r as follows");
		 System.out.println(fname);
		 System.out.println(lname);
		 System.out.println(logname);
		 System.out.println(grade);
		 System.out.println(gpa);


	 }
}
