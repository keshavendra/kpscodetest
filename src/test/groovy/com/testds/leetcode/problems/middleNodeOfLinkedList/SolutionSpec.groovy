package com.testds.leetcode.problems.middleNodeOfLinkedList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MiddleNodeOfLinkedList"() {
        when:
        def actualResult = solution.middleNode(ListNode.createList(arr as int[]))
        then:
        expectedResult == actualResult.val
        where:
        arr                | expectedResult
        [1, 2, 3, 4, 5]    | 3
        [1, 2, 3, 4, 5, 6] | 4
    }

}
