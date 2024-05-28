package LeetCode.Solutions.Arrays;

import java.util.*;

public class FourSum {
    public static void main(String args[])
    {
        int[] arr ={1,0,-1,0,-2,2};
        Arrays.sort(arr);
        int target = 0;
        System.out.println(1000000000L+1000000000+1000000000+1000000000L);
        for(List integer:fourSum(arr,target)) {
            System.out.println(integer);
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for (int j=i+1;j< nums.length-1;j++)
            {
                int left = j+1 , right = nums.length-1;
                while(left<right)
                {
                    if(nums[i]!=nums[j] &&nums[left]!=nums[right] && nums[left]!=nums[j] && nums[i]!=nums[left] &&
                            nums[right]!=nums[j]&&nums[right]!=nums[i]){
                        int sum = nums[i]+nums[j]+nums[left]+nums[right];
                        if(sum == target) {
                            answer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        }
                        if(sum < target)
                            left++;
                        else
                            right--;
                    }
                    else left++;
                }
            }
        }
        return new ArrayList<>(answer);
    }
}
