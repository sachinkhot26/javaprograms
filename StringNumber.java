
public class StringNumber {

	public static void main(String[] args) {

		String str="occurrences";
		//String str1=" ";
		int count =1;
		for(int i=0;i<str.length()-1;i++) {
			
			for(int j=i+1;j<str.length()-1;j++) {
				
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!= ' ') {
					
					count++;
				 str=str.replace(str.charAt(j),' ');
					
				}
				
				
			}
			if(str.charAt(i)!= ' ') {
				
				System.out.println(str.charAt(i) +" "+ count);
			}
			
		}
		
		
		
	}

}
