package com.testds.leetcode.problems.modifiedList

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ModifiedList"() {
        when:
        def actualResult = solution.modifiedList(nums as int[], ListNode.createList(nodes as int[]))
        then:
        expectedResult as int[] == ListNode.createArrayFromList(actualResult)
        where:
        nums            | nodes              | expectedResult
        [1, 2, 3]       | [1, 2, 3, 4, 5]    | [4, 5]
        [1]             | [1, 2, 1, 2, 1, 2] | [2, 2, 2]
        [5]             | [1, 2, 3, 4]       | [1, 2, 3, 4]
        [1, 7, 6, 2, 4] | [3, 7, 1, 8, 1]    | [3, 8]
    }

}
