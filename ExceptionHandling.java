public class ExceptionHandling {
	public static void main (String [] args) {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Fuck You");
		
		System.out.println("Very important code need to run");
		}
		
	} 
}