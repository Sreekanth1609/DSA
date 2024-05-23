package LeetCode.Solutions.Strings.Strings;

import LeetCode.Solutions.Strings.Arrays.LCIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4,6,5}; // 2,3,3,4,5,6
        for(Integer val:findErrorNums(nums)){
            System.out.println(val+" ");
        }
    }
    public static int[] findErrorNums(int[] nums) {
            Arrays.sort(nums);
            int duplicateNumber =0, sum= (nums.length*(nums.length+1))/2;
            for(int i=0;i< nums.length-1;i++){
                if(nums[i] == nums[i+1]){
                    duplicateNumber = nums[i];
                }
            }
            return new int[]{sum-duplicateNumber,duplicateNumber};
    }
}
