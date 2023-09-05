package com.testds.leetcode.problems.copyListWithRandomPointer

import spock.lang.Specification

class Solution1Spec extends Specification {
    Solution1 solution

    def setup() {
        solution = new Solution1()
    }

    def "test copy list with random pointers"() {
        given:
        def originalList = Solution1.createList(nodeArray as Integer[][])
        when:
        def copiedList = solution.copyRandomList(originalList)
        then:
        Solution1.nodeToListofListOfIntegers(copiedList) == nodeArray as Integer[][]
        where:
        nodeArray << [[[7, null], [13, 0], [11, 4], [10, 2], [1, 0]], [[1, 1], [2, 1]], [[3, null], [3, 0], [3, null]],[[]]]

    }
}
