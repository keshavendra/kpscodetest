package com.testds.leetcode.problems.minRemovalToBalanceArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinRemoval"() {
        when:
        def actualResult = solution.minRemoval(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums         | k | expectedResult
        [2, 1, 5]    | 2 | 1
        [1, 6, 2, 9] | 3 | 2
        [10, 10]     | 2 | 0
//        [26155, 1776, 22815, 775, 27772, 12869, 12995, 22794, 27692, 24728, 10944, 25039, 24068, 25506, 18506, 19138, 12331, 17814, 20834, 21474, 20208, 21590, 15453, 6114, 25716, 29434, 23547, 29051, 25992, 5535, 7387] | 80020 | 0

    }

}
