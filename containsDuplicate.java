class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash_set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!hash_set.contains(nums[i])) {
				hash_set.add(nums[i]);
			} else {
				return true;
			}
		}
		return false;
    }
}
