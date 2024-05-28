package LeetCode.Solutions.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumNumberOfPushesToTypeWordI {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.print(minimumPushes(word));
    }

    public static int minimumPushes(String word) {
        int ans = 0;
        Map<Integer,String> map = new LinkedHashMap<>();
        int i=2,s = 0,count = 0;
        while (s<word.length())
        {
            if(i==10)
            {
                i=2;
                count++;
            }
            if(count>0){
                map.put(i,map.get(i).concat(String.valueOf(word.charAt(s))));
            }
            else
                map.put(i,String.valueOf(word.charAt(s)));
            ans += count+1;
            i++;
            s++;
        }
        for (Integer val:map.keySet()
             ) {
            System.out.println(val+":"+map.get(val)+" ");
        }
       return ans;

    }
}
