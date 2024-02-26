package com.testds.leetcode.problems.isSameTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsSameTree"() {
        when:
        def actualResult = solution.isSameTree(TreeNode.createTree(p as Integer[]), TreeNode.createTree(q as Integer[]))
        then:
        expectedResult == actualResult
        where:
        p         | q            | expectedResult
        [1, 2, 3] | [1, 2, 3]    | true
        [1, 2]    | [1, null, 2] | false
        [1, 2, 1] | [1, 1, 2]    | false
    }

}
