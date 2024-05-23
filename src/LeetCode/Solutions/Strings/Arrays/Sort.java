package LeetCode.Solutions.Strings.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {0,4,1,3,2,2,1,3,1,0};
        sort(arr);
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void sort(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        int size = 5;
        for (int i = 0; i <size; i++) {
            for (int j = i+1; j <size; j++) {
                if(arr[i] >arr[j]) {      //swap elements if not in order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            list.add(arr[i]);
        }
        System.out.print(list);
    }
}
