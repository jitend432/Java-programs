public class PowUsingRecurtion {
	public static int stepCount = 0;
	public static void main (String [] args) {
		
		System.out.print(pow(3,5));
		System.out.println("Steps" + stepCount);
	}
	
	public static int pow(int a,  int b) {
		stepCount++;
	if (b==0) {
		return 1;
	}
	  return a* pow(a,b-1);
	
	}
}