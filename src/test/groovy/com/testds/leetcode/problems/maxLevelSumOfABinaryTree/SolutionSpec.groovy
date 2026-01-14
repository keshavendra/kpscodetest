package com.testds.leetcode.problems.maxLevelSumOfABinaryTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MaxLevelSum"() {
        when:
        def actualResult = solution.maxLevelSum(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                                                                                           | expectedResult
        [1, 7, 0, 7, -8, null, null]                                                                    | 2
        [989, null, 10250, null, null, 98693, -89388, null, null, null, null, null, null, null, -32127] | 2
    }

    def cleanup() {
        solution = null
    }

}
