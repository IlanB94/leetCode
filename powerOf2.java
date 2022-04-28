
public class powerOf2 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(32));
		System.out.println(isPowerOfTwoIterative(32));

	}

	public static boolean isPowerOfTwoIterative(int n) {
		if (n < 1) {
			return false;
		}
		while (n % 2 == 0) {
			n /= 2;
		}

		return n == 1;

	}

	public static boolean isPowerOfTwo(int n) {
		return Math.log10(n) / Math.log10(2) % 1 == 0;

	}

}
