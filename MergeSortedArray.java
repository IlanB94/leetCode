public void merge(int[] nums1, int m, int[] nums2, int n) {
    int pointer1 = m - 1;
		int pointer2 = n - 1;
		int lastPosition = nums1.length - 1;

		while (pointer2 >= 0) {

			if (pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]) {
				nums1[lastPosition] = nums1[pointer1];
				lastPosition--;
				pointer1--;
			} else {
				nums1[lastPosition] = nums2[pointer2];
				lastPosition--;
				pointer2--;
			}
		}
