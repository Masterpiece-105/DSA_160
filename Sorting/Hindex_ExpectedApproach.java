package GFG160.Sorting;

public class Hindex_ExpectedApproach {
    static int hIndex(int[] citations) {
        int n = citations.length;
        int[] freq = new int[n + 1];
        // Count the frequency of citations
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n) {
                freq[n] += 1;

            } else {
                freq[citations[i]] += 1;
            }
        }
        int idx = n;
        // variable to keep track of the count of papers having at least idx citations
        int s = freq[n];
        while (s < idx) {
            idx--;
            s += freq[idx];

        }
        // return largest index from which the count of paper with at least idx citations becomes >= idx
        return idx;
    }

    public static void main(String[] args) {
        int[] citations = {6, 0, 3, 5, 3};
        System.out.println(hIndex(citations));
    }
}
