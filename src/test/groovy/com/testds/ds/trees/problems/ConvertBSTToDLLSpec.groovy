package com.testds.ds.trees.problems

import com.testds.leetcode.utils.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class ConvertBSTToDLLSpec extends Specification {

    ConvertBSTToDLL convertBSTToDLL

    def setup() {
        convertBSTToDLL = new ConvertBSTToDLL()
    }

    @Unroll
    def "Convert BST to DLL"() {
        given:
        def root = TreeNode.createTree(nodes as Integer[])
        when:
        def head = convertBSTToDLL.convertBST(root)
        then:
        def actualList = collectDllValues(head)
        actualList == expectedResult
        where:
        nodes                    | expectedResult
        null                     | []
        [1]                      | [1]
        [4, 2, 5, 1, 3]          | [1, 2, 3, 4, 5]
        [4, 2, 5, 1, 3, null, 6] | [1, 2, 3, 4, 5, 6]
    }

    static def collectDllValues(TreeNode head) {
        def list = []
        def current = head
        while (current != null) {
            list.add(current.val)
            current = current.right
        }
        return list
    }

    def cleanup() {
        convertBSTToDLL = null
    }
}

