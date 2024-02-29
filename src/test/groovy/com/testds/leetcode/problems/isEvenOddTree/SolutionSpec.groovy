package com.testds.leetcode.problems.isEvenOddTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsEvenOddTree"() {
        when:
        def actualResult = solution.isEvenOddTree(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                                                          | expectedResult
        [1, 10, 4, 3, null, 7, 9, 12, 8, null, null, 6, null, null, 2] | true
        [5, 4, 2, 3, 3, 7]                                             | false
        [5, 9, 1, 3, 5, 7]                                             | false
    }

}
