class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> findAnagrams(String s, String p) {
        _bc(s, p);
        return res;

    }

    private void _bc(String s, String p) {

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] pattern = new int[26];
            String s1 = s.substring(i, i + p.length());
            for (char c1 : s1.toCharArray()) {
                pattern[c1 - 'a']++;
            }
            for (char c2 : p.toCharArray()) {
                pattern[c2 - 'a']--;
            }
            int flag = 0;
            for (int q : pattern) {
                if (q != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                res.add(i);
            }

        }
    }
}
