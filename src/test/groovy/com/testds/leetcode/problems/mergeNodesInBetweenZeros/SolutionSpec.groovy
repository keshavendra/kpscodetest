package com.testds.leetcode.problems.mergeNodesInBetweenZeros

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MergeNodesInBetweenZeros"() {
        def head = ListNode.createList(arr as int[])
        when:
        def listHead = solution.mergeNodes(head)
        then:
        expectedResult as int[] == ListNode.createArrayFromList(listHead)
        where:
        arr                      | expectedResult
        [0, 3, 1, 0, 4, 5, 2, 0] | [4, 11]
        [0, 1, 0, 3, 0, 2, 2, 0] | [1, 3, 4]
    }

}
