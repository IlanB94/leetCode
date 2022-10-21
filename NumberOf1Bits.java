public class  NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter =0;
		String str = Integer.toBinaryString(n);
		for(int i =0; i < str.length();i++) {
			if(str.charAt(i) == '1') {
				counter++;
			}
		}
		return counter;
    }
}
