package asQ3;
import java.util.Scanner;


public class ques3 {
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
    System.out.print("Enter the position where you want to insert element");
    pos = key.nextInt();
    System.out.print("Enter the element you want to insert:");
    x = key.nextInt();
    for(int i = (n-1); i >= (pos-1); i--)
    {
        a[i+1] = a[i];
    }
    a[pos-1] = x;
    System.out.print("After inserting:");
    for(int i = 0; i < n; i++)
    {
        System.out.print(a[i]+",");
    }
    System.out.print(a[n]);
}
}
