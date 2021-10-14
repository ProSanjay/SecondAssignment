package basic;
import java.util.HashMap;

public class Countt {

	public static void main(String[] args) {
	  String value="aaaabbbbcfda@7d3@ccdddzzzz";
	  HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	  for(int i=0;i<value.length();i++) {
		  char c=value.charAt(i);
		  if(c>='a'&&c<='z') {
			  if(map.containsKey(c)) {
				  int val=map.get(c);
				  val++;
				  map.put(c,val);
			  }else {
				  map.put(c,1);
			  }
		  }
	  }
      for(Character chara:map.keySet()) {
    	  System.out.println(chara+":"+map.get(chara));
      }

	}

}
