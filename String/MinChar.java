package GFG160.String;


public class MinChar {

    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    static int minChar(String s){
        int cnt = 1;
        int i = s.length() -1;
        while(i >= 0 && !isPalindrome(s,0, i)){
            i--;
            cnt++;

        }
        return cnt++;
    }
    public static void main(String[] arg){
        String s= "abc";
        System.out.println(minChar(s));
    }
}
