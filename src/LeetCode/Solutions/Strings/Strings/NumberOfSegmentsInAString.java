package LeetCode.Solutions.Strings.Strings;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        String word = "Hello, my name is John";
        System.out.print(countSegments(word));
    }
    public static int countSegments(String s) {
        int ans = 0;
        List<String> list = new ArrayList<>();
        String temp  = "";
        for (int i=0;i<s.length();i++)
        {
            String c = String.valueOf(s.charAt(i)).toLowerCase();
            if(c.charAt(0) == 32) {
                if(temp.length()>0) {
                    list.add(temp);
                    temp = "";
                }
            }
            else {
                temp = temp.concat(String.valueOf(c.charAt(0)));

            }
             if (i == s.length()-1 && temp.length()>0) {
                    list.add(temp);

            }
        }
        System.out.println(list);
        return list.size();
    }
}
