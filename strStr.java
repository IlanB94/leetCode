public static int strStr(String haystack, String needle) {
		int result = 0;
		int hLength = haystack.length();
		int nLength = needle.length();
		if (hLength < nLength)
			return -1;
		boolean flag = false;
		for (int i = 0; i < hLength - nLength + 1; i++) {
			if (haystack.substring(i, i + nLength).equals(needle) && !flag) {
				result = i;
				flag = true;
				break;
			}
		}
		if (flag)
			return result;
		else
			return -1;
	}
