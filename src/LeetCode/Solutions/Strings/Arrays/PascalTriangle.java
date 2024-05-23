package LeetCode.Solutions.Strings.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static  void main(String args[])
    {
        int n=4;
        pascalTriangle(n);
    }

    public static void pascalTriangle(int row)
    {
        List<Integer> ans = new ArrayList<>();
        if (row ==0)
            ans.add(1);
        else if (row==1) {
            ans.add(1);
            ans.add(1);
        }
        {
            ans.add(1);
            ans.add(1);
            ans.add(1);
            for(int i=1;i< row-1;i++)
            {
                int num = ans.get(i - 1)+ ans.get(i);
               ans.set(i,ans.get(i-1)+ ans.get(i)) ;
            }
            ans.add(1);
        }

        System.out.println(ans);
    }
}
