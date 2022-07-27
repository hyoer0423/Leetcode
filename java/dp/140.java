class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> arr = new LinkedList<>();
        List<String> res = new LinkedList<>();
        bt(0, s, wordDict, arr, res);
        return res;

    }

    private void bt(int start, String s, List<String> wordDict, List<String> arr, List<String> res) {
        if (start == s.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr.get(0));
            for (int i = 1; i < arr.size(); i++) {
                sb.append(' ');
                sb.append(arr.get(i));
            }
            res.add(sb.toString());
            return;

        }

        for (int j = start + 1; j <= s.length(); j++) {
            if (wordDict.contains(s.substring(start, j))) {
                arr.add(s.substring(start, j));
                bt(j, s, wordDict, arr, res);
                arr.remove(arr.size() - 1);
            }
        }

    }
}