import java.util.Scanner;

public class MainCode {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Hello! Want to play the game?");
		System.out.println("How are you?");
		String userInput = keyboardInput.nextLine();
		userInput = userInput.toLowerCase();
		if (userInput == "good") {
			System.out.println("I'm glad you feel that way!");
		}
		else{
			System.out.println("That's a cool way to feel I guess...");
		}
		
		System.out.println("Well, thanks for telling me how you feel!");
	}
}
