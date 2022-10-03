class BinarySearch {

	public int search(int[] nums, int target) {
        int mid = nums.length/2;
        
        if(target > nums[nums.length-1]) {
        	return -1;
        }else if(target < nums[mid]){
        	for(int i =0; i < nums.length/2;i++) {
        		if(nums[i] == target) {
        			return i;
        		}
        	}
        }else {
        	for(int i = nums.length/2; i < nums.length;i++) {
        		if(nums[i] == target) {
        			return i;
        		}
        	}
        }
        return -1;
    }

}
