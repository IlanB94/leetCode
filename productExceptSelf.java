public static int[] productExceptSelf(int[] nums) {
		int [] answers = new int[nums.length];
		int sum = 1;
		boolean flag = false;
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		//check if there is 0 in array and save the index
		for(int i =0; i < nums.length;i++) {
			if(nums[i] == 0) {
				flag = true;
				hashmap.put(i, nums[i]);
			}
		}
		
		if(hashmap.size() >= 2) {
			for(int i =0; i < nums.length;i++) {
				answers[i] = 0;
			}
			return answers;
		}
		
		//calculate the sum without the 0
		for(int i =0; i < nums.length && flag == true;i++) {
			
			if(!hashmap.containsKey(i)) {
				sum *= nums[i];
			}
		}
		
		for(int i =0; i < nums.length && flag == true;i++) {
			if(hashmap.containsKey(i)) {
				answers[i] = sum;
			}else {
				answers[i] = 0;
			}
		}
		
		//if there is no 0 calculate the sum
		for(int i =0; i < nums.length && flag == false; i++) {			
			sum *= nums[i];
		}
		
		for(int i =0; i < nums.length && flag == false; i++) {
			answers[i] = sum / nums[i];
		}
		
		return answers;
		
		
	}
