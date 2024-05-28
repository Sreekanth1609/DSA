package LeetCode.Solutions.Arrays;

public class LCIS {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        System.out.println(findLengthOfLCIS(arr));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int ans=1,count=0;
        int i=1,sum=0,val=nums[0];
        while (i< nums.length){
            if(val < nums[i]) {
                count++;
                if(i==nums.length-1)
                {
                    ans = Math.max(ans, count+1);
                }
            }
            else {
                ans = Math.max(ans, count+1);
                count = 0;
            }
            val=nums[i];
            i++;
        }

        return ans;
    }
}
