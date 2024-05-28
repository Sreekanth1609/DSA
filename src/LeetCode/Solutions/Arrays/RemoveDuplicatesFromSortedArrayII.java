package LeetCode.Solutions.Arrays;


import java.util.LinkedHashMap;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (Integer val : nums)
        {
            if(map.containsKey(val))
            {
                map.put(val,map.get(val)+1);
            }
            else {
                map.put(val,1);
            }
        }
        int iter=0,ans=0;
        for (Integer key : map.keySet())
        {
            if(map.get(key) >=2)
            {
                nums[iter] = key;
                nums[iter+1] = key;
                iter+=2;
                ans+=2;
            }
            else {
                nums[iter] = key;
                iter++;
                ans++;
            }
        }
        print(nums);
        System.out.println(map);
    return map.size();
    }
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
