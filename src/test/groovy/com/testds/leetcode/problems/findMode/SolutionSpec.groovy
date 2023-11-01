package com.testds.leetcode.problems.findMode

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindMode"() {
        given:
        def root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.findMode(root)
        then:
        expectedResult.containsAll(actualResult)
        where:
        nodes                       | expectedResult
        [1, null, 2, null, null, 2] | [2]
        [0]                         | [0]
    }

}
