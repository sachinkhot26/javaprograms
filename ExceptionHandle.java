
public class ExceptionHandle {

	public static void main(String[] args) {
		
		ExceptionHandle handle = new ExceptionHandle();
		
		handle.abc();
		
	}
		int abc() {
			try{
				int i=12/0;
				//return 1;
				
			}
			catch(Exception e) {
				
				System.out.println("in catch");
				return 1;
			}
			finally {
				System.out.println("in finally");
			}
			return 0;
		}


	

}
