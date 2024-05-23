package LeetCode.Solutions.Strings.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiaAppearedNumbersInArray {
    public static  void main(String args[])
    {
        int[] nums= {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));


    }
        public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            int j=0;
            for(int i = 0; i<nums.length; i++){

                int temp = nums[j];

                if(temp > j+1 && temp != nums[temp-1] ){
                    swap(temp, nums);
                }else{
                    j++;
                }
            }
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i] != i+1){
                    ans.add(i+1);
                }
            }
            return ans;
        }
        public static void swap(int temp, int[] arr){
            int secTemp = arr[temp-1];
            arr[temp-1] = temp;
            arr[0] = secTemp;

            System.out.println(Arrays.toString(arr));

        }

    }

//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> ans = new ArrayList<>();
//        for(int val : nums)
//            list.add(val);
//        int start =1, end = nums.length;
//        while(start<end)
//        {
//            if(!list.contains(start))
//                ans.add(start);
//            if( !list.contains(end))
//                ans.add(end);
//            start++;
//            end--;
//        }
//
//        return ans;
//    }

