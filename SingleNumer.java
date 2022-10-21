	public static int singleNumber(int[] nums) {
        HashSet<Integer> hash_set = new HashSet<Integer>();
        int number=0;
        for(int i =0; i < nums.length;i++) {
        	if(!hash_set.contains(nums[i])) {
        		hash_set.add(nums[i]);
        	}else {
        		hash_set.remove(nums[i]);
        	}       	
        }
        Object[] arr = hash_set.toArray();
        
         return (Integer)arr[0];   
	}
