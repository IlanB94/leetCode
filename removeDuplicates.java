public static int removeDuplicates(int[] nums) {
		int result = 1;
		for(int i =0; i < nums.length-1;i++) {
			if(nums[i] != nums[i+1]) {
				nums[result] = nums[i+1];
				result++;
			}
		}
		return result;		
	}
