package sept28Assignment;
import java.util.*;
public class CheckAscending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter array elements:");
      int[] arr=new int[5];
      for(int i=0;i<5;i++) {
    	  arr[i]=sc.nextInt();
      }
      boolean flag=check(arr);
      System.out.println(flag);
	}
 public static boolean check(int[] a) {
	 boolean flag=true;
	 for(int i=0;i<4;i++) {
		 if(a[i]<a[i+1]) {
			 
		 }else {
			 flag=false;
			 break;
		 }
	 }
	 return flag;
 }
}
