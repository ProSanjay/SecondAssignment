package fullStack;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int i=0;
        if(number==0) {
        	System.out.println("Total digit is: 1");
        }else {
        	while(number>0) {
            	number=number/10;
            	i++;
            }
        	System.out.println("Total digit is:"+i);
        }
        
        
	}

}
