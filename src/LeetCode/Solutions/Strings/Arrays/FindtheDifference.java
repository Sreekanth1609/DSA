package LeetCode.Solutions.Strings.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.print(findTheDifference(s,t));
    }
    public  static char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = frequency(s.toCharArray());
        Map<Character, Integer> tMap = frequency(t.toCharArray());
        for(Character val : tMap.keySet())
        {
            if (sMap.get(val) == null || sMap.get(val) != tMap.get(val) )
                return val;
        }

        return 0;
    }


    public static Map<Character,Integer> frequency(char[] arr)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char val: arr)
        {
            if (map.get(val) != null)
                    map.put(val, map.get(val) + 1);
                else
                    map.put(val, 1);
        }
        return  map;
    }
}
