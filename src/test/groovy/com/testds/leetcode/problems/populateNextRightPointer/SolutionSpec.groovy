package com.testds.leetcode.problems.populateNextRightPointer

import com.testds.leetcode.utils.binaryTree.Node
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test Connect"() {
        when:
        def actualResult = solution.connect(Node.createTree(nodes as Integer[]))
        then:
        expectedResult == performLevelOrderWithNextNode(actualResult)
        where:
        nodes                 | expectedResult
        [1, 2, 3, 4, 5, 6, 7] | [1, null, 2, 3, null, 4, 5, 6, 7, null]
        []                    | []
    }

    List<Integer> performLevelOrderWithNextNode(Node node) {
        List<Integer> result = new ArrayList<>()
        if (node != null) {
            while (node != null) {
                List<Integer> list = new ArrayList<>()
                Node temp = node
                node = node.left
                while (temp != null) {
                    list.add(temp.val)
                    temp = temp.next
                    if (node == null && temp != null) {
                        if (temp.left != null) {
                            node = temp.left
                        } else {
                            node = temp.right
                        }
                    }
                }
                list.add(null)
                result.addAll(list)
            }
        }
        return result
    }

}
