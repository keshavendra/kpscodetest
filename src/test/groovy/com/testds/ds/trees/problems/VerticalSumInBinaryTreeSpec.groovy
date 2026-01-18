package com.testds.ds.trees.problems

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification

class VerticalSumInBinaryTreeSpec extends Specification {

    VerticalSumInBinaryTree verticalSumInBinaryTree

    def setup() {
        verticalSumInBinaryTree = new VerticalSumInBinaryTree()
    }

    def "Test VerticalSum"() {
        when:
        def actualResult = verticalSumInBinaryTree.verticalSum(TreeNode.createTree(nodes as Integer[]))
        then:
        expectedResult == actualResult
        where:
        nodes                 | expectedResult
        [1, 2, 3, 4, 5, 6, 7] | [4, 2, 12, 3, 7]
    }

    def cleanup() {
        verticalSumInBinaryTree = null
    }

}
