package com.testds.leetcode.problems.swapNodesInPairs

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test swap nodes in pairs"() {
        given:
        ListNode head = ListNode.createList(inputList as int[])
        when:
        def actualList = solution.swapPairs(head)
        then:
        expectedList as int[] == ListNode.createArrayFromList(actualList)
        where:
        inputList    | expectedList
        [1, 2, 3, 4] | [2, 1, 4, 3]
        []           | []
        [1]          | [1]
    }
}
