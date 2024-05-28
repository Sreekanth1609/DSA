package LeetCode.Solutions.Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzBuzz(n));
        System.out.println("1%3 : "+n%3+"  2%3 : "+2%n+"  3%3 : "+n%3);
    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i==1){
                list.add(String.valueOf(i));
            }
            else if(i%3 == 0 && i%5 == 0)
                list.add("FizzBuzz");
            else if(i%3 == 0)
                list.add("Fizz");
            else if(i%5 == 0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;

    }
}
