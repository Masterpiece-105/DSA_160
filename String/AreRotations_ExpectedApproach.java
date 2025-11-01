package GFG160.String;

public class AreRotations_ExpectedApproach {
    static int[] computeLPSArray(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        // length of the previous longest prefix and suffix
        int len = 0;
        // lps[0] = 0;
        int i = 1;

        while (i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                // if len is not zero update len to last known prefix length
                if (len != 0) {
                    len = lps[len - 1];

                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // function to check if s1 , s2 are  rotations of each other
    static boolean areRotations(String s1, String s2) {
        String txt = s1 + s2;
        String pat = s2;

        // Search the pattern string s2 in the concatenation
        int n = txt.length();
        int m = pat.length();

        int[] lps = computeLPSArray(pat);
        int i = 0;
        int j = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;

            }
            if (j == m) {
                return true;
            }
            // mismatch often j matches
            else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                // do not match lps[0...lps[j-1]] character
                // they will match any way
                if (j != 0) {
                    j = lps[j - 1];

                } else {
                    i = i + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";
        System.out.println(areRotations(s1, s2));
    }
}
