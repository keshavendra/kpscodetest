package com.testds.leetcode.problems.flipEquivTree

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FlipEquiv"() {
        given:
        def root1 = TreeNode.createTree(nodes1 as Integer[])
        def root2 = TreeNode.createTree(nodes2 as Integer[])
        when:
        def actualResult = solution.flipEquiv(root1, root2)
        then:
        expectedResult == actualResult
        where:
        nodes1                                     | nodes2                                                             | expectedResult
        [1, 2, 3, 4, 5, 6, null, null, null, 7, 8] | [1, 3, 2, null, 6, 4, 5, null, null, null, null, null, null, 8, 7] | true
        []                                         | []                                                                 | true
        []                                         | [1]                                                                | false
        [0, null, 1]                               | [0, 1]                                                             | true
        [0, null, 1]                               | [0, null, 1]                                                       | true
    }

}
