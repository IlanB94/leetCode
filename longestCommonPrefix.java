public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs[0].isEmpty()) return "";

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) { // Start from the second string
                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return prefix.toString();
                }
            }
            prefix.append(current);
        }

        return prefix.toString();
}
