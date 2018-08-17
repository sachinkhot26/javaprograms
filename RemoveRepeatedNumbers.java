import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveRepeatedNumbers {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,2,3,4,5,4,4,4,3};
		
		Set<Integer>st=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			
			st.add(a[i]);
		}
		
		Iterator<Integer>itr=st.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}
