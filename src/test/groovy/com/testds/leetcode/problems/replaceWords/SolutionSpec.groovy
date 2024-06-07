package com.testds.leetcode.problems.replaceWords

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReplaceWords"() {
        when:
        def actualResult = solution.replaceWords(dictionary, sentence)
        then:
        expectedResult == actualResult
        where:
        dictionary            | sentence                                | expectedResult
        ["cat", "bat", "rat"] | "the cattle was rattled by the battery" | "the cat was rat by the bat"
        ["a", "b", "c"]       | "aadsfasf absbs bbab cadsfafs"          | "a a b c"
    }

}
