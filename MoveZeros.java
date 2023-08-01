public static void moveZeros(int [] nums) {
		int i =0;
		int j =1;
		
		while(j <= nums.length-1) {
			if(nums[i] != 0) {
				if(nums[j]!= 0) {
					i++;
					j++;
				}else {
					i++;
				}
				
			}else {
				if(nums[j]!= 0) {
					nums[i] = nums[j];
					nums[j] = 0;
					i++;
					j++;
				}else {
					j++;
				}
					
			}
		}
	}
