package com.testds.leetcode.problems.maximumPairSumInLinkedList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test PairSum"() {
        when:
        def actualResult = solution.pairSum(ListNode.createList(arr as int[]))
        then:
        expectedResult == actualResult
        where:
        arr          | expectedResult
        [5, 4, 2, 1] | 6
        [4, 2, 2, 3] | 7
        [1, 100000]  | 100001
    }

    def cleanup() {
        solution = null
    }

}
