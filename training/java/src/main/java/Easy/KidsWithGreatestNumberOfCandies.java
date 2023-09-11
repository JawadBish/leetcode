package Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int maxNumberOfCandies = maxNumberOfCandie(candies);
    for ( int i = 0 ; i < candies.length; i++ ) {
        if (candies[i] + extraCandies >= maxNumberOfCandies ) {
            result.add(true);
        } else {
            result.add(false);
        }
    }
    return result;
    }

    public static int maxNumberOfCandie(int[] candies) {
        int max = 0;
        for ( int i = 0 ; i < candies.length ; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }



//    class Solution {
//        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//            List<Boolean> list = new ArrayList();
//            int max = 0;
//            for(int i:candies){
//                max = Math.max(max,i);
//            }
//            for(int candy:candies){
//                list.add(candy + extraCandies >= max);
//            }
//            return list;
//        }
//    }


    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.print(kidsWithCandies(candies,extraCandies));
    }
}
