package bitwise;
import java.util.*;
public class NonRepeating {

	public static void main(String[] args) {
	int array[] =new int[6];
	System.out.println("Enter array elements:");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<6;i++) {
		array[i]=sc.nextInt();
	}
	int xor=0;
   for(int i=0;i<6;i++) {
	   xor=xor^array[i];
   }
   int mask=xor& -xor;
   int first=0;
   int second=0;
   for(int value:array) {
	   if((mask & value)==0) {
		   first=first^value;
	   }else {
		   second=second^value;
	   }
   }
   System.out.println(first+" "+second);
   sc.close();
	}

}
