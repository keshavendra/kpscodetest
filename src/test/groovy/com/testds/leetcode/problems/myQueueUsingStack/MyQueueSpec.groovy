package com.testds.leetcode.problems.myQueueUsingStack

import spock.lang.Specification

class MyQueueSpec extends Specification {

    def "Test MyQueue"() {
        when:
        def resultList = []
        MyQueue myQueue = null
        for (int i = 0; i < operations.size(); i++) {
            def result = null
            switch (operations.get(i)) {
                case "MyQueue":
                    myQueue = new MyQueue()
                    break
                case "push":
                    def x = input.get(i).get(0)
                    myQueue.push(x)
                    break
                case "pop":
                    result = myQueue.pop()
                    break
                case "peek":
                    result = myQueue.peek()
                    break
                case "empty":
                    result = myQueue.empty()
            }
            resultList.add(result)
        }
        then:
        expectedResult == resultList
        where:
        operations                                          | input                      | expectedResult
        ["MyQueue", "push", "push", "peek", "pop", "empty"] | [[], [1], [2], [], [], []] | [null, null, null, 1, 1, false]
    }

}
