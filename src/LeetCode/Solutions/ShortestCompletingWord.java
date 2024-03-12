package LeetCode.Solutions;

import java.util.*;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "Ah71752", words[] = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
        System.out.println(shortestCompletingWord(licensePlate,words));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        char arr[] = licensePlate.toCharArray();
        Map<Character,Integer> licensePlateMap = frequency(arr);

        for (int i=0;i<words.length;i++)
        {
            int found=1;
            Map<Character,Integer> wordsMap = frequency(words[i].toCharArray());
            Set<Character> keySet = licensePlateMap.keySet();
            for(Character val : keySet)
            {
                if( wordsMap.get(val) != null && licensePlateMap.get(val) <= wordsMap.get(val) )
                {
                    continue;
                }
                else {
                    found = 0;
                    break;
                }
            }
            if(found == 1){
                return words[i];
            }
        }
        return "";
    }

    public static Map<Character,Integer> frequency(char[] arr)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char val: arr)
        {
            char ele = Character.toLowerCase(val);
            if((int) ele >=97 && (int) ele <=122) {
                if (map.get(ele) != null)
                    map.put(ele, map.get(ele) + 1);
                else
                    map.put(ele, 1);
            }
        }
        return  map;
    }
}
