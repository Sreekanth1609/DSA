package LeetCode.Solutions.Arrays;

import java.util.Arrays;

public class NexGreaterEle {
    public static void main(String args[])
    {
        int nums1[] ={2,4}, nums2[] ={1,2,3,4};
        System.out.print(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int[] ans = new int[nums1.length];
        for(int i=0;i< nums1.length;i++)
        {
            int j=0,status=0;
           for(;j< nums2.length;)
           {
               if(nums1[i]==nums2[j])
               {
                   while(j!= nums2.length)
                   {
                       if(nums1[i]<nums2[j]) {
                           ans[i] = nums2[j];
                           status = 1;
                           break;
                       }
                       j++;
                   }
                   if(j== nums2.length || status==1)
                       break;
                   j++;
               }
               j++;


           }
           if(j==nums2.length)
               ans[i]=-1;
        }
        return ans;

    }

}
