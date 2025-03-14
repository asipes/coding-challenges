package org.solutions.leetcode.medium;

public class ZeroArrayTransformationII {
    public int minZeroArray(int[] nums, int[][] queries) {
        boolean isZero = isIsZero(nums);

        if (isZero) {
            return 0;
        }

        int left = 1;
        int right = queries.length;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canZero(nums, queries, mid)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    private static boolean isIsZero(int[] nums) {
        boolean isZero = true;
        for (int num : nums) {
            if (num != 0) {
                isZero = false;
                break;
            }
        }
        return isZero;
    }

    private boolean canZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 2];

        for (int i = 0; i < k; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            diff[l] += val;
            diff[r + 1] -= val;
        }

        int[] sum = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            sum[i] = curr;
        }

        for (int i = 0; i < n; i++) {
            if (sum[i] < nums[i]) {
                return false;
            }
        }

        return true;
    }
}
