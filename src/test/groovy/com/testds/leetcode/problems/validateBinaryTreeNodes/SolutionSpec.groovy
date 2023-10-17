package com.testds.leetcode.problems.validateBinaryTreeNodes

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test validateBinaryTreeNodes"() {
        when:
        def actualResult = solution.validateBinaryTreeNodes(n, leftChild as int[], rightChild as int[])
        then:
        expectedResult == actualResult
        where:
        n | leftChild              | rightChild             | expectedResult
        4 | [1, -1, 3, -1]         | [2, -1, -1, -1]        | true
        4 | [1, -1, 3, -1]         | [2, 3, -1, -1]         | false
        2 | [1, 0]                 | [-1, -1]               | false
        6 | [1, -1, -1, 4, -1, -1] | [2, -1, -1, 5, -1, -1] | false
        4 | [3, -1, 1, -1]         | [-1, -1, 0, -1]        | true
    }
}
