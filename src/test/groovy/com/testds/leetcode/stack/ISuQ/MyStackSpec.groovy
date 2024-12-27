package com.testds.leetcode.stack.ISuQ

import spock.lang.Specification

class MyStackSpec extends Specification {
    MyStack<Integer> stack
    Integer[] listOfElements

    def setup() {
        stack = Spy(MyStack)
    }

    def "Test push operation"() {
        given:
        listOfElements = new Integer[3]
        listOfElements[0] = 1
        listOfElements[1] = 2
        listOfElements[2] = 3

        when:
        for(int i=0; i<listOfElements.length;i++)
            stack.push(listOfElements[i])

        then:
        listOfElements.length * stack.push(_)

    }

    def "Test pop operation"() {
        given:
        listOfElements = new Integer[3]
        listOfElements[0] = 1
        listOfElements[1] = 2
        listOfElements[2] = 3
        Integer popValue

        when:
        for(int i=0; i<listOfElements.length;i++)
            stack.push(listOfElements[i])
        popValue = stack.pop()

        then:
        popValue == listOfElements[listOfElements.length-1]
        1 * stack.pop()
        listOfElements.length * stack.push(_)
    }

    def "Test top operation"() {
        given:
        listOfElements = new Integer[3]
        listOfElements[0] = 1
        listOfElements[1] = 2
        listOfElements[2] = 3
        Integer topValue

        when:
        for(int i=0; i<listOfElements.length;i++)
            stack.push(listOfElements[i])
        topValue = stack.top()

        then:
        topValue == listOfElements[listOfElements.length-1]
        0 * stack.pop()
        1 * stack.top()
        listOfElements.length * stack.push(_)
    }

    def "Test empty operation"() {
        given:
        listOfElements = new Integer[3]
        listOfElements[0] = 1
        listOfElements[1] = 2
        listOfElements[2] = 3
        boolean isEmpty

        when:
        for(int i=0; i<listOfElements.length;i++)
            stack.push(listOfElements[i])
        isEmpty = stack.empty()

        then:
        !isEmpty
        0 * stack.pop()
        0 * stack.top()
        1 * stack.empty()
        listOfElements.length * stack.push(_)
    }
}
