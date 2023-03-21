import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr  ={2,5,1,3,4,7};
        int n = 3;
        shuffle(arr, n);
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = nums[i];
            y[i] = nums[n+i];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < x.length; i++) {
            ans[2*i] = x[i];
            ans[2*i+1] = y[i];
        }
        return ans;
    }
}
