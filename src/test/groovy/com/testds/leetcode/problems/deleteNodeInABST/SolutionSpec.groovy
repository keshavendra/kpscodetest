package com.testds.leetcode.problems.deleteNodeInABST

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test DeleteNode"() {
        given:
        TreeNode root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.deleteNode(root, key as int)
        then:
        TreeNode.treesAreEqual(TreeNode.createTree(expectedResult as Integer[]), actualResult)
        where:
        nodes                    | key | expectedResult
        [5, 3, 6, 2, 4, null, 7] | 3   | [5, 2, 6, null, 4, null, 7]
        [5, 3, 6, 2, 4, null, 7] | 0   | [5, 3, 6, 2, 4, null, 7]
    }

    def cleanup() {
        solution = null
    }

}
