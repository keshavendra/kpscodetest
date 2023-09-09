package com.testds.leetcode.problems.removeDuplicatesFromSortedList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test remove duplicate from a sorted linked list"() {
        given:
        ListNode head = ListNode.createList(inputList as int[])
        when:
        def resultHead = solution.deleteDuplicates(head)
        then:
        expectedList as int[] == ListNode.createArrayFromList(resultHead)
        where:
        inputList       | expectedList
        [1, 1, 2]       | [1, 2]
        [1, 1, 2, 3, 3] | [1, 2, 3]
    }
}
