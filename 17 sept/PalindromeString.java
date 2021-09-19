package basic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		//type 1
		Scanner sc=new Scanner(System.in);
		String name=new String();
		name=sc.nextLine();
		//type 1
		StringBuilder name1=new StringBuilder();
		name1.append(name);
		name1.reverse();
		if(name.equals(name1.toString())) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
	//	type 2
	char[] nameArray=name.toCharArray();
	int i=0;
	int j=nameArray.length-1;
	while(i<j) {
	char temp=nameArray[i];
	nameArray[i]=nameArray[j];
	nameArray[j]=temp;
	i++;
	j--;
	}
	String palindrome=String.valueOf(nameArray);
	if(name.equals(palindrome)) {
		System.out.println("String is palindrome");
	}else {
		System.out.println("String is not a palindrome");
	}
	}

}
