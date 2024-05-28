package LeetCode.Solutions.HashTable.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "ohvhjdml";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        List<Character> list = new ArrayList<>();
        char[] charStr = s.toCharArray();
        if(s.isEmpty())
            return 0;
        if(s.length()==1)
            return 1;
        int answer = Integer.MIN_VALUE,i=1;
        list.add(charStr[0]);
        while(i!=s.length())
        {
            if(list.contains(charStr[i])){
                if (list.indexOf(charStr[i]) == 0){
                    list.removeFirst();
                }
                else {
                    while(true){
                        if(list.getFirst() == charStr[i])
                        {
                            list.removeFirst();
                            break;
                        }
                        list.removeFirst();
                    }
                }
            }
            list.add(charStr[i]);
            System.out.println(list);
            answer = Math.max(answer, list.size());
            i++;
        }

        return answer;
    }


}
