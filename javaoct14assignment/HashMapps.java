package basic;

import java.util.HashMap;

public class HashMapps {

	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"sanjay");
	map.put(2,"Vikash");
	map.put(3,"Sumit");
	map.put(4,"Manoj");
	map.put(5,"Suraj");
	for(int a:map.keySet()) {
		System.out.println(a+":"+map.get(a));
	}
	

	}

}
