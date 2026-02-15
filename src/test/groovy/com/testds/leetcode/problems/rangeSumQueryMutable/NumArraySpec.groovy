package com.testds.leetcode.problems.rangeSumQueryMutable

import spock.lang.Specification
import spock.lang.Unroll

class NumArraySpec extends Specification {

    @Unroll
    def "Test NumArray Logics"() {
        given:
        def numArrayObject
        when:
        def res = []
        inputOperation.eachWithIndex { def entry, int i ->
            switch (entry) {
                case "NumArray":
                    numArrayObject = new NumArray(inputValue[i][0] as int[])
                    res[i] = null
                    break;
                case "sumRange":
                    assert numArrayObject != null
                    res[i] = numArrayObject.sumRange(inputValue[i][0], inputValue[i][1])
                    break;
                case "update":
                    assert numArrayObject != null
                    numArrayObject.update(inputValue[i][0], inputValue[i][1])
                    res[i] = null
            }
        }
        then:
        res == expectedResult
        where:
        inputOperation                                                       | inputValue                                           | expectedResult
        ["NumArray", "sumRange", "update", "sumRange"]                       | [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]                | [null, 9, null, 8]
        ["NumArray", "update", "sumRange", "sumRange", "update", "sumRange"] | [[[9, -8]], [0, 3], [1, 1], [0, 1], [1, -3], [0, 1]] | [null, null, -8, -5, null, 0]
    }

}
