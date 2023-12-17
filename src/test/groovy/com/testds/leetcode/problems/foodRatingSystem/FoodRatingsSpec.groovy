package com.testds.leetcode.problems.foodRatingSystem

import spock.lang.Specification

class FoodRatingsSpec extends Specification {

    FoodRatings foodRatings

    def setup() {
    }

    def "Test FoodRatings"() {
        def actualResults = []
        when:
        for (int i = 0; i < ratingActions.size(); i++) {
            String action = ratingActions.get(i)
            String result = null
            switch (action) {
                case "FoodRatings":
                    foodRatings = new FoodRatings(inputToTheAction.get(i).get(0) as String[], inputToTheAction.get(i).get(1) as String[], inputToTheAction.get(i).get(2) as int[])
                    break
                case "highestRated":
                    result = foodRatings.highestRated(inputToTheAction.get(i) as String)
                    break
                case "changeRating":
                    foodRatings.changeRating(inputToTheAction.get(i).get(0) as String, inputToTheAction.get(i).get(1) as int)
            }
            actualResults.add(i, result)
        }
        then:
        expectedResults == actualResults
        where:
        ratingActions                                                                                                   | inputToTheAction                                                                                                                                                                                                                              | expectedResults
        ["FoodRatings", "highestRated", "highestRated", "changeRating", "highestRated", "changeRating", "highestRated"] | [[["kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"], ["korean", "japanese", "japanese", "greek", "japanese", "korean"], [9, 12, 8, 15, 14, 7]], ["korean"], ["japanese"], ["sushi", 16], ["japanese"], ["ramen", 16], ["japanese"]] | [null, "kimchi", "ramen", null, "sushi", null, "ramen"]
        ["FoodRatings", "changeRating", "highestRated", "changeRating", "changeRating", "highestRated"]                 | [[["czopaaeyl", "lxoozsbh", "kbaxapl"], ["dmnuqeatj", "dmnuqeatj", "dmnuqeatj"], [11, 2, 15]], ["czopaaeyl", 12], ["dmnuqeatj"], ["kbaxapl", 8], ["lxoozsbh", 5], ["dmnuqeatj"]]                                                              | [null, null, "kbaxapl", null, null, "czopaaeyl"]
    }

}
