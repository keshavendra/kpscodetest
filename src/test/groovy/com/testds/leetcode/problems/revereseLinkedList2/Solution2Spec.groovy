package com.testds.leetcode.problems.revereseLinkedList2

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class Solution2Spec extends Specification{
    Solution2 solution2

    def setup() {
        solution2 = new Solution2()
    }

    def "test reverse linkedList between given left and right"() {
        given:
        ListNode head = ListNode.createList(inputList as int[])
        when:
        def actualResult = solution2.reverseBetween(head, left, right)
        then:
        expectedResult as int[] == ListNode.createArrayFromList(actualResult)
        where:
        inputList       | left | right | expectedResult
        [1, 2, 3, 4, 5] | 2    | 4     | [1, 4, 3, 2, 5]
        [5]             | 1    | 1     | [5]

    }
}
