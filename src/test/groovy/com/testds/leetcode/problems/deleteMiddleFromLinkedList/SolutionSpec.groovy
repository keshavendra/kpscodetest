package com.testds.leetcode.problems.deleteMiddleFromLinkedList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DeleteMiddle"() {
        when:
        def actualResult = solution.deleteMiddle(ListNode.createList(nodeList as int[]))
        then:
        expectedList as int[] == ListNode.createArrayFromList(actualResult)
        where:
        nodeList              | expectedList
        [1, 3, 4, 7, 1, 2, 6] | [1, 3, 4, 1, 2, 6]
        [1, 2, 3, 4]          | [1, 2, 4]
        [2, 1]                | [2]
    }

    def cleanup() {
        solution = null
    }

}
