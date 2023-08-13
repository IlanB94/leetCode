public static boolean isHappy(int n) {
		HashSet<Integer> hash_set = new HashSet<Integer>();
		int res = cheker(n);
		while(!hash_set.contains(res) && res != 1) {
			hash_set.add(res);
			res = cheker(res);
		}
		if(res == 1) {
			return true;
		}
		return false;

	}
	
public static int cheker(int n) {
		int res = 0;
		while(n > 0) {
			res += Math.pow(n%10, 2);
			n/=10;
		}
		return res;
	}
