package GFG160.String;

public class AddBinary {

    static String trimLeadingZeros(String s) {
        // find the position of first
        int firstOne = s.indexOf('1');
        return (firstOne == -1) ? "0" : s.substring(firstOne);
    }

    public static String addBinary(String s1, String s2) {
        // Trim leading zeros
        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);

        int n = s1.length();
        int m = s2.length();

        // swap the String if s1 is of smaller length
        if (n < m) {
            return addBinary(s2, s1);
        }

        int j = m - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Traverse both String from the end

        for (int i = n - 1; i >= 0; i--) {
            // current bit of s1
            int bit1 = s1.charAt(i) - '0';
            int sum = bit1 + carry;

            if (j >= 0) {
                int bit2 = s2.charAt(j) - '0';
                sum = sum + bit2;
                j--;
            }
            // calculate the resultbit and update carry
            int bit = sum % 2;
            carry = sum / 2;
            // update the current bit in result
            result.append((char) (bit + '0'));
        }
        // If there's any carry left , update the result
        if (carry > 0) {
            result.append('1');
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";
        System.out.println(addBinary(s1, s2));

    }
}
