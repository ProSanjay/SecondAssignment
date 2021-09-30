package sept28Assignment;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       int input[]=new int[5];
	      System.out.println("Enter array element:");
	      for(int i=0;i<5;i++) {
		  input[i]=sc.nextInt();
	      }
	      int minimum=input[0];
	      for(int i=1;i<5;i++) {
	    	  if(input[i]<minimum) {
	    		  minimum=input[i];
	    	  }
	      }
	      System.out.println("lowest element is:"+minimum);
	      sc.close();
	}

}
