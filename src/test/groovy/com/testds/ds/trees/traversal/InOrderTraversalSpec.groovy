package com.testds.ds.trees.traversal

import com.testds.ds.trees.TreeNode
import com.testds.ds.trees.TreeUtils
import spock.lang.Specification

class InOrderTraversalSpec extends Specification {

    def "Test InOrderTraversalWithRecursion"() {
        given:
        def spyInOrderTraversalObject = Spy(InOrderTraversal.class)
        TreeNode root = TreeUtils.createTreeFromArray(treeArray as Integer[])

        when:
        def actualResult = spyInOrderTraversalObject.inOrderTraversalWithRecursion(root)

        then:
        expectedResult.size() * spyInOrderTraversalObject.inOrderTraversalWithRecursion(_)
        actualResult != null
        expectedResult == actualResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [4, 2, 5, 1, 3]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [4, 2, 5, 6, 1, 3]
    }

    def "Test InOrderTraversalWithoutRecursion"() {
        given:
        def spyInOrderTraversalObject = Spy(InOrderTraversal.class)
        TreeNode root = TreeUtils.createTreeFromArray(treeArray as Integer[])

        when:
        def actualResult = spyInOrderTraversalObject.inOrderTraversalWithoutRecursion(root)

        then:
        1 * spyInOrderTraversalObject.inOrderTraversalWithoutRecursion(_)
        actualResult != null
        actualResult == expectedResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [4, 2, 5, 1, 3]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [4, 2, 5, 6, 1, 3]
    }

}
