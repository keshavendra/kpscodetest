package com.testds.leetcode.problems.amountOfTime

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test AmountOfTime"() {
        when:
        def actualResult = solution.amountOfTime(TreeNode.createTree(nodes as Integer[]), start)
        then:
        expectedResult == actualResult
        where:
        nodes                                       | start | expectedResult
        [1, 5, 3, null, 4, 10, 6, null, null, 9, 2] | 3     | 4
        [1]                                         | 1     | 0
    }

}
