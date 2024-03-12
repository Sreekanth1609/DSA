package LeetCode.Solutions;

import java.util.LinkedHashMap;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] arr = {6,6,6,7,7};
        System.out.println(findShortestSubArray(arr));
    }

    public static int findShortestSubArray(int[] nums) {

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int degreeOfArray=0,ele=0;
        for (Integer val:nums) {
            if(map.get(val) != null)
            {
                map.put(val,map.get(val)+1);
                degreeOfArray = map.get(val);
                ele = val;
            }
            else {
                map.put(val,1);
            }
        }
        int ele1=0,max=0;
        for(Integer key : map.keySet())
        {
            if(max < map.get(key))
            {
                ele1 = key;
                max = map.get(key);
            }
        }

        int startIndex=0,endIndex=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele1)
            {
                if(count==0)
                {
                    startIndex = i;
                    count++;
                }
                else {
                    endIndex = i;
                    count++;
                }
            }
        }
        System.out.println(degreeOfArray+" "+ele1+" startIndex :"+startIndex+" endIndex: "+endIndex);
        return endIndex-startIndex+1;
    }
}
