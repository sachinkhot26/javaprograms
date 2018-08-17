import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayExample {

	public static void main(String[] args) {

		int a= 123456;

		int count=0;
		int sum=0;
		int reverse=0;
		while(a!=0) {
			
			reverse=reverse * 10;
			sum= sum+(a % 10);
			reverse= reverse + (a % 10);
			a=a/10;
			count++;
		}
		System.out.println("no of digits==="+count);
		System.out.println("sum of  number=="+sum);
		System.out.println("reverse number=="+reverse);
		
		
		
	/* ****  Hash map example*/
		
		HashMap<String,Integer>map= new HashMap<String,Integer>();
		map.put("One",1);
		map.put("Two", 2);
		map.put("three",3);
		
		for(Map.Entry<String,Integer>entry:map.entrySet()) {
			String key=entry.getKey();
			System.out.println("Key=="+key);
			if(key.equals("Two")) {
				break;
			}
			
		}
		
		/* ****  Count the noumber of occurences*/
		int charcount=1;
		String newStr=" ";
		String str="better butter";
		StringBuilder sb= new StringBuilder(str);
		int len=sb.length();
		
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len-1;j++) {
				if(sb.charAt(i) == ' ') {
					continue;
				}
				if(sb.charAt(i)==sb.charAt(j) && sb.charAt(i)!=' ') {
					charcount++; 
					sb.setCharAt(j, ' ');
					
				}
			}
			if(sb.charAt(i)!= ' ') {
				System.out.println(sb.charAt(i)+" repreats=="+charcount);
				newStr=newStr+sb.charAt(i);
			}
			charcount=1;
			
		}
		System.out.println("New String=="+newStr);
	}

}
