class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> sch = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58)
                sch.add(s.charAt(i));
            else if (s.charAt(i) > 64 && s.charAt(i) < 91)
                sch.add(Character.toLowerCase(s.charAt(i)));
            else if (s.charAt(i) > 96 && s.charAt(i) < 123)
                sch.add(s.charAt(i));
            else continue;
        }

        ArrayList<Character> nch = new ArrayList<>();

        for (int i = sch.size() - 1; i > -1; i--) {
            nch.add(sch.get(i));
        }

        for (int i = 0; i < sch.size(); i++)
            if (nch.get(i) != sch.get(i)) return false;

        return true;
    }
}
