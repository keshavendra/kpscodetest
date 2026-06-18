package com.testds.leetcode.problems.processStringWithSpcOper1

import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ProcessStr"() {
        when:
        def actualResult = solution.processStr(s)
        then:
        expectedResult == actualResult
        where:
        s       | expectedResult
        "a#b%*" | "ba"
        "z*#"   | ""
        "*%"    | ""
    }

}
