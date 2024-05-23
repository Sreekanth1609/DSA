package LeetCode.Solutions.Strings.Arrays;

class SolutionTwoSum {


    public static  void main(String args[])
    {
        int[] arr={5,1,2,3,4,5,6};
        int target = 10;
        int[] res = twoSum(arr,target);
        for (int i=0;i<twoSum(arr,target).length;i++)
        {
            System.out.println(res[i]);
        }

    }
    public static int[] twoSum(int[] nums, int target)
    {
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            for(;j<=nums.length-1;j++)
            {
                if(i==nums.length)
                    i=i-1;
                if(nums[i] == nums[j] && (nums[i] + nums[j]) == target)
                {
                    ans[0]=i;ans[1]=j;
                    return ans;
                }
                else
                {
                    if ((nums[i] + nums[j]) == target)
                    {
                        ans[0]=i;ans[1]=j;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}

