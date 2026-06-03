class Solution {
    public static boolean isValid(String s) {
        if (s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();
        
        int i = 0;
        do {
            if (i < s.length() && (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')) {
                stack.add(s.charAt(i));
                i++;
            }
            else {
                if (!stack.isEmpty() && ((stack.lastElement() == '(' && s.charAt(i) == ')') ||
                    (stack.lastElement() == '{' && s.charAt(i) == '}') ||
                    (stack.lastElement() == '[' && s.charAt(i) == ']'))) {
                    stack.pop();
                    i++;
                    continue;
                }
                else return false;
            }
        } while (i < s.length());

        if (stack.isEmpty()) return true;
        return false;
    }
}