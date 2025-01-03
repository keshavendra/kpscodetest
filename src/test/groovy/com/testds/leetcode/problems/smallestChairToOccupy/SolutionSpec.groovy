package com.testds.leetcode.problems.smallestChairToOccupy

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SmallestChairToOccupy"() {
        when:
        def actualResult = solution.smallestChair(times as int[][], targetFriend)
        then:
        expectedResult == actualResult
        where:
        times                                                                                                                                                                                                                                                            | targetFriend | expectedResult
        [[1, 4], [2, 3], [4, 6]]                                                                                                                                                                                                                                         | 1            | 1
        [[3, 10], [1, 5], [2, 6]]                                                                                                                                                                                                                                        | 0            | 2
        [[33889, 98676], [80071, 89737], [44118, 52565], [52992, 84310], [78492, 88209], [21695, 67063], [84622, 95452], [98048, 98856], [98411, 99433], [55333, 56548], [65375, 88566], [55011, 62821], [48548, 48656], [87396, 94825], [55273, 81868], [75629, 91467]] | 6            | 2
    }

}
