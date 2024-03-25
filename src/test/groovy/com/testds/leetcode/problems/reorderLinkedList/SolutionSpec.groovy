package com.testds.leetcode.problems.reorderLinkedList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReorderLinkedList"() {
        when:
        def head = ListNode.createList(arr as int[])
        solution.reorderList(head)
        then:
        ListNode.createArrayFromList(head) == expectedResult as int[]
        where:
        arr             | expectedResult
        [1, 2, 3, 4]    | [1, 4, 2, 3]
        [1, 2, 3, 4, 5] | [1, 5, 2, 4, 3]
    }

}
