package com.testds.leetcode.problems.flattenBinaryTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {


    Solution solution

    def setup() {
        solution = Spy(Solution.class)
    }

    @Unroll
    def "Test Flatten"() {
        given:
        def root = TreeNode.createTree(nodes as Integer[])

        when:
        solution.flatten(root)

        then:
        1 * solution.flatten(_)
        nodeCount as int == countNodeAssertLeftToNull(root)

        where:
        nodes                    | nodeCount
        [1, 2, 5, 3, 4, null, 6] | 6
        []                       | 0
        [0]                      | 1
    }

    static countNodeAssertLeftToNull(TreeNode root) {
        int c = 0
        if (root != null) {
            while (root != null) {
                c += 1
                assert root.left == null
                root = root.right
            }
        }
        return c
    }

    def cleanup() {
        solution = null
    }

}
