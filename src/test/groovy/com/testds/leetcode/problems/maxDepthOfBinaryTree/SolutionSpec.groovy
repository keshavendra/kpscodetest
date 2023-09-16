package com.testds.leetcode.problems.maxDepthOfBinaryTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test maximum depth of binary tree"() {
        given:
        TreeNode root = TreeNode.createTree(nodes as Integer[])
        when:
        def maxDepth = solution.maxDepth(root)
        then:
        expectedMaxDepth == maxDepth
        where:
        nodes                         | expectedMaxDepth
        [3, 9, 20, null, null, 15, 7] | 3
        [1, null, 2]                  | 2
    }
}
