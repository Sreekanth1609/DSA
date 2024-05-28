package LeetCode.Solutions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class BaseBall {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String[] arr = {"-42","90","82","+","C","-21","43","D","D","-32","-98","83","D","-86","68","68","D","C","C","7"};
        for(int i=0;i<arr.length;i++)
        {
            switch(arr[i])
            {
                case "C" : {
                    C(list,list.size()-1);
                    break;
                }
                case "D" : {
                    D(list);
                    break;
                }
                case "+" : {
                    plus(list);
                    break;
                }
                default:list.add(Integer.valueOf(arr[i]));
            }
        }

        int sum=0;
        for(Integer val : list)
            sum += val;
        System.out.println(list+" "+sum);
    }

    public static void C(List<Integer> list,int removeIndex)
    {
        list.remove(removeIndex);

    }
    public static void D(List<Integer> list)
    {
        list.add(list.get(list.size()-1) * 2);

    }
    public static void plus(List<Integer> list)
    {
        list.add(list.get(list.size()-1) + list.get(list.size()-2));
    }
}
