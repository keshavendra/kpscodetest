package com.testds.leetcode.problems.isBalancedBinaryTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test IsBalanced"() {
        when:
        def actualResult = solution.isBalanced(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                             | expectedResult
        [3, 9, 20, null, null, 15, 7]     | true
        [1, 2, 2, 3, 3, null, null, 4, 4] | false
    }

    def cleanup() {
        solution = null
    }
}
