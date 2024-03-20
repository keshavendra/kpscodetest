package com.testds.leetcode.problems.mergeInBetweenList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MergeInBetweenList"() {
        when:
        def actualResult = solution.mergeInBetween(ListNode.createList(list1 as int[]),
                a, b, ListNode.createList(list2 as int[]))
        then:
        expectedResult as int[] == ListNode.createArrayFromList(actualResult)
        where:
        list1                 | a | b | list2                                         | expectedResult
        [10, 1, 13, 6, 9, 5]  | 3 | 4 | [1000000, 1000001, 1000002]                   | [10, 1, 13, 1000000, 1000001, 1000002, 5]
        [0, 1, 2, 3, 4, 5, 6] | 2 | 5 | [1000000, 1000001, 1000002, 1000003, 1000004] | [0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6]

    }

}
