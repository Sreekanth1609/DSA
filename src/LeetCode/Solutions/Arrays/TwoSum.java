package LeetCode.Solutions.Arrays;

import java.util.*;

public class TwoSum {
    public static void main(String args[])
    {
        int[] arr ={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        int target = 0;
        for(List integer:threeSum(arr,target)) {
            System.out.println(integer);
        }
    }
    public static int[] twoSum(int[] arr,int target)
    {
        int left =0 , right=arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right] == target)
                return new int[]{arr[left],arr[right]};
            else if (arr[left]+arr[right] < target) {
                left++;
            } else if (arr[left]+arr[right] >target) {
                right--;
            }
        }
        return new int[]{};
    }
    public static List<List<Integer>> threeSum(int[] arr,int target)
    {
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length-2;i++)
        {
            int left = i+1;
            int right = arr.length-1;
            while(left<right)
            {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target){
                    set.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
                    left++;
                    right--;
                }
                else if(sum<target) left++;
                else right--;
            }
        }
        return new ArrayList<>(set);
    }

}
