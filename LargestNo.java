package fullStack;
import java.util.*;
public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  a=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 number:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int largest=a[0];
		for(int i=1;i<a.length;i++) {
			if(largest<a[i]) {
				largest=a[i];
			}
		}
    System.out.println("largest number is:"+largest);
	}

}
