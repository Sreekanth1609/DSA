package LeetCode.Solutions.Strings;

import java.math.BigInteger;

public class AddTwoStrings {
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.print(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        String ans = "";
        int i=Math.min(num1.length(),num2.length()), j=Math.max(num1.length(),num2.length());
        while(i>num1.length()){


            i--;
        }




        return "";
    }
    public static int[] addTwo(String s1, String s2)
    {
        int val = 0 ,carry = 0;
        int res = Integer.valueOf(s1) + Integer.valueOf(s2);
        if(res >=10)
        {
            val = String.valueOf(res).charAt(1);
            carry = String.valueOf(res).charAt(0);
        }
        else {
            return new int[]{val,carry};
        }
        return new int[]{val,carry};
    }

}
