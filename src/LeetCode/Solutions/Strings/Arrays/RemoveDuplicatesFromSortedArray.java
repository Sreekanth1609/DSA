package LeetCode.Solutions.Strings.Arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));



    }
    public static int removeDuplicates(int[] nums) {
        int ans=0,lastIndex = nums.length-1,count=1,uniqueElements=0;
        Map<Integer,Integer> uniques = new HashMap<>();
        if(nums.length == 1)
        {
            uniques.put(nums[0],nums[0]);
            return uniques.size();
        }
        for(int i=0;i<nums.length;i++)
        {
            if(count>1 || uniques.get(nums[i])!=null) {
                if(uniques.get(nums[i])!=null){
                uniques.put(nums[i], nums[i]);
                while (true) {
                    if (uniques.get(nums[lastIndex]) == null)
                        break;
                    if (i > lastIndex)
                        break;
                    lastIndex--;
                }
                if (i > lastIndex) {
                    ans = i;
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[lastIndex];
                nums[lastIndex] = temp;
                print(nums);
                count = 1;
            }
            }
            else
                count++;
            uniques.put(nums[i],nums[i]);
        }
        for (int i = 0; i <Math.min(ans,lastIndex)+1; i++) {
                for (int j = i+1; j <Math.min(ans,lastIndex)+1; j++) {
                    if(nums[i] >nums[j]) {      //swap elements if not in order
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        System.out.print("After Sorting : ");
        print(nums);
        return uniques.size();
    }
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++){
            while(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
}
