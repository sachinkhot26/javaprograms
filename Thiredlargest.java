
public class Thiredlargest {

	public static void main(String[] args) {

		
		int a[]= {3,10,5,20,15,7,2,6};
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length-1;j++) {
				
				if(a[i]<a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("3rd Largest number is   "+a[2]);
	}

}
