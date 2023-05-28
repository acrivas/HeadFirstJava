public class Mix4 {
	int counter = 0;

	public static void main (String[] args) {
		int count = 0;
		Mix4[] mixes = new Mix4[20];
		int i = 0;
		System.out.print("i");
		System.out.print("...");
		System.out.print("mixes[1].counter");
		System.out.print("...");
		System.out.print("count1");
		System.out.print("...");
		System.out.println("count2");
		while (i < 9) {
			System.out.print(i);
			System.out.print("...");
			mixes[i] = new Mix4();
			mixes[i].counter = mixes[i].counter + 1;
			System.out.print(mixes[1].counter);
			System.out.print("...................");
			count = count + 1;
			System.out.print(count);
			System.out.print(".......");
			count = count + mixes[i].maybeNew(i);
			System.out.print(count);
			i = i + 1;
		}
		System.out.println(count + " " + mixes[1].counter);
	}

	public int maybeNew (int index) {
		if (index < 5) {
			Mix4 mix = new Mix4();
			mix.counter = mix.counter + 1;
			return 1;
		}
		return 0;
	}
}