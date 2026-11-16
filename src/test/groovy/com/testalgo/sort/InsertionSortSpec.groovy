package com.testalgo.sort

import spock.lang.Specification

class InsertionSortSpec extends Specification {

    InsertionSort insertionSort

    def setup() {
        insertionSort = new InsertionSort()
    }

    def "Test InsertionSort"() {
        when:
        def actualResult = insertionSort.insertionSort(inputArray as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        inputArray | expectedResult
        [3, 2, 1]  | [1, 2, 3]
    }

}
