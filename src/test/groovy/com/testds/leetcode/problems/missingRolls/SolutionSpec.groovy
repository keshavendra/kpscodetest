package com.testds.leetcode.problems.missingRolls

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MissingRolls"() {
        when:
        def actualResult = solution.missingRolls(rolls as int[], mean, n)
        then:
        expectedResult as int[] == actualResult
        where:
        rolls                                                                                                                                | mean | n  | expectedResult
        [3, 2, 4, 3]                                                                                                                         | 4    | 2  | [6, 6]
        [1, 5, 6]                                                                                                                            | 3    | 4  | [3, 2, 2, 2]
        [1, 2, 3, 4]                                                                                                                         | 6    | 4  | []
        [6, 3, 4, 3, 5, 3]                                                                                                                   | 1    | 6  | []
        [4, 2, 2, 5, 4, 5, 4, 5, 3, 3, 6, 1, 2, 4, 2, 1, 6, 5, 4, 2, 3, 4, 2, 3, 3, 5, 4, 1, 4, 4, 5, 3, 6, 1, 5, 2, 3, 3, 6, 1, 6, 4, 1, 3] | 2    | 53 | []
    }

}
