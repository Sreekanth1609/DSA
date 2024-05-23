package LeetCode.Solutions.Strings.Arrays;

public class ContainsDuplicate2 {
    public static  void main(String args[])
    {

        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(removeDuplicate(nums,k));
    }
    public static boolean removeDuplicate(int[] nums, int k)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
                if((i!=j)&&(nums[i]==nums[j]) && Math.abs(i-j)<=k)
                    return true;
        }
        return false;
    }
}
