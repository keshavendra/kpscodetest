package com.testds.ds.heap


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
        5        | [11, 32, 1, 32, 2] | 5
    }

    def "Test Remove"() {
        given:
        heap = Spy(new Heap(capacity))
        for (int i : nums) {
            heap.add(i)
        }
        when:
        def actualResult1 = heap.remove()
        def actualResult2 = heap.remove()
        then:
        actualResult1 == expectedResult1
        actualResult2 == expectedResult2
        where:
        capacity | nums               | expectedResult1 | expectedResult2
        3        | [3, 1, 2]          | 3               | 2
        5        | [32, 11, 32, 1, 2] | 32              | 32
    }

    def "Test add, remove and isEmpty"() {
        given:
        heap = Spy(new Heap(capacity))
        when:
        for (int i = 0; i < nums.size(); i++) {
            heap.add(nums.get(i))
            assert heap.size() == i + 1
        }

        for (int i = 0; i < nums.size(); i++) {
            assert heap.remove()
        }

        assert heap.remove() < 0
        then:
        heap.size() == 0
        nums.size() * heap.add(_)
        (nums.size() + 1) * heap.remove()

        where:
        capacity | nums
        3        | [3, 1, 2]
        5        | [32, 11, 32, 1, 2]
    }
}