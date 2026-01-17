package com.testds.ds.trees.problems

import com.testds.ds.trees.traversal.InOrderTraversal
import com.testds.ds.trees.traversal.LevelOrderTraversal
import spock.lang.Specification
import spock.lang.Unroll

class BuildTreeWithInOrderAndLevelOrderSpec extends Specification {

    BuildTreeWithInOrderAndLevelOrder object

    def setup() {
        object = new BuildTreeWithInOrderAndLevelOrder()
    }

    @Unroll
    def "Test BuildTree"() {
        given:
        def inOrderTraversal = new InOrderTraversal()
        def levelOrderTraversal = new LevelOrderTraversal()
        when:
        def root = object.buildTree(inOrder as int[], levelOrder as int[])
        then:
        root != null
        inOrderTraversal.inOrderTraversalWithoutRecursion(root) == inOrder
        levelOrderTraversal.levelOrder(root) == levelOrder
        where:
        inOrder               | levelOrder
        [4, 2, 5, 1, 6, 3, 7] | [1, 2, 3, 4, 5, 6, 7]
        [4, 2, 1, 6, 3, 7]    | [1, 2, 3, 4, 6, 7]
    }

    def cleanup() {
        object = null
    }

}
