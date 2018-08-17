
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int k=2*5-2;
		for (int i=1;i<=5;i++ ) {
			for(int j=1;j<=k;j++) {
				System.out.print(" ");
			}
			k=k-2;
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				
				if(j>=i) {
					System.out.print(" *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(n+" ");
				n=n+1;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
