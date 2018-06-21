package q10;

import java.util.Scanner;

public class ques10 {
	 public static void main(String[] args) {
	Scanner key = new Scanner (System.in);
    int d,e,f,g,h;
    String i, c="Carswell", j="Jones", s="Smith",y="Young";
    System.out.println("input your last name ");
    i = key.next();   
    e=i.compareTo(c);
    f=i.compareTo(j);
    g=i.compareTo(s);
    h=i.compareTo(y);
    if ( e < 0)
    {System.out.println( "You dont' have to wait long, " +i);
    } 
    if(e > 0 && f < g)
    {System.out.print( "that's not bad, "  + i );
    }
    if(f > g&&g < h)
    {System.out.print( "looks like a bit of a wait, "  +i );
    }
    if (g > h)
    {System.out.print("it's gonna be a while, "  + i);
    }

   // else 
  //  {System.out.print("not going anywhere for a while, "  + i);
    }
}
