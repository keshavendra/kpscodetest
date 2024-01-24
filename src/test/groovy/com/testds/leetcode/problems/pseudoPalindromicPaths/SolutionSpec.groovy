package com.testds.leetcode.problems.pseudoPalindromicPaths

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test PseudoPalindromicPaths"() {
        when:
        def actualResult = solution.pseudoPalindromicPaths(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                                            | expectedResult
        [2, 3, 1, 3, 1, null, 1]                         | 2
        [2, 1, 1, 1, 3, null, null, null, null, null, 1] | 1
    }

}
