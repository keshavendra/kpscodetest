package com.testds.leetcode.problems.kthLargestLevelSumInTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test KthLargestLevelSumInTree"() {
        given:
        TreeNode root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.kthLargestLevelSum(root, k)
        then:
        expectedResult as long == actualResult
        where:
        nodes                       | k | expectedResult
        [5, 8, 9, 2, 1, 3, 7, 4, 6] | 2 | 13
        [1, 2, null, 3]             | 1 | 3
    }

}
