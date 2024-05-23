package LeetCode.Solutions.Strings.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static  void main(String args[])
    {
        int[] nums= {0,1,2,4,5,7};

        System.out.println(summaryRanges(nums));


    }

    public static List<String> summaryRanges(int[] nums)
    {
        List<String> ans = new ArrayList<>();

        int i=0,start =0 ,end =0;
        for(;i< nums.length;)
        {
            if(i==nums.length-1 && end == nums[i]) {
                end = nums[i];
                ans.add("\""+String.valueOf(end)+"\"");
                break;
            }
            start = nums[i];
            end = nums[i];
            while (true) {
                if(i==nums.length-1){
                    i++;
                    break;}
                if (nums[i] + 1 == nums[i + 1]) {
                    end = nums[i + 1];
                    i++;
                    continue;
                }
                else {
                    i++;
                    break;
                }
            }
            if(start == end)
                ans.add("\""+String.valueOf(start)+"\"");
            else
                ans.add("\""+String.valueOf(start)+"->"+String.valueOf(end)+"\"");

        }

        return ans;


    }
}
