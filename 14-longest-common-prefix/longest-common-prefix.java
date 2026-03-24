class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";
        
        String prefix = strs[0];

        for (int i = 1; i < n; i++) {
            String curr = strs[i];
            StringBuilder sb = new StringBuilder();

            int len = Math.min(prefix.length(), curr.length());

            for (int j = 0; j < len; j++) {
                if (prefix.charAt(j) == curr.charAt(j)) {
                    sb.append(prefix.charAt(j));
                } else {
                    break;
                }
            }

            prefix = sb.toString();
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}