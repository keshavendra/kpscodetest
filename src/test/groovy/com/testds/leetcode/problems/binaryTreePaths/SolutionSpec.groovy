package com.testds.leetcode.problems.binaryTreePaths

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test BinaryTreePaths"() {
        when:
        def actualResult = solution.binaryTreePaths(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes              | expectedResult
        [1, 2, 3, null, 5] | ["1->2->5", "1->3"]
        [1]                | ["1"]
    }

    def cleanup() {
        solution = null
    }

}
