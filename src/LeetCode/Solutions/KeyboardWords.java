package LeetCode.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KeyboardWords {
    public static void main(String[] args) {
        String [] arr = {"adsdf","sfd"};
        System.out.println(Arrays.toString(findWords(arr)));


    }

    public static String[] findWords(String[] words) {
        String[] row={"qwertyuiop","asdfghjkl","zxcvbnm"}, ans =new String[words.length];
        List<String> ans1 = new ArrayList<>();
        for (int i=0;i< words.length;i++)
        {
            int rowNumber = 0;
            while(rowNumber!=3) {
                if(fWords(words[i].toLowerCase(),row[rowNumber]))
                {
                    ans1.add(words[i]);
                }
                rowNumber++;
            }
        }
        return ans1.toArray(new String[0]);
    }
    public static boolean fWords(String word1, String word2)
    {
        char[] word3 = word1.toCharArray() , word4 = word2.toCharArray();
        for(int i=0;i<word1.length();i++)
        {
            int found =0,j=0;
            for(;j<word2.length();) {
                if(word3[i] == word4[j]) {
                    found = 1;
                    j++;
                    continue;
                }
                j++;
            }
            if(found ==0)
                return false;
        }
        return true;
    }
}
