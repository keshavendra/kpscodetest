package com.testds.leetcode.problems.findDifferentBinaryString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindDifferentBinaryString"() {
        when:
        def actualResult = solution.findDifferentBinaryString(nums as String[])
        then:
        !Arrays.asList(nums).contains(actualResult)
        actualResult.length() == nums[0].length()
        where:
        nums         | _
        ["01", "10"] | _
        ["00", "01"] | _
    }

}
