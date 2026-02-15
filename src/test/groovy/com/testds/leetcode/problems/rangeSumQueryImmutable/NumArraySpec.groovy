package com.testds.leetcode.problems.rangeSumQueryImmutable

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
                    break
                case "sumRange":
                    assert numArrayObject != null
                    res[i] = numArrayObject.sumRange(inputValue[i][0], inputValue[i][1])
                    break
            }
        }
        then:
        res == expectedResult
        where:
        inputOperation                                   | inputValue                                        | expectedResult
        ["NumArray", "sumRange", "sumRange", "sumRange"] | [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]] | [null, 1, -1, -3]
    }

}
