package com.testds.leetcode.problems.balanceBST

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test BalanceBST"() {
        when:
        def actualResult = solution.balanceBST(TreeNode.createTree(nodes as Integer[]))
        then:
        levelOrderTraversal(actualResult) == expectedResult
        where:
        nodes                             | expectedResult
        [2, 1, 3, null, null, null, 4]    | [2, 1, 3, 4]
        [2, 1, 3]                         | [2, 1, 3]
        [4, 2, 6, 1, 3, 5, 7]             | [4, 2, 6, 1, 3, 5, 7]
        [3, 2, null, 1]                   | [2, 1, 3]
        [1, null, 2, null, null, null, 3] | [2, 1, 3]
    }

    def static levelOrderTraversal(TreeNode root) {
        def list = []
        Queue<TreeNode> q = new LinkedList<>()
        q.offer(root)
        while (!q.isEmpty()) {
            root = q.poll()
            list.add(root.val)
            if (root.left != null)
                q.offer(root.left)
            if (root.right != null)
                q.offer(root.right)
        }
        return list
    }

    def cleanup() {
        solution = null
    }
}
