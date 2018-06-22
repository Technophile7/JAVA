package small3;
import java.util.Scanner;

public class small {

	 public static void main(String[] args) {

	 Scanner key=new Scanner(System.in);
	 System.out.println("enter 3 no.s");
	 
	    int a=key.nextInt();
	    int b=key.nextInt();
	    int c=key.nextInt();
    if (a<b){
    	if(a<c)
   	 System.out.println("a is smallest");
    	else if (b<c)
   	 System.out.println("b is smallest");
    }   	 
    else if (b<c)
		 System.out.println("b is smallst");
	 else
		 System.out.println("c is smallest");
	
}
}
