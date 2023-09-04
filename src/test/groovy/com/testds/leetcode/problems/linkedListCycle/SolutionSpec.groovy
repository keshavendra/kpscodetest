package com.testds.leetcode.problems.linkedListCycle

import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test different lists for cycle"() {
        given:
        ListNode head = Solution.createList(arr as int[], position)
        when:
        boolean actualHasCycle = solution.hasCycle(head)
        then:
        actualHasCycle == expectedHasCycle
        where:
        arr           | position | expectedHasCycle
        [3, 2, 0, -4] | 1        | true
        [1, 2]        | 0        | true
        [1]           | -1       | false
    }
}
