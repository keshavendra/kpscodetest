package com.testds.leetcode.problems.findBottomLeftValue

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindBottomLeftValue"() {
        when:
        def actualResult = solution.findBottomLeftValue(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                                                     | expectedResult
        [2, 1, 3]                                                 | 1
        [1, 2, 3, 4, null, 5, 6, null, null, null, null, 7, null] | 7
    }

}
