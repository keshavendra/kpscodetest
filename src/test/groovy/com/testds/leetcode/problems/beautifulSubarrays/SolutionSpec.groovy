package com.testds.leetcode.problems.beautifulSubarrays

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test BeautifulSubarrays"() {
        when:
        def actualResult = solution.beautifulSubarrays(nums as int[])
        then:
        expectedResult as long == actualResult
        where:
        nums            | expectedResult
        [4, 3, 1, 2, 4] | 2
        [1, 10, 4]      | 0
    }

}
