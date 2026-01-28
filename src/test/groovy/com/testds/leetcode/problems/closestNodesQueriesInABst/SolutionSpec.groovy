package com.testds.leetcode.problems.closestNodesQueriesInABst

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test ClosestNodes"() {
        when:
        def actualResult = solution.closestNodes(TreeNode.createTree(nodes as Integer[]), queries)
        then:
        expectedResult == actualResult
        where:
        nodes                                                           | queries    | expectedResult
        [6, 2, 13, 1, 4, 9, 15, null, null, null, null, null, null, 14] | [2, 5, 16] | [[2, 2], [4, 6], [15, -1]]
        [4, null, 9]                                                    | [3]        | [[-1, 4]]
    }

    def cleanup() {
        solution = null
    }

}
