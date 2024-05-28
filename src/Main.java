public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums ={1,1,1,0};
        for(int i=0;i< nums.length-2;i++)
        {
            for(int j=i+1;j< nums.length-2;j++)
            {
                for(int k=j+1;k< nums.length;k++)
                {
                    int sum =  nums[i] + nums[j] + nums[k];
                    System.out.println(nums[i]+","+nums[j]+","+nums[k] +" sum : "+sum);
                }
            }

        }
    }
}