package LeetCode.Solutions.Strings.Arrays;

import java.util.*;


// Problem statement  :  remove Duplicates and replace unique elements in the original array
public class SolutionRemoveDuplicates {

    public static void main(String args[]) {
        int nums[] = {-3,-1,0,0,0,3,3};
//        int ans[] = removeDuplicates(nums);
//        for (int val: ans)
//        {
//         System.out.println(val);
//        }
        removeDuplicates(nums);

    }

    public static void removeDuplicates(int[] arr) {

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int iter=0; iter <arr.length ;iter++)
        {
            map.put(arr[iter],arr[iter]);
        }

        int [] keysOfMap = new int[map.size()];
        int i=0;
        for(int key : map.keySet()) {
            keysOfMap[i] = key;
            System.out.println(key);
            i++;
        }
        for(int j=0;j<keysOfMap.length;j++)
        {
            arr[j]=keysOfMap[j];
        }


    }
}
