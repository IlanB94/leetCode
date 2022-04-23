
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1213));

	}
	
	public static boolean isPalindrome(int x) {
		int reminder,temp =x,checker = 0;
		while(temp > 0) {
			reminder = temp % 10;
			checker = (checker * 10) + reminder;
			temp /=10;
		}
		if(checker == x) {
			return true;
		}else {
			return false;
		}
	}

}
