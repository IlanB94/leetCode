public static boolean isAnagram(String s, String t) {
		char [] s_CharArray = s.toCharArray();
		char [] t_CharArray = t.toCharArray();
		
		Arrays.sort(s_CharArray);
		Arrays.sort(t_CharArray);
		
		if(s_CharArray.length != t_CharArray.length) {
			return false;
		}
		
		for(int i =0; i < s_CharArray.length;i++) {
			if(s_CharArray[i] != t_CharArray[i]) {
				return false;
			}
		}
		return true;
	}
