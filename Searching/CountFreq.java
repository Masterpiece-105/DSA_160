package GFG160.Searching;

public class CountFreq {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == target)
//                    count += 1;
//                else {
//
//                }
//            }
            if (arr[i] == target)
                count += 1;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        CountFreq ele = new CountFreq();
        int res = ele.countFreq(arr, target);
        System.out.println(res);
    }
}
