public static int addDigits(int num) {
		while(num > 0) {
			if(num <= 9) {
				return num;
			}else {
				num = helper(num);
			}
		}
		return num;
		
		
	}
	
	public static int helper(int num) {
		int res  =0;
		while(num > 0) {
			res += num%10;
			num/=10;
		}
		return res;
	}
