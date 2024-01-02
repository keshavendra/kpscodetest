package com.testds.leetcode.problems.findMatrix

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindMatrix"() {
        when:
        def actualResult = solution.findMatrix(nums as int[])
        then:
        actualResult != null
        actualResult.flatten().size() == nums.size()
        where:
        nums                  | expected
        [1, 3, 4, 1, 2, 3, 1] | [[1, 3, 4, 2], [1, 3], [1]]
        [1, 2, 3, 4]          | [[4, 3, 2, 1]]
    }

}
