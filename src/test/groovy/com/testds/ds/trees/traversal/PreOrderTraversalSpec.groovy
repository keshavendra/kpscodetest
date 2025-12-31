package com.testds.ds.trees.traversal

import com.testds.ds.trees.TreeNode
import com.testds.ds.trees.TreeUtils
import spock.lang.Specification

class PreOrderTraversalSpec extends Specification {

    def "Test PreOrderTraversalWithRecursion"() {
        given:
        TreeNode root = TreeUtils.createTreeFromArray(treeArray as Integer[])
        def spyPreOrderTraversalObject = Spy(PreOrderTraversal.class)

        when:
        def actualResult = spyPreOrderTraversalObject.preOrderTraversalWithRecursion(root)

        then:
        expectedResult.size() * spyPreOrderTraversalObject.preOrderTraversalWithRecursion(_)
        actualResult != null
        actualResult == expectedResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [1, 2, 4, 5, 3]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [1, 2, 4, 5, 6, 3]
    }

    def "Test PreOrderTraversalWithoutRecursion"() {
        given:
        TreeNode root = TreeUtils.createTreeFromArray(treeArray as Integer[])
        def spyPreOrderTraversalObject = Spy(PreOrderTraversal.class)

        when:
        def actualResult = spyPreOrderTraversalObject.preOrderTraversalWithoutRecursion(root)

        then:
        1 * spyPreOrderTraversalObject.preOrderTraversalWithoutRecursion(_)
        actualResult != null
        expectedResult == actualResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [1, 2, 4, 5, 3]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [1, 2, 4, 5, 6, 3]
    }
}
