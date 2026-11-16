package com.testalgo.sort

import spock.lang.Specification

class SelectionSortSpec extends Specification {

    SelectionSort selectionSort

    def setup() {
        selectionSort = new SelectionSort()
    }

    def "Test SelectionSort"() {
        when:
        def actualResult = selectionSort.selectionSort(inputArray as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        inputArray | expectedResult
        [3, 2, 1]  | [1, 2, 3]
    }

}
