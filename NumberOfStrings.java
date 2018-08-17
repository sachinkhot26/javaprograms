import java.util.HashMap;

public class NumberOfStrings {

	public static void main(String[] args) {

		String sb = "occurrences";
		int count=1;
		int j=0;
		StringBuilder str= new StringBuilder(sb);
		int len=str.length();
		for(int i=0;i<len-1;i++) {
			
			for( j=i+1;j<len-1;j++) {
				
				if(str.charAt(i)==' ') {
					continue;
				}
				
				if(str.charAt(i)== str.charAt(j) && str.charAt(i)!=' ') {
					
					count++;
					str.setCharAt(j,' ');
					
					
				}
			}
			
			if(str.charAt(i)!=' ') {
				System.out.print( str.charAt(i)  +  ""+  count);
			}
			count=1;
		}
		
		
	}

}

//o1c3u1r2e2n1s1
