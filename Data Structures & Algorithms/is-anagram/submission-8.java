class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sc = new char[s.length()];
        char[] tc = new char[t.length()];
        
        for (int i = 0; i < s.length(); i++) {
            sc[i] = s.charAt(i);
            tc[i] = t.charAt(i);
        }

        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i = 0; i < s.length(); i++) {
            if (sc[i] == tc[i])
                continue;
            return false;
        }
        return true;
    }
}
