package LeetCode.Solutions.Arrays;

import java.util.*;

public class RelativeRank {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.asList(findRelativeRanks(arr)));
    }
    public static String[] findRelativeRanks(int[] score) {

        String[] ans = new String[score.length];List<Integer> list = new ArrayList<>();
        for (Integer val: score) {
            list.add(val);

        }

        int rank = score.length;
        while(rank != 0)
        {
            int min = Collections.min(list);
            for(int i=0;i<score.length;i++)
            {
                if(min == score[i]) {
                if(rank == 1)
                    ans[i] = "Gold Medal";
                else if (rank ==2 )
                    ans[i] = "Bronze Medal";
                else if (rank == 3)
                    ans[i] = "Silver Medal";
                else
                    ans[i] = String.valueOf(rank);

                int index = list.indexOf(min);
                list.remove(index);
                break;
                }
            }
            rank--;
        }

        return ans;

    }
}
