package com.testds.leetcode.problems.removeSubfolders

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RemoveSubfolders"() {
        when:
        def actualResult = solution.removeSubfolders(folders as String[])
        then:
        expectedResult == actualResult
        where:
        folders                                  | expectedResult
        ["/a", "/a/b", "/c/d", "/c/d/e", "/c/f"] | ["/a", "/c/d", "/c/f"]
        ["/a", "/a/b/c", "/a/b/d"]               | ["/a"]
    }

}
