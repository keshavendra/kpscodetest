package com.testds.leetcode.problems.divideStringIntoGroupOfSizeK

import spock.lang.Specification


class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DivideString"() {
        when:
        def actualResult = solution.divideString(s, k, fill as char)
        then:
        expectedResult as String[] == actualResult
        where:
        s            | k | fill | expectedResult
        "abcdefghi"  | 3 | 'x'  | ["abc", "def", "ghi"]
        "abcdefghij" | 3 | 'x'  | ["abc", "def", "ghi", "jxx"]
    }

    def cleanup() {
        solution = null
    }

}
