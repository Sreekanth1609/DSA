package LeetCode.Solutions.Strings.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int timeSeries[] = {1,2,3,4,5,6,7,8,9}, duration = 100000;
        int ans=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<timeSeries.length;i++)
        {
            set.add(timeSeries[i]);
            set.add(timeSeries[i]+duration-1);
        }
        System.out.println(set.size());
    }

}
