package LeetCode.Solutions.Strings.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                if (i == nums.length - 1)
                    ans = Math.max(ans, count+1);
            count++;
        }
            else if (nums[i]==0 || i == nums.length-1){
                ans = Math.max(ans, count);
                count = 0;

            }
        }
        return ans;
    }
}