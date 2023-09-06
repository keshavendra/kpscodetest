package com.testds.leetcode.problems.splitLinkedListInParts

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test split linkedList in k parts"() {
        given:
        ListNode headOfOriginalList = ListNode.createList(inputList as int[])
        when:
        ListNode[] listNodes = solution.splitListToParts(headOfOriginalList, k)
        then:
        listNodes.size() == k
        ListNode.differenceOfSizeBetweenConsecutiveLists(listNodes, 1)
        where:
        inputList                       | k
        [1, 2, 3]                       | 5
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | 3
    }
}
