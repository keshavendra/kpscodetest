package com.testds.leetcode.problems.numberOf1Bits

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumberOf1Bits"() {
        when:
        int num
        if ('1' == n.charAt(0)) {
            //negative number
            StringBuilder sb = new StringBuilder()
            for (int i = 0; i < 32; i++) {
                sb.append(n.charAt(i) == '1' ? '0' : '1')
            }
            num = Integer.parseInt(sb.toString(), 2) + 1
            num *= -1
        } else {
            num = Integer.parseInt(n, 2)
        }
        def actualResult = solution.hammingWeight(num)
        then:
        expectedResult == actualResult
        where:
        n                                  | expectedResult
        "00000000000000000000000000001011" | 3
        "00000000000000000000000010000000" | 1
        "11111111111111111111111111111101" | 31
    }

}
