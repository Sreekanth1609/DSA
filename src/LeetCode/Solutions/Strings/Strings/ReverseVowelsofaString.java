package LeetCode.Solutions.Strings.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsofaString {
    public static void main(String a[]) {
        String s = "hello";
        System.out.println("ans :"+reverseVowels(s)+":");
    }

    public static String reverseVowels(String s) {
        List<Integer> ascii   = new ArrayList<>(Arrays.asList(65,69,73,79,85,97,101,105,111,117));
        String ans = "",leftString = "" , rightString = "";
        char[] charArr = s.toCharArray();
        for(Character ch: s.toCharArray()){

        }
        int left = 0 , right = s.length()-1;
        while (left<right)
        {
            if(ascii.indexOf((int)s.charAt(left))!=-1 ) {
                while (left < right) {
                    if (ascii.indexOf((int)s.charAt(right)) != -1) {
                        charArr[left] = s.charAt(right);
                        charArr[right] = s.charAt(left);
                        right --;
                        break;
                    }
                    right--;
                }
            }
            else {
                charArr[left] = s.charAt(left);
                charArr[right] = s.charAt(right);
            }
            left++;
        }
        return new String(charArr);
    }
}
