package LeetCode.Solutions.Strings;

public class NumberofChangingKeys {

    public static void main(String[] args) {
        String s = "AaAaAaaA";
        System.out.print(countKeyChanges(s));
    }

    public static int countKeyChanges(String s) {
        int ans=0;
        char[] chArr = s.toLowerCase().toCharArray();
        for(int i=0;i<chArr.length-1;i++)
        {
            if(chArr[i]!=chArr[i+1])
            {
                ans++;
            }

        }
        return ans;
    }
}
