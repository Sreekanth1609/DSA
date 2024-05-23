package LeetCode.Solutions.Strings.Strings;



//To-do Solution
public class MakeThreeStringsEqual {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "abb", s3 = "ab";
        System.out.print(findMinimumOperations(s1,s2,s3));
    }
    public static int findMinimumOperations(String s1, String s2, String s3) {
        int ans = 0;
        char s1ch[] = s1.toCharArray() , s2ch[] = s2.toCharArray() , s3ch[] = s3.toCharArray();
        int maxSize  = Math.max(s1ch.length, Math.max(s2ch.length,s3.length()));
        int minSize  = Math.min(s1ch.length, Math.min(s2ch.length,s3.length()));
        String temp = "";
        for(int i=0;i<minSize;i++)
        {
            if(s1ch[i] == s2ch[i] && s1ch[i] == s3ch[i])
            {
                temp = temp.concat(String.valueOf(s1ch[i]));
                ans++;
            }
            else break;
        }
        System.out.println(ans);
        ans =  maxSize - temp.length();

        return ans>=0?ans:-1;
    }
}
