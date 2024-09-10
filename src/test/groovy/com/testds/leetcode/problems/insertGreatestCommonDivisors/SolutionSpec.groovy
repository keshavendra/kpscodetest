package com.testds.leetcode.problems.insertGreatestCommonDivisors

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test InsertGreatestCommonDivisors"() {
        when:
        def actualResult = solution.insertGreatestCommonDivisors(ListNode.createList(nodes as int[]))
        then:
        expectedResult as int[] == ListNode.createArrayFromList(actualResult)
        where:
        nodes          | expectedResult
        [18, 6, 10, 3] | [18, 6, 6, 2, 10, 1, 3]
        [7]            | [7]
    }

}
