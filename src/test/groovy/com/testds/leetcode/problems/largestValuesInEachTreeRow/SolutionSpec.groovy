package com.testds.leetcode.problems.largestValuesInEachTreeRow

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test largestValues"() {
        given:
        def root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.largestValues(root)
        then:
        expectedResult == actualResult
        where:
        nodes                    | expectedResult
        [1, 3, 2, 5, 3, null, 9] | [1, 3, 9]
        [1, 2, 3]                | [1, 3]
    }
}
