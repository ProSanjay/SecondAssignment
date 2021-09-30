package sept29Assignment;

import java.util.Scanner;

public class OneTime2 {

	public static void main(String[] args) {
	     int[] array=new int[5];
	       Scanner sc=new Scanner(System.in);
	       System.out.println(" Second:Enter array elements:");
	       for(int i=0;i<5;i++) {
	    	   array[i]=sc.nextInt();
	       }
	       int repeat=0;
	       int counter=0;
	       boolean flag=false;
	       for(int i=0;i<5;i++) {
	    	   counter=array[i];
	    	   if(counter!=repeat) {
	    		   for(int j=0;j<5;j++) {
	    			   if(counter==array[j] && i!=j) {
	    				   repeat=array[j];
	    				   break;
	    			   }
	    		   }
	    		   
	    	   }
	    	   if(counter!=repeat) {
    			   flag=true;
    			   break;
    		   }
	       }
    if(flag) {
    	System.out.println("value is:"+counter);
    }else {
    	System.out.println("Value is not present");
    }
    sc.close();
   
	}

}
