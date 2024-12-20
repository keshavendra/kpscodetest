package com.testds.leetcode.problems.reverseOddLevels

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReverseOddLevels"() {
        when:
        def actualResult = solution.reverseOddLevels(TreeNode.createTree(nodes as Integer[]))
        then:
        TreeNode.treesAreEqual(actualResult, TreeNode.createTree(expectedTree as Integer[]))
        where:
        nodes                                         | expectedTree
        [2, 3, 5, 8, 13, 21, 34]                      | [2, 5, 3, 8, 13, 21, 34]
        [7, 13, 11]                                   | [7, 11, 13]
        [0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2] | [0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1]
    }

    def cleanup() {
        solution = null
    }

}
