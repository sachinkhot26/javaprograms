
public class CountRepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,1,3,4,1,2,4,3,5,5};
		
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int count=1;
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
			
			//System.out.println( "i===="+i+"a[i]======"+a[i]);
			//System.out.println("a[j]===="+a[j]);
			if(a[i]==a[j]) {
				count++;
			}
			else {
			
				System.out.println("number"+a[i] +" " +count+"times repeated");
				count=1;
				i=j-1;
				break;
			}
			
		}
		if(i == a.length - 1) {System.out.println("number"+a[i] +" " +count+"times repeated");}
	}

}
}
