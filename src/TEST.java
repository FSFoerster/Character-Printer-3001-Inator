import java.util.Scanner;

public class TEST {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text;
		System.out.println("Welcome to the Character Printer 3001 Inator!\r\n");
		System.out.print("Please enter the number of characters your word has: ");
		String[] string = new String [scanner.nextInt()];
		scanner.nextLine();
		
        for(int i=0;i<string.length;i++) {
			System.out.print("Please enter " + (i+1) + ". character: ");
			string[i] = scanner.nextLine();
		}
		for(int i=0;i<string.length;i++) {
			string[i] = string[i] + "\u0308\u0302\u0303\u0305\u0309\u030a\u0338\u035d\u0360\u0327\u0310\u031a\u032a\u032b\u0356\u0353";
		}
		text = string[0];
		for(int i=1;i<string.length;i++) {
			text = text + string[i];
		}
		System.out.println(text);
		System.out.println("\r\nThank your for using the Character Printer 3001 Inator!");
	}
}