package com.testds.leetcode.problems.doubleNumRepresentedByLL

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test doubleIt"() {
        given:
        def head = ListNode.createList(arr as int[])
        when:
        def newHead = solution.doubleIt(head)
        then:
        ListNode.createArrayFromList(newHead) == expectedList as int[]
        where:
        arr       | expectedList
        [1, 8, 9] | [3, 7, 8]
        [9, 9, 9] | [1, 9, 9, 8]
    }

}
