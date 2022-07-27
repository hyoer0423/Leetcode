class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        // Map<char,int> tmap=new HashMap<>();
        for (char c1 : s.toCharArray()) {
            if (smap.containsKey(c1)) {
                int num = smap.get(c1);
                smap.put(c1, num + 1);
            } else {
                smap.put(c1, 1);
            }
        }
        for (char c2 : t.toCharArray()) {
            if (smap.containsKey(c2)) {
                int num = smap.get(c2);
                smap.put(c2, num - 1);
            } else {
                return false;
            }
        }
        for (char i : smap.keySet()) {
            if (smap.get(i) != 0)
                return false;

        }
        return true;

    }
}