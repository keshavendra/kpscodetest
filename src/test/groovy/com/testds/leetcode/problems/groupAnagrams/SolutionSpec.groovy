package com.testds.leetcode.problems.groupAnagrams

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GroupAnagrams"() {
        when:
        def actualResult = solution.groupAnagrams(strs as String[])
        then:
        expectedResult.size() == actualResult.size()
        matchNestedLists(expectedResult, actualResult)
        where:
        strs                                       | expectedResult
        ["eat", "tea", "tan", "ate", "nat", "bat"] | [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
        [""]                                       | [[""]]
        ["a"]                                      | [["a"]]
    }

    def matchNestedLists(expectedResult, actualResult) {
        if (expectedResult.containsAll(actualResult))
            return true
        actualResult.every { it ->
            def contains = false
            expectedResult.every { it1 ->
                if (it1 ==~ it) {
                    contains = true
                }
                if (!contains)
                    return false
            }
        }
        return true
    }
}
