package com.testds.leetcode.problems.leafSimilar

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LeafSimilar"() {
        when:
        def actualResult = solution.leafSimilar(TreeNode.createTree(nodes1 as Integer[]), TreeNode.createTree(nodes2 as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes1                                  | nodes2                                                          | expectedResult
        [3, 5, 1, 6, 2, 9, 8, null, null, 7, 4] | [3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8] | true
        [1, 2, 3]                               | [1, 3, 2]                                                       | false
    }

}
