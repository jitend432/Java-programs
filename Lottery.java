import java.util.Scanner;
public class Lottery {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your four digit lottery number here : ");
		int userlottery = input.nextInt();
		int lottery = ((int)(Math.random() * 100) + 1000);
		
		//for(int i = 0; i<=lottery.length; i++){
		//	if(lottery[] == userlottery[]){
		//		System.out.print("won");
		//	}
		//}
		
		if(userlottery == lottery){
			System.out.println(" congratulation you won $10000 ");
			System.out.println(lottery);
		}else{
			System.out.println("SORRY YOU LOOSE");
			System.out.println("Better luck next time");
			System.out.println(lottery);
		}
		
		
		
		
	}
}