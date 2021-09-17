package Package1;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter two number:");
   int a=sc.nextInt();
   int b=sc.nextInt();
   if(a>b) {
	   System.out.println("maximum:"+a);
   }else {
	   System.out.println("maximum:"+b);
   }
	}

}
