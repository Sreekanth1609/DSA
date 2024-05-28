package LeetCode.Solutions.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"}, list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.print(Arrays.asList(findRestaurant(list1,list2)));
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        int least = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j< list2.length;j++) {
                if (list1[i].equals(list2[j])) {
                    map.put(list1[i],i+j);
                    least = Math.min(least,i+j);
                    if(map.get(list1[i]) == least){
                        list.add(list1[i]);
                    }
                }
            }
        }
        List<Integer> list3 = new ArrayList<>();
//        for(Integer val : map.values()){
//            least = Math.min(least,val);
//            list3.add(val);
//
//        }
//        for(String val :map.keySet()){
//            if(map.get(val) == least){
//                list.add(val);
//            }
//        }
        System.out.println(map);
        System.out.println(least);
        return list.stream().toArray(String[]::new);
    }
}
