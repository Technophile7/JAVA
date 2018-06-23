package as5Q4;

import java.util.Scanner;

public class ques4 {

	 public static void main(String[] args) {
			int n, pos, x;
		    Scanner key = new Scanner(System.in);
		    System.out.println("enter number of elements");
		    n = key.nextInt();
		    int a[] = new int[n+1];
		    System.out.println("Enter the elements");
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = key.nextInt();
		    }
		    System.out.print("reverse array is ");
		    for(int i = (n-1); i >=0; i--)
		    {
		        System.out.print(a[i]);
		    }
		}
		}
