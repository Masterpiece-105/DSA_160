package GFG160.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval_expectedApproach {
    static ArrayList<int[]> insertInterval(int[][] interval, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        int n = interval.length;

        while (i < n && interval[i][1] < newInterval[0]) {
            res.add(interval[i]);
            i++;
        }
        // Merge all overlapping intervals with the new intervals
        while (i < n && interval[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], interval[i][0]);
            newInterval[1] = Math.max(newInterval[1], interval[i][1]);
            i++;

        }
        res.add(newInterval);
        // Add all the remaining intervals
        while (i < n) {
            res.add(interval[i]);
            i++;

        }
        // return the result as list<int[i]>
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {4, 5}, {6, 7}, {8, 10}};
        int[] newInterval = {5, 6};

        ArrayList<int[]> res = insertInterval(intervals, newInterval);
        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }

    }

}
