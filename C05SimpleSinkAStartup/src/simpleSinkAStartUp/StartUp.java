package simpleSinkAStartUp;

import java.util.ArrayList;

public class StartUp {
	
	private int n;
	private int hitCount;
	private boolean alive;
	private ArrayList<Integer> startup;
	private int humbleBeginning;
	
	public StartUp (int firstElement, int n) {
			this.startup = new ArrayList<Integer>(n);
			for(int i = 0; i < n; i++) {
				this.startup.add(firstElement + i);
			}
			this.n = n;
			this.alive = true;
	}
	
	public String checkStatus (int guess) {
		String result;
		if (this.startup.contains(guess)) {
			this.hitCount++;
			this.startup.remove(this.startup.indexOf(guess));
			this.alive = (this.startup.size() > 0);
			if (this.alive) {
				System.out.println("It's a hit, well done!");
				System.out.println("You have " + this.hitCount + " ouf of " + this.n + " hits");
				result = "hit";
			} else {
				System.out.println("Hit! You've sunk another non-profitable startup, congratulations!");
				result = "startup sunk";
			}
		} else {
			System.out.println("Fail! Try again.");
			System.out.println("You have " + hitCount + " ouf of " + n + " hits");
			result = "fail";
		}
		return result;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public ArrayList<Integer> getStartup() {
		return startup;
	}

	public void setStartup(ArrayList<Integer> startup) {
		this.startup = startup;
	}

	public int getHumbleBeginning() {
		return humbleBeginning;
	}

	public void setHumbleBeginning(int humbleBeginning) {
		this.humbleBeginning = humbleBeginning;
	}

	@Override
	public String toString() {
		return "StartUp [n=" + n + ", hitCount=" + hitCount + ", alive=" + alive + ", startup=" + startup
				+ ", humbleBeginning=" + humbleBeginning + "]";
	}
	
	
	

}
