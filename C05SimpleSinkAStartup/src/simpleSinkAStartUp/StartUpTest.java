package simpleSinkAStartUp;

import java.util.ArrayList;

public class StartUpTest {

	public static void main(String[] args) {

		//Test startup creation
		String creationResult = "failed";
		StartUp amason = new StartUp(2, 3);
		ArrayList<Integer> startupTest = new ArrayList<Integer>();
		startupTest.add(2);
		startupTest.add(3);
		startupTest.add(4);
		if (amason.getStartup().equals(startupTest)) {
			creationResult = "passed";
		}
		System.out.println("Startup creation test : " + creationResult);
		System.out.println(amason.getStartup());
		System.out.println("**");
		
		//Test hit
		String guessResult = "failed";
		int guess = 2;
		if(amason.checkStatus(guess) == "hit") {
			guessResult = "passed";
		}
		System.out.println("Guess result test: " + guessResult);
		System.out.println(amason.getStartup());
		System.out.println("**");
		
		//Test fail
		String failResult = "failed";
		guess = 5;
		if(amason.checkStatus(guess) == "fail") {
			failResult = "passed";
		}
		System.out.println("Fail result test: " + guessResult);
		System.out.println(amason.getStartup());
		System.out.println("**");
		
		//Test repeat guess on a hit
		String repeatResult = "failed";
		guess = 2;
		if(amason.checkStatus(guess) == "fail") {
			repeatResult = "passed";
		}
		System.out.println("Repeat result test: " + repeatResult);
		System.out.println(amason.getStartup());
		System.out.println("**");
		
		//Test kill
		String killTest = "failed";
		guess = 3;
		amason.checkStatus(guess);
		System.out.println(amason.getStartup());
		guess = 4;
		if (amason.checkStatus(4) == "startup sunk") {
			killTest = "passed";
		}
		System.out.println("Kill result test: " + killTest);
		System.out.println(amason.getStartup());
		System.out.println("**");
	}

}
