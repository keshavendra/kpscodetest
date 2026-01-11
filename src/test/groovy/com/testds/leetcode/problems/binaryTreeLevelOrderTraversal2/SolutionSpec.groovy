package com.testds.leetcode.problems.binaryTreeLevelOrderTraversal2

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test LevelOrderBottom"() {
        when:
        def actualResult = solution.levelOrderBottom(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                         | expectedResult
        [3, 9, 20, null, null, 15, 7] | [[15, 7], [9, 20], [3]]
        [1]                           | [[1]]
        []                            | []
    }

    def cleanup() {
        solution = null
    }

}
