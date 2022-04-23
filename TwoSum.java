
public class TwoSum {

	public static void main(String[] args) {
		int[] array = { 10, 0, 7, 9 };
		int target = 10;
		int [] res = twoSum(array, target);
		if(res[0] == 0 && res[1] == 0) {
			System.out.println("There is on indexes numbers in array that equal to: " + target);
		}else {
			System.out.println("The sum of the indexes: ");
			for(int i =0; i < res.length;i++) {
				if(i ==0) {
					System.out.print("[");
					System.out.print(res[i]+",");
				}else {
					System.out.print(res[i]+"]");
				}
			}
		}
		
		System.out.println(90 / 10 );
		
		
		
	}

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
