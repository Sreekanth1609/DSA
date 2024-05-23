package LeetCode.Solutions.Strings.Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        for (int i=0;i<s.length();i++)
        System.out.print(shortestToChar(s,c)[i]+" ");
    }
    public static int[] shortestToChar(String s, char c) {
        int ans[] = new int[s.length()];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int firstIndex = 0, index = i, lastIndex = 0;
            if(charArray[i] == c)
            {
                ans[i] = 0;
            }
            else if (i == 0) {
                for (int j = i; j < charArray.length; j++) {
                    if (charArray[j] == c) {
                        ans[i] = j;
                        break;
                    }
                }
            }
            else {
                for (int j = i; j < charArray.length; j++) {
                    if (charArray[j] == c) {
                        lastIndex = j;
                        break;
                    }
                }
                int found=0;
                for (int j = 0; j < i; j++) {
                    if (charArray[j] == c) {
                        firstIndex = j;
                        found =1;
                    }
                    else {
                        if( found==0)
                            firstIndex =Integer.MAX_VALUE;
                    }
                }
                int ans1 = Math.min(Math.abs(firstIndex - i), Math.abs(lastIndex - i));
                ans[i] = ans1;
            }

        }

        return ans;
    }

}
