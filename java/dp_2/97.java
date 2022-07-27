class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        // if(s3.length()==0 && s1.length()==0 && s2.length()==0) return true;
        // if(s3.length()==0 && (s1.length()!=0 || s2.length()!=0)) return false;
        // if((s1.length()==0 && s2==s3) || (s2.length()==0 && s1==s3)) return true;
        // if(s1.length()+s2.length()!=s3.length()) return false;

        // if((s1.length()!=0 &&s3.charAt(0)!=s1.charAt(0) )&&(s2.length()!=0 &&
        // s3.charAt(0)!=s2.charAt(0))) return false;
        // if(s1.length()!=0 && s3.charAt(0)==s1.charAt(0)){
        // if
        // (isInterleave(s1.substring(1,s1.length()),s2,s3.substring(1,s3.length()))==true)
        // return true;

        // }
        // if(s2.length()!=0 && s3.charAt(0)==s2.charAt(0)){
        // if
        // (isInterleave(s1,s2.substring(1,s2.length()),s3.substring(1,s3.length()))==true)
        // return true;

        // }
        // return false;
        if (s3.length() != s1.length() + s2.length())
            return false;
        boolean dp[][] = new boolean[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);

                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);

                } else {
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1))
                            || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                }

            }

        }
        return dp[s1.length()][s2.length()];

    }
}

class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[] dp = new boolean[s2.length() + 1];
        if (s1.length() + s2.length() != s3.length())
            return false;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[j] = true;

                } else if (j == 0) {
                    dp[j] = dp[j] && (s1.charAt(i - 1) == s3.charAt(j + i - 1));

                } else if (i == 0) {
                    dp[j] = dp[j - 1] && (s2.charAt(j - 1) == s3.charAt(j + i - 1));
                } else {
                    dp[j] = (dp[j] && (s1.charAt(i - 1) == s3.charAt(j + i - 1)))
                            || (dp[j - 1] && (s2.charAt(j - 1) == s3.charAt(j + i - 1)));
                }

            }
        }
        return dp[s2.length()];

    }
}