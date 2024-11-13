 public int romanToInt(String s) {
        int sum =0;
		HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
		letters.put('I',1);
		letters.put('V',5);
		letters.put('X',10);
		letters.put('L',50);
		letters.put('C',100);
		letters.put('D',500);
		letters.put('M',1000);
		
		for(int i =0; i < s.length();i++) {
			if(i < s.length() - 1 && letters.get(s.charAt(i)) < letters.get(s.charAt(i+1))) {
				sum -= letters.get(s.charAt(i));
			}else {
				sum += letters.get(s.charAt(i));
			}
		}
		return sum;
    }
