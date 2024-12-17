 public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        int i = 0; // Left pointer

        for (int j = 0; j < s.length(); j++) { 
            while (hs.contains(s.charAt(j))) {
                hs.remove(s.charAt(i));
                i++;
            }

            hs.add(s.charAt(j));
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
