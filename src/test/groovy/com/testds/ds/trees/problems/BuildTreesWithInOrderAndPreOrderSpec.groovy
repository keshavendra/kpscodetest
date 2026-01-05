package com.testds.ds.trees.problems

import com.testds.ds.trees.traversal.InOrderTraversal
import com.testds.ds.trees.traversal.PreOrderTraversal
import spock.lang.Specification

class BuildTreesWithInOrderAndPreOrderSpec extends Specification {

    BuildTreeWithInOrderAndPreOrder buildTreeWithInOrderAndPreOrder
    PreOrderTraversal preOrderTraversal
    InOrderTraversal inOrderTraversal

    def setup() {
        buildTreeWithInOrderAndPreOrder = Spy(BuildTreeWithInOrderAndPreOrder)
        preOrderTraversal = Spy(PreOrderTraversal)
        inOrderTraversal = Spy(InOrderTraversal)
    }

    def "Test BuildTree"() {
        when:
        def actualTreeRoot = buildTreeWithInOrderAndPreOrder.buildTree(preOrder as int[], inOrder as int[])
        then:
        actualTreeRoot != null
        actualTreeRoot.getValue() == preOrder[0]
        1 * buildTreeWithInOrderAndPreOrder.buildTree(_, _)
        preOrderTraversal.preOrderTraversalWithoutRecursion(actualTreeRoot) == preOrder
        inOrderTraversal.inOrderTraversalWithoutRecursion(actualTreeRoot) == inOrder

        where:
        preOrder           | inOrder
        [1, 2, 4, 5, 3, 6] | [4, 2, 5, 1, 6, 3]
    }

    def cleanup() {
        buildTreeWithInOrderAndPreOrder = null
        preOrderTraversal = null
        inOrderTraversal = null
    }

}
