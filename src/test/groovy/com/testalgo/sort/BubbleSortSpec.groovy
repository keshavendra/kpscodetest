package com.testalgo.sort

import spock.lang.Specification

class BubbleSortSpec extends Specification {

    BubbleSort object

    def setup() {
        object = new BubbleSort()
    }

    def "Test BubbleSort"() {
        when:
        def result = object.bubbleSort(array as int[])
        then:
        expectedResult as int[] == result
        where:
        array     | expectedResult
        [3, 2, 1] | [1, 2, 3]
    }

}
