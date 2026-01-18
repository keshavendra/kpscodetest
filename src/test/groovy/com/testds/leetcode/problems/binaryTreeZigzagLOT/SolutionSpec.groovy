package com.testds.leetcode.problems.binaryTreeZigzagLOT

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Testing for nodes #nodes and expectedResult #expectedResult")
    def "Test ZigzagLevelOrder"() {
        when:
        def actualResult = solution.zigzagLevelOrder(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                         | expectedResult
        [3, 9, 20, null, null, 15, 7] | [[3], [20, 9], [15, 7]]
        [1]                           | [[1]]
        []                            | []
    }

    def cleanup() {
        solution = null
    }

}
