package com.testds.leetcode.problems.maxAncestorDiff

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxAncestorDiff"() {
        when:
        def actualResult = solution.maxAncestorDiff(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                                                                          | expectedResult
        [1, null, 2, null, null, null, 0, null, null, null, null, null, null, 3, null] | 3
        [8, 3, 10, 1, 6, null, 14, null, null, 4, 7, null, null, 13, null]             | 7
    }

}
