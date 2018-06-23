 public static void main(String[] args) {
			int n,f;
		    Scanner key = new Scanner(System.in);
		    System.out.println("enter number of elements for both arrays");
		    n = key.nextInt();
		    f = key.nextInt();

		    String a[] = new String[n+1];
		    String b[] = new String[n+1];
		    System.out.println("Enter the elements array1");
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = key.next();
		    }
		    System.out.println("Enter the elements array2");

		    for(int k = 0; k < f; k++)
		    {
		        b[k] = key.next();
		    }
	        System.out.println("arrays are");
	        for(int i = 0; i < n; i++)
		    {
		        System.out.println(a[i]);
  
		    }
	        for(int k= 0; k <f; k++)
		    {
		        System.out.println(b[k]);
  
		    }
		    System.out.print("common elements are");
		    for(int i = 0; i <n; i++)
			{for(int k = 0; k <f; k++)
		    {if(a[i]==b[k])
		        System.out.println(b[k]);
		    }
		}}
