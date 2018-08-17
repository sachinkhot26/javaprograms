
public class RemovewhiteSpace {

	public static void main(String[] args) {
		
		String str ="S_A_C_H_I_N";
		String str2="";
//		int spaces = str.replaceAll("[^_]","").length();
//		String str1=str.replaceAll("[%_]","");
//		String str2= str.replaceAll("[^_]","");
//		System.out.println(spaces);
//		System.out.println(str1+str2);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='_') {
				count++;
			}
		}
		String str1[]=str.split("_");
		for(int i=0;i<str1.length;i++ ) {
			str2=str2+str1[i];
		}
		System.out.println(str2);
		for(int i=0;i<=count;i++) {
			str2=str2+"_";
		}
		System.out.println(str2);
	}
	
	
	

}
