package com.testds.leetcode.problems.medianFinderFromDataStream

import spock.lang.Specification

class MedianFinderSpec extends Specification {

    def "MedianFinder should return expected outputs for sample operations"() {
        when:
        def results = []
        MedianFinder medianFinder = null

        operations.eachWithIndex { String operation, int index ->
            switch (operation) {
                case "MedianFinder":
                    medianFinder = new MedianFinder()
                    results << null
                    break
                case "addNum":
                    medianFinder.addNum(operands[index][0] as int)
                    results << null
                    break
                case "findMedian":
                    results << medianFinder.findMedian()
                    break
                default:
                    throw new IllegalArgumentException("Unsupported operation: $operation")
            }
        }

        then:
        results == expected

        where:
        operations                                                                 | operands                    | expected
        ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"] | [[], [1], [2], [], [3], []] | [null, null, null, 1.5d, null, 2.0d]
    }
}
