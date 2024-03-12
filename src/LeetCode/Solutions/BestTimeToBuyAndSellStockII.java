package LeetCode.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }
    public static int maxProfit(int[] prices) {
        List<Integer> list =  new ArrayList<>();
        for(Integer val : prices)
        {
            list.add(val);
        }

        Optional<Integer> lowPriceOfStock=list.stream()
                .min(Integer::compareTo);
        int start =list.indexOf(lowPriceOfStock);
        int profit=0;
        for(int i=start+1;i<prices.length;i++)
        {
              if(prices[start] > prices[i])
              {
                  profit += prices[i-1] - prices[start];
                  list.remove(lowPriceOfStock);
                  
              }
        }
        return 0;

    }
}
