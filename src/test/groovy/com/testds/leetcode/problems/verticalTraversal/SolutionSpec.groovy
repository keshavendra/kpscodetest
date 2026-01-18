package com.testds.leetcode.problems.verticalTraversal

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification{

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test VerticalTraversal"() {
        when:
        def actualResult = solution.verticalTraversal(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                 | expectedResult
        [1, 2, 3, 4, 6, 5, 7] | [[4], [2], [1, 5, 6], [3], [7]]
        [3, 1, 4, 0, 2, 2]    | [[0], [1], [3, 2, 2], [4]]
    }

    def cleanup() {
        solution = null
    }

}
