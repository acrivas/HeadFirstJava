package simpleSinkAStartUp;

import java.util.Scanner;

public class SimpleSinkAStartUp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Simple Sink-A-Startup game");
		System.out.println("Help investors by sinking non-profitable companies!");
		Scanner sc = new Scanner(System.in);
		//VER ESTO (Nº DE ELEMENTOS DE LA STARTUP)
		int n = 3;	//Number of elements of the startup
		int max = 7; //Size of the board where the startup sits
		int firstElement = (int) (Math.random()*((max - n + 1) - 1 + 1)) + 1;
		int guess;
		int guessCount = 0;
		String result;
		StartUp myStartup = new StartUp(firstElement, n);
		System.out.println(myStartup.getStartup());
		while(myStartup.isAlive()) {
			System.out.println("Enter your guess");
			guess = sc.nextInt();
			guessCount++;
			result = myStartup.checkStatus(guess);
		}
		System.out.println("Your have used " + guessCount + " attempts.");
	}

}
