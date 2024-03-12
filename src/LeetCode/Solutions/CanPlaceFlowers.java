package LeetCode.Solutions;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int arr[] = {0,0,1,0},n=2;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int noOfFlowersCanBePlanted = 0;
        if(flowerbed.length ==1)
        {
            if(flowerbed[0]==0)
                noOfFlowersCanBePlanted = 1;
            else
                noOfFlowersCanBePlanted=0;
        } else if (flowerbed.length ==2) {
            if(flowerbed[0]==0&&flowerbed[1]==0)
                noOfFlowersCanBePlanted = 1;
            else
                noOfFlowersCanBePlanted=0;
        }
        else if (flowerbed.length ==3 && flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 0)
            return 2>=n;
        else {
            for (int i = 1; i < flowerbed.length - 1; i++) {

                int next = flowerbed[i + 1];
                int pre = flowerbed[i - 1];
                if (i == 1 && pre == 0 && flowerbed[i] == 0){
                    noOfFlowersCanBePlanted++;
                    flowerbed[i - 1] = 1;
                }
                else if (i == flowerbed.length - 2) {
                    if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                        noOfFlowersCanBePlanted++;
                        flowerbed[flowerbed.length - 1] = 1;
                    }
                } else if (flowerbed[i] == 0 && pre == 0 && next == 0) {
                    noOfFlowersCanBePlanted++;
                    flowerbed[i] = 1;
                }
            }
        }
        System.out.println(noOfFlowersCanBePlanted);
        return noOfFlowersCanBePlanted>=n;
    }
}
