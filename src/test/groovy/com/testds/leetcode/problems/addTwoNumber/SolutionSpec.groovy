package com.testds.leetcode.problems.addTwoNumber

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test List addition with different lists"() {
        given:
        ListNode l1 = Solution.createList(list1 as int[])
        ListNode l2 = Solution.createList(list2 as int[])

        when:
        ListNode actualResult = solution.addTwoNumbers(l1, l2)

        then:
        assert equalNodeLists(actualResult, Solution.createList(expectedList as int[]))

        where:
        list1                 | list2        | expectedList
        [2, 4, 9]             | [5, 6, 4, 9] | [7, 0, 4, 0, 1]
        [2, 4, 3]             | [5, 6, 4]    | [7, 0, 8]
        [0]                   | [0]          | [0]
        [9, 9, 9, 9, 9, 9, 9] | [9, 9, 9, 9] | [8, 9, 9, 9, 0, 0, 0, 1]
    }

    def equalNodeLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            def val1 = list1.val
            def val2 = list2.val
            if (val1 != val2)
                return false
            list1 = list1.next
            list2 = list2.next
        }
        if (!(list1 == null && list2 == null))
            return false

        return true
    }
}
