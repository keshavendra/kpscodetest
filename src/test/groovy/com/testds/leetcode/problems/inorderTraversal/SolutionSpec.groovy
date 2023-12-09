package com.testds.leetcode.problems.inorderTraversal

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test InorderTraversal"() {
        def root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.inorderTraversal(root)
        then:
        expectedResult == actualResult
        where:
        nodes                       | expectedResult
        [1, null, 2, null, null, 3] | [1, 3, 2]
        []              | []
        [1]             | [1]
    }

}
