package com.testds.leetcode.problems.kthSmallestInBst

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test KthSmallest"() {
        when:
        def actualResult = solution.kthSmallest(TreeNode.createTree(nodes as Integer[]), k as int)
        then:
        expectedResult == actualResult
        where:
        nodes                          | k | expectedResult
        [3, 1, 4, null, 2]             | 1 | 1
        [5, 3, 6, 2, 4, null, null, 1] | 3 | 3
    }

    def cleanup() {
        solution = null
    }

}
