package LeetCode.Solutions.Matrix;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] nums = {
                {1,1,0},
                {1,0,1},
                {0,0,0},};
        nums = flipAndInvertImage(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.println(nums[i][j]);
            }
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        for(int i=0;i< image.length;i++){
            image[i] = flip(image[i]);
            image[i] = reverse(image[i]);
        }
        return image;

    }
    public static int[] flip(int[] arr){
        int[] arr1 = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }

    public static int[] reverse(int[] arr){
        int[] arr1 = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==0)
            {
                arr1[i] = 1;
            }
            else arr1[i] =0;
        }
        return arr1;
    }
}
