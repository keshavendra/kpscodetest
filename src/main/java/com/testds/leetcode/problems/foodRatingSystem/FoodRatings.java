//https://leetcode.com/problems/design-a-food-rating-system
package com.testds.leetcode.problems.foodRatingSystem;

import java.util.*;

public class FoodRatings {

    private final Map<String, Set<String>> cusineToSetOfFoodMap;

    private final Map<String, String> foodToCusineMap;
    private final Map<String, Integer> foodToRatingMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {

        cusineToSetOfFoodMap = new HashMap<>();
        foodToRatingMap = new HashMap<>();
        foodToCusineMap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            foodToRatingMap.put(food, rating);
            foodToCusineMap.put(food, cuisine);

            if (!cusineToSetOfFoodMap.containsKey(cuisine)) {
                cusineToSetOfFoodMap.put(cuisine, new TreeSet<>((o1, o2) -> {
                    int rating1 = foodToRatingMap.get(o1);
                    int rating2 = foodToRatingMap.get(o2);
                    if (rating1 != rating2)
                        return rating2 - rating1;
                    return o1.compareTo(o2);
                }));
            }
            cusineToSetOfFoodMap.get(cuisine).add(food);
        }

    }

    public void changeRating(String food, int newRating) {
        Set<String> cusineRatingSet = cusineToSetOfFoodMap.get(foodToCusineMap.get(food));
        cusineRatingSet.remove(food);
        foodToRatingMap.put(food, newRating);
        if (!cusineRatingSet.add(food))
            System.out.println("Not Added");
    }

    public String highestRated(String cuisine) {
        return cusineToSetOfFoodMap.get(cuisine).iterator().next();
    }

}
