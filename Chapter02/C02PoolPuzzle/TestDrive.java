public class TestDrive {
	public static void main(String[] args) {
		Echo e1 = new Echo();
		Echo e2 = e1;
		System.out.println("e1.count = " + e1.count);
		System.out.println("e2.count= " + e2.count);
		e1.count = 1;
		System.out.println("e1.count = " + e1.count);
		System.out.println("e2.count= " + e2.count);
		e2.count = 2;
		System.out.println("e1.count = " + e1.count);
		System.out.println("e2.count= " + e2.count);
	}
}