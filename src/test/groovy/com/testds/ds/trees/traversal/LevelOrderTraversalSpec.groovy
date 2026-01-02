package com.testds.ds.trees.traversal

import com.testds.ds.trees.TreeUtils
import spock.lang.Specification

class LevelOrderTraversalSpec extends Specification {

    LevelOrderTraversal levelOrderTraversalObject

    def setup() {
        levelOrderTraversalObject = new LevelOrderTraversal()
    }

    def "Test LevelOrder"() {
        when:
        def actualResult = levelOrderTraversalObject.levelOrder(TreeUtils.createTreeFromArray(treeArray as Integer[]))

        then:
        expectedResult == actualResult

        where:
        treeArray                                        | expectedResult
        [1, 2, 3, 4, 5]                                  | [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5, null, null, null, null, null, 6] | [1, 2, 3, 4, 5, 6]
    }

    def cleanup() {
        levelOrderTraversalObject = null
    }

}
