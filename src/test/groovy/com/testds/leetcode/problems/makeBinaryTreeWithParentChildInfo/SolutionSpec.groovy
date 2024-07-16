package com.testds.leetcode.problems.makeBinaryTreeWithParentChildInfo

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MakeBinaryTreeWithParentChildInfo"() {
        when:
        def actualResult = solution.createBinaryTree(descriptions as int[][])
        then:
        TreeNode.treesAreEqual(TreeNode.createTree(expectedResult as Integer[]), actualResult)
        where:
        descriptions                                                      | expectedResult
        [[20, 15, 1], [20, 17, 0], [50, 20, 1], [50, 80, 0], [80, 19, 1]] | [50, 20, 80, 15, 17, 19]
        [[1, 2, 1], [2, 3, 0], [3, 4, 1]]                                 | [1, 2, null, null, 3, null, null, null, null, 4]
    }

}
