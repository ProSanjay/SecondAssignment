package sept23javaAssignment;
import java.util.Scanner;

public class ReverseLine {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.nextLine();
	String[] array=s.split(" ");
    int i=0;
    int j=array.length-1;
    while(i<j) {
    	String temp=array[i];
    	array[i]=array[j];
    	array[j]=temp;
    	i++;
    	j--;
    	 }
        StringBuilder string=new StringBuilder();
        for(int k=0;k<array.length;k++) {
        	string.append(array[k]+ " ");
        }
        System.out.println(string);
        sc.close();
	}

}
