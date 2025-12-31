package com.testds.ds.trees.traversal

import com.testds.ds.trees.TreeNode
import com.testds.ds.trees.TreeUtils
import spock.lang.Specification

class PostOrderTraversalSpec extends Specification {

    def "Test PostOrderTraversalWithRecursion"() {
        given:
        TreeNode root = TreeUtils.createTreeFromArray(treeArray as Integer[])
        def spyPostOrderTraversalObject = Spy(PostOrderTraversal.class)

        when:
        def actualResult = spyPostOrderTraversalObject.postOrderTraversalWithRecursion(root)

        then:
        (2 * expectedResult.size() + 1) * spyPostOrderTraversalObject.postOrderTraversalWithRecursion(_)
        actualResult != null
        expectedResult == actualResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [4, 5, 2, 3, 1]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [4, 6, 5, 2, 3, 1]
    }

    def "Test PostOrderTraversalWithoutRecursion"() {
        given:
        TreeNode root = TreeUtils.createTreeFromArray(treeArray as Integer[])
        def spyPostOrderTraversalObject = Spy(PostOrderTraversal.class)

        when:
        def actualResult = spyPostOrderTraversalObject.postOrderTraversalWithoutRecursion(root)

        then:
        1 * spyPostOrderTraversalObject.postOrderTraversalWithoutRecursion(_)
        actualResult != null
        expectedResult == actualResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [4, 5, 2, 3, 1]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [4, 6, 5, 2, 3, 1]
    }
}
