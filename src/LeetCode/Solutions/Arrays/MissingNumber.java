package LeetCode.Solutions.Arrays;

import java.util.ArrayList;
import java.util.List;

// Missing Number = n*(n+1)/2 - actual sum of array
public class MissingNumber {
    public static  void main(String args[])
    {
        int[] nums= {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));


    }
    public static int missingNumber(int[] arr) {
        List<Integer> ar = new ArrayList();
        int size = arr.length ;
        int expectedSum = (size * (size + 1)) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
