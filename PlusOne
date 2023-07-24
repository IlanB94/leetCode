 public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}else {
				digits[i] = 0;
			}
		}
		//if there is only 9's in array
		int [] newArray = new int [digits.length + 1];
		newArray[0] = 1;
		
		return newArray;
    }
