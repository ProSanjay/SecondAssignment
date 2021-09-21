package java21septAssignment;
import java.util.ArrayList;
import java.util.Scanner;
public class MisssingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 12 number from 1 to 15 in incresing order:");
		ArrayList<Integer> list=new ArrayList<Integer>();
		int miss[]=new int[12];
		for(int i=0;i<miss.length;i++) {
			miss[i]=sc.nextInt();
		}
		int index=1;
		for(int i=0;i<miss.length;i++) {
			while(index!=miss[i]) {
				list.add(index);
				index++;
			}
			index++;
		}
		System.out.println(list);
       sc.close();
	}

}
