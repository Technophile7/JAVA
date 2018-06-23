package as5Q2;
public class ques2 {

	 public static void main(String[] args) {
         int i;
		 int A[]={1,2,3,4,5};
		 

		 for(i=0;i<5;i++)
		 {
			 System.out.println(A[i]);

		 }


		 for(i=0;i<5;i++)
		 {
			if(i==3)
			{
				int b=A[i];
				A[i]=A[i+1];
			}
			// System.out.println(A[i]);

		 }
		 for(i=0;i<5;i++)
		 {
			A[4]=0;
			 System.out.println(A[i]);

		 }
	   
	 }
	}
