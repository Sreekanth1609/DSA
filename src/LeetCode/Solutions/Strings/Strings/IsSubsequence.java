package LeetCode.Solutions.Strings.Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.print(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int j=0,count=0;
        for(int i=0;i<s.length();i++)
        {
            int found =0 ;
            for(;j<t.length();j++) {
                if (s.charAt(i) == t.charAt(j)){
                    count++;
                    j++;
                    break;
                }
            }
        }
        return s.length() == count;

    }
}
