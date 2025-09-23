package com.testds.leetcode.problems.compareVersionNumbers

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }


    @Unroll
    def "compareVersion(#version1, #version2) should return #expected"() {
        expect:
        solution.compareVersion(version1, version2) == expected

        where:
        version1  | version2 | expected
        "1.0"     | "1.0"    | 0
        "1.1"     | "1.0"    | 1
        "1.0"     | "1.1"    | -1
        "1.0.1"   | "1"      | 1
        "1"       | "1.0.1"  | -1
        "1.01"    | "1.001"  | 0
        "1.0"     | "1.0.0"  | 0
        "0.0.0"   | "0.0.0"  | 0
        "0.1"     | "1.1"    | -1
        "7.5.2.4" | "7.5.3"  | -1
        "1.2"     | "1.2.0"  | 0
        "1.2.1"   | "1.2.0"  | 1
    }

    def cleanup() {
        solution = null
    }
}
