package com.testds.leetcode.problems.designMyHashMap

import spock.lang.Specification

class MyHashMapSpec extends Specification {
    def "Test Design MyHashMap"() {
        when:
        def actualResult = Solution.runTest(operationsList, valuesList)
        then:
        expectedResult == actualResult
        where:
        operationsList                                                           | valuesList                                            | expectedResult
        ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"] | [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]] | [null, null, null, 1, -1, null, 1, null, -1]
    }
}
