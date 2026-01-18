package com.testds.ds.trees.problems

import com.testds.ds.trees.traversal.PreOrderTraversal
import spock.lang.Specification
import spock.lang.Unroll

class BuildTreeFromPreOrderTraversalStringSpec extends Specification {

    BuildTreeFromPreOrderTraversalString buildTreeFromPreOrderTraversalString

    def setup() {
        buildTreeFromPreOrderTraversalString = new BuildTreeFromPreOrderTraversalString()
    }

    @Unroll
    def "Test BuildTree"() {
        given:
        def preOrderTraversal = new PreOrderTraversal()
        when:
        def actualResult = buildTreeFromPreOrderTraversalString.buildTree(preorder)
        then:
        preorder == convertToString(preOrderTraversal.preOrderTraversalWithoutRecursion(actualResult))
        where:
        preorder    | _
        "ILILL"     | _
        "IILLL"     | _
        "IILILLILL" | _
    }

    static String convertToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder()
        for (Integer i : list) {
            sb.append(i == 73 ? 'I' : 'L')
        }
        return sb.toString()
    }

}
