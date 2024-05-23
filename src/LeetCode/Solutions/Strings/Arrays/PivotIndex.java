package LeetCode.Solutions.Strings.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {-1,-1,0,0,-1,-1};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int size = nums.length;

        for(int i=0;i<nums.length;i++)
        {
            if(i==0&& calculateSum(nums,1,size) ==0){
                    return i;
            }
            else if(i== size-1 && calculateSum(nums,0,size-1) ==0){
                return i;
            }
            else{
                int leftSum = calculateSum(nums,0,i),rightSum= calculateSum(nums,i+1,size);
                if(leftSum == rightSum)
                    return i;
            }
        }

        return -1;

    }

    public static int calculateSum(int[] arr,int startIndex,int endIndex)
    {
        int sum=0;
        for(int i=startIndex;i< endIndex;i++)
            sum+=arr[i];
        return sum;
    }
}
