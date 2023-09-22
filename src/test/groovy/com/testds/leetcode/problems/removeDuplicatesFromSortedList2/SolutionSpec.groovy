package com.testds.leetcode.problems.removeDuplicatesFromSortedList2

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test removal of duplicate nodes"() {
        def head = ListNode.createList(inputList as int[])
        when:
        ListNode actualList = solution.deleteDuplicates(head)
        then:
        expectedList as int[] == ListNode.createArrayFromList(actualList)
        where:
        inputList             | expectedList
        [1, 2, 3, 3, 4, 4, 5] | [1, 2, 5]
        [1, 1, 1, 2, 3]       | [2, 3]
        [1, 2, 2]             | [1]
    }
}
