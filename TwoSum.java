
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] returnArray = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					returnArray[0] = i;
					returnArray[1] = j;
					return returnArray;
				}
			}
		}
		return returnArray;
	}
}
