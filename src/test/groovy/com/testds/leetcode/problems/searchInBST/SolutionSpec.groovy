package com.testds.leetcode.problems.searchInBST

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test SearchBST"() {
        when:
        def actualResult = solution.searchBST(TreeNode.createTree(nodes as Integer[]), value as int)
        then:
        if (expectedResult == null || expectedResult.isEmpty())
            actualResult == null
        else {
            actualResult != null
            TreeNode.treesAreEqual(TreeNode.createTree(expectedResult as Integer[]), actualResult)
        }
        where:
        nodes           | value | expectedResult
        [4, 2, 7, 1, 3] | 2     | [2, 1, 3]
        [4, 2, 7, 1, 3] | 5     | []
    }

    def cleanup() {
        solution = null
    }

}
