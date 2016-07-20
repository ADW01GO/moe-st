package ScuTeat.demo.ScuTeat.demo;

public class SimpleAdd {
	public static void main(String[] args) {
		SimpleAdd add = new SimpleAdd();
		System.out.println(add.add(11,12));
	}

	public int add(int a, int b) {
		return a + b;
		// return 0;
}
	/*
	 * addition by using "for"
	 */
	public int add2(int a, int b) {
		int x = b;
		for (int i = 0; i < a; i++) {
			x = x + 1;
			// i--; //if your run this, will cause infinite loop
		}
		return x;
	}

	/*
	 * partial addition: only the integer part
	 */
	public int add3(double a, double b) {
		return (int) a + (int) b;
	}

}
