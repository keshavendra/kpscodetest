package com.testds.leetcode.problems.validateBinarySearchTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsValidBST"() {
        when:
        def actualResult = solution.isValidBST(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                       | expectedResult
        [2, 1, 3]                   | true
        [5, 1, 4, null, null, 3, 6] | false
    }

    def cleanup() {
        solution = null
    }

}
