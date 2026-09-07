package com.testds.ds.heap

import org.mockito.Spy
import spock.lang.Specification

class HeapSpec extends Specification {

    def heap

    def setup() {

    }

    def "Test Add"() {
        given:
        heap = Spy(new Heap(capacity))
        when:
        for (int num : nums) {
            heap.add(num)
        }
        then:
        times * heap.add(_)

        where:
        capacity | nums               | times
        3        | [3, 1, 2]          | 3
        5        | [32, 11, 32, 1, 2] | 5
    }
}