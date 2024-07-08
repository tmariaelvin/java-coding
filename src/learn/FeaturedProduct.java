package learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FeaturedProduct {

    /*public static String featuredProduct(List<String> products) {
        Collections.sort(products, Collections.reverseOrder());
        System.out.println(products);
        String maxCount = Collections.max(products, (s1, s2) -> Collections.frequency(products, s1) - Collections.frequency(products, s2));
        return maxCount;
    }*/
    public static String featuredProduct(List<String> products) {
        products.sort((s1, s2) -> Integer.compare(countOccurrences(products, s2), countOccurrences(products, s1)));
        System.out.println(products);
        return products.get(0);
    }

    private static int countOccurrences(List<String> list, String element) {
        int count = 0;
        for (String e : list) {
            if (e.equals(element)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        List<String> products1 = Arrays.asList("redShirt", "greenPants", "redShirt", "orangeShoes", "blackPants", "blackPants");
        System.out.println(featuredProduct(products1)); // Expected outcome = 'redShirt'

        List<String> products2 = Arrays.asList("yellowShirt", "redHat", "blackShirt", "bluePants", "redHat", "pinkHat", "blackShirt", "yellowShirt", "greenPants", "greenPants");
        System.out.println(featuredProduct(products2)); // Expected outcome = 'yellowShirt'

        List<String> products3 = Arrays.asList("greenShirt", "bluePants", "redShirt", "blackShoes", "redPants", "redPants", "whiteShirt", "redShirt");
        System.out.println(featuredProduct(products3)); // Expected outcome = 'redShirt'

        List<String> products4 = Collections.singletonList("a");
        System.out.println(featuredProduct(products4)); // Expected outcome = 'a'
    }
}
