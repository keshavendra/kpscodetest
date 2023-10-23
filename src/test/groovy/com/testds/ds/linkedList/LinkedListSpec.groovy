package com.testds.ds.linkedList

import spock.lang.Specification

class LinkedListSpec extends Specification {
    LinkedList list


    def "Test Add at begin"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        list.addAtBegin(value)
        then:
        list.valueAtIndex(0) == value
        where:
        nodeValues | value
        [1, 2, 3]  | 4
        []         | 1
    }

    def "Test Add at Last"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        list.addAtLast(value)
        then:
        list.valueAtIndex(nodeValues.size()) == value
        where:
        nodeValues | value
        [1, 2, 3]  | 4
        []         | 4
    }

    def "Test size"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        def actualSize = list.size()
        then:
        expectedSize == actualSize
        where:
        nodeValues | expectedSize
        [1, 2, 3]  | 3
        []         | 0
        null       | 0
    }

    def "Test contains"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        def actualResult = list.contains(value)
        then:
        expectedResult == actualResult
        where:
        nodeValues | value | expectedResult
        [1, 2, 3]  | 3     | true
        []         | 3     | false
        [1, 2, 3]  | 5     | false
    }

    def "Test addAtIndex without exception"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        list.addAtIndex(value as int, index as int)
        then:
        noExceptionThrown()
        where:
        nodeValues | value | index
        [1, 2, 3]  | 3     | 3
        [1, 2, 3]  | 5     | 0
        [1, 2, 3]  | 5     | 2
    }

    def "Test addAtIndex with exception"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        list.addAtIndex(value as int, index as int)
        then:
        thrown(IndexOutOfBoundsException)
        where:
        nodeValues | value | index
        []         | 3     | 4
        [1, 2, 3]  | 5     | 4
        [1, 2, 3]  | 5     | -1
    }

    def "Test valueAt"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        def actualResult = list.valueAtIndex(index)
        then:
        expectedResult == actualResult
        where:
        nodeValues | index | expectedResult
        [1, 2, 3]  | 0     | 1
        []         | 0     | -1
        [1, 2, 3]  | 5     | -1
    }

    def "Test deleteAtIndex without exception"() {
        given:
        list = LinkedList.createList(nodeValues as int[])
        when:
        def actualResult = list.deleteAtIndex(index as int)
        then:
        noExceptionThrown()
        expectedResult == actualResult
        where:
        nodeValues | index | expectedResult
        [1, 2, 3]  | 2     | 3
        [1, 2, 3]  | 1     | 2
        [1, 2, 3]  | -1    | -1
        [1, 2, 3]  | 0     | 1
        [1, 2, 3]  | 5     | -1
        []         | 1     | -1
        [1, 2, 3]  | 3     | -1
    }
}
