class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] cha = s.toCharArray();
            Arrays.sort(cha);
            String nStr = new String(cha);

            if (!map.containsKey(nStr))
                map.put(nStr, new ArrayList<>());

            map.get(nStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
