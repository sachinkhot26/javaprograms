import java.util.HashSet;
import java.util.Set;

public class Permutations {

	public static void main(String[] args) {

		String s = "ABC";
		System.out.println("permutations of ABC are "+ permutationFinder(s));
	}
	
	public static Set<String> permutationFinder(String str){
		
		Set<String>perm= new HashSet<String>();
		
		if(str==null) {
			return null;
		}else if(str.length()== 0) {
			perm.add("");
			return perm;
		}
		
		char initial = str.charAt(0);
		String rem = str.substring(1);
		
		Set<String> words = permutationFinder(rem);
		
		for(String strnew : words) {
			
			for(int i=0;i<=strnew.length();i++) {
				perm.add(charInsert(strnew, initial,i));
			}
		}
		
		return perm;
		
	}
	
	public static String charInsert(String str, char c, int j) {
		
		String begin=str.substring(0,j);
		String end = str.substring(j);
		return begin + c + end ;
	}
}
