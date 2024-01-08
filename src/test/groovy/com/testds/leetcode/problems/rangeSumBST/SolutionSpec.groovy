package com.testds.leetcode.problems.rangeSumBST

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RangeSumBST"() {
        when:
        def actualResult = solution.rangeSumBST(TreeNode.createTree(nodes as Integer[]), low, high)
        then:
        expectedResult == actualResult
        where:
        nodes                                 | low | high | expectedResult
        [10, 5, 15, 3, 7, null, 18]           | 7   | 15   | 32
        [10, 5, 15, 3, 7, 13, 18, 1, null, 6] | 6   | 10   | 23
    }

}
