package com.testds.leetcode.problems.tree2str

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Tree2str"() {
        def root = TreeNode.createTree(nodes as Integer[])
        when:
        def actualResult = solution.tree2str(root)
        then:
        expectedResult == actualResult
        where:
        nodes              | expectedResult
        [1, 2, 3, 4]       | "1(2(4))(3)"
        [1, 2, 3, null, 4] | "1(2()(4))(3)"
    }

}
