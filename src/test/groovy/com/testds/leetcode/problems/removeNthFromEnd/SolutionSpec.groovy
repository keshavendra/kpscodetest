package com.testds.leetcode.problems.removeNthFromEnd

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RemoveNthFromEnd"() {
        when:
        def actualResult = solution.removeNthFromEnd(ListNode.createList(arr as int[]), n)
        then:
        expectedResult as int[] == ListNode.createArrayFromList(actualResult)
        where:
        arr             | n | expectedResult
        [1, 2, 3, 4, 5] | 2 | [1, 2, 3, 5]
        [1]             | 1 | []
        [1, 2]          | 1 | [1]
        [1, 2]          | 2 | [2]
    }

}
