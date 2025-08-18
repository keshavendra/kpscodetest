package com.testds.leetcode.problems.newGame21

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Testing NewGame21 with n : #n, k : #k, maxPts : #maxPts and expectedResult : #expectedResult")
    def "Test NewGame21"() {
        when:
        def actualResult = solution.new21Game(n, k, maxPts)
        then:
        expectedResult as double == actualResult
        where:
        n    | k    | maxPts | expectedResult
        10   | 1    | 10     | 1.00000
        6    | 1    | 10     | 0.60000
        21   | 17   | 10     | 0.73278
        2    | 2    | 2      | 0.75
        1000 | 1000 | 500    | 0.0039
        9811 | 8776 | 1096   | 0.99696
    }

    def cleanup() {
        solution = null
    }

}
