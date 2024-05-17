package com.testds.leetcode.problems.deleteLeavesWithAGivenValue

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DeleteLeavesWithAGivenValue"() {
        def root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.removeLeafNodes(root, target)
        then:
        TreeNode.treesAreEqual(actualResult, TreeNode.createTree(expectedResult as Integer[]))
        where:
        nodes                                | target | expectedResult
        [1, 2, 3, 2, null, 2, 4]             | 2      | [1, null, 3, null, null, null, 4]
        [1, 3, 3, 3, 2]                      | 3      | [1, 3, null, null, 2]
        [1, 2, null, 2, null, null, null, 2] | 2      | [1]
    }

}
