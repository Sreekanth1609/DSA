package LeetCode.Solutions.Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.print(findWordsContaining(words,x));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].indexOf(x)!=-1)
                ans.add(i);
        }
        return ans;

    }
}
