package com.testds.leetcode.problems.foodRatingSystem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FoodRatingsTest extends TestCase {

    private FoodRatings foodRatings = null;

    @Parameterized.Parameter
    public String[] ratingActions;

    @Parameterized.Parameter(1)
    public Object[] inputToTheAction;

    @Parameterized.Parameter(2)
    public String[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"FoodRatings", "highestRated", "highestRated", "changeRating", "highestRated", "changeRating", "highestRated"},
                                new Object[]{
                                        new Object[]{new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"}, new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"}, new int[]{9, 12, 8, 15, 14, 7}}, "korean", "japanese", new Object[]{"sushi", 16}, "japanese", new Object[]{"ramen", 16}, "japanese"
                                },
                                new String[]{null, "kimchi", "ramen", null, "sushi", null, "ramen"}
                        },
                        {
                                new String[]{"FoodRatings", "changeRating", "highestRated", "changeRating", "changeRating", "highestRated"},
                                new Object[]{
                                        new Object[]{new String[]{"czopaaeyl", "lxoozsbh", "kbaxapl"}, new String[]{"dmnuqeatj", "dmnuqeatj", "dmnuqeatj"}, new int[]{11, 2, 15}},
                                        new Object[]{"czopaaeyl", 12}, "dmnuqeatj", new Object[]{"kbaxapl", 8}, new Object[]{"lxoozsbh", 5}, "dmnuqeatj"
                                },
                                new String[]{null, null, "kbaxapl", null, null, "czopaaeyl"}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(FoodRatingsTest.class);
    }

    @org.junit.Test
    public void testFoodRatings() {
        String[] resultArray = new String[ratingActions.length];
        for (int i = 0; i < ratingActions.length; i++) {
            String action = ratingActions[i];
            String result = null;
            switch (action) {
                case "FoodRatings":
                    Object[] inputToConstructorArray = (Object[]) inputToTheAction[i];
                    foodRatings = new FoodRatings((String[]) inputToConstructorArray[0], (String[]) inputToConstructorArray[1], (int[]) inputToConstructorArray[2]);
                    break;
                case "highestRated":
                    result = foodRatings.highestRated((String) inputToTheAction[i]);
                    break;
                case "changeRating":
                    Object[] inputForChangeRating = (Object[]) inputToTheAction[i];
                    foodRatings.changeRating((String) inputForChangeRating[0], (Integer) inputForChangeRating[1]);
            }
            resultArray[i] = result;
        }
        Assert.assertArrayEquals(expectedResult, resultArray);
    }
}
