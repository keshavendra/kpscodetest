package com.testds.leetcode.problems.mergeKSortedLists

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MergeKLists"() {
        given:
        def listArray = []
        for (int i = 0; i < input.size(); i++) {
            listArray.add(ListNode.createList(input[i] as int[]))
        }
        when:
        def actualResult = solution.mergeKLists(listArray as ListNode[])
        then:
        if (expectedList == null || expectedList.size() == 0)
            actualResult == null
        else {
            ListNode.createArrayFromList(actualResult) == expectedList as int[]
        }
        where:
        input                          | expectedList
        [[1, 4, 5], [1, 3, 4], [2, 6]] | [1, 1, 2, 3, 4, 4, 5, 6]
        []                             | []
        [[]]                           | []
    }

    def cleanup() {
        solution = null
    }
}
