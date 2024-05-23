package LeetCode.Solutions.Strings.Arrays;

import java.util.*;

public class twoSumThreeSum {
    public  static  void  main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4} , target =0 ;
        for (List val: threeSum(nums,target)) {
            System.out.println(val);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<>();
        for(int i=0;i< nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                int sum = nums[i]+nums[left] + nums[right];
                if( sum == 0){
                    answer.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    right--;
                    left++;
                }
                else if(sum > 0)
                    right--;
                else
                    left++;
            }
        }
        return new ArrayList<>(answer);
    }

//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            if(map.get(nums[i]) != null){
//                return new int[]{i,map.get(nums[i])};
//            }
//            map.put(target - nums[i], i);
//        }
//
//        return nums;
//    }
//public static int[] twoSum(int[] nums, int target) {
//    Arrays.sort(nums);
//    int left =  0 , right = nums.length-1;
//    while (left<right){
//        int val = nums[left] + nums[right];
//        if( val == target){
//            return new int[]{nums[left],nums[right]};
//        }
//        if(val > target)
//            right--;
//        else if(val<target)
//            left++;
//    }
//    return nums;
//}
}
