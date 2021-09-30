package sept29Assignment;
import java.util.Scanner;
public class OneTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] array=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter array elements:");
       for(int i=0;i<5;i++) {
    	   array[i]=sc.nextInt();
       }
       
       int repeat=0;
       boolean flag=false;
       for(int i=0;i<5;i++) {
    	   repeat=array[i];
    	   for(int j=0;j<5;j++) {
    		   if(repeat==array[j] && i!=j) {
    			   repeat=0;
    			   break;
    		   }
    		   
    	   }
    	   if(repeat!=0) {
    		  flag=true;
    		 break;
		   }
       }
       if(flag) {
    	   System.out.println("element:"+repeat);
       }else {
    	   System.out.println("element not present");
       }
     sc.close();
     
	}

}
