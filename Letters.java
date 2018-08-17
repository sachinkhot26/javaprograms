
public class Letters {

	public static void main(String[] args) {
		
		String str="123abcd*!@EF+1213hi";
		String finalString=" ";
	//	Without using Replace all
		
		char str1[]=str.toCharArray();
		for(int i=0;i<str1.length;i++) {
			//System.out.println(str1[i]);
			if(Character.isLetter(str1[i])) {
				finalString=finalString+str1[i];
		
			}
		}
		System.out.println("Final String==="+finalString);
		
		
		// using replace all
		String str2=str.replaceAll("[^A-Za-z]+", "");
		System.out.println(" String str2 ==="+str2);
		
		
		
		int a[]= {98,-1,25,75,3};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		
		try {
			try {
				throw new Exception();
			}
			finally {
				System.out.println("finally 1");
			}
		}catch(Exception e) {
			System.out.println("catch 1");
		}
		finally {
			System.out.println("finally 2");
		}
		
	}

}
