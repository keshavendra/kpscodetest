package com.testds.leetcode.problems.sumOfRootToLeafBinaryNums

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test SumRootToLeaf"() {
        when:
        def actualResult = solution.sumRootToLeaf(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                 | expectedResult
        [1, 0, 1, 0, 1, 0, 1] | 22
        [0]                   | 0
    }

    def cleanup() {
        solution = null
    }

}
