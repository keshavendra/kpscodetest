package com.testds.leetcode.problems.waysToDivideLongCorridor

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test WaysToDivideLongCorridor"() {
        when:
        def actualResult = solution.numberOfWays(corridor)
        then:
        expectedResult == actualResult
        where:
        corridor                                                                                                                                           | expectedResult
        "SSPPSPS"                                                                                                                                          | 3
        "PPSPSP"                                                                                                                                           | 1
        "S"                                                                                                                                                | 0
        "SPPSSSSPPS"                                                                                                                                       | 1
        "PPPPPSPPSPPSPPPSPPPPSPPPPSPPPPSPPSPPPSPSPPPSPSPPPSPSPPPSPSPPPPSPPPPSPPPSPPSPPPPSPSPPPPSPSPPPPSPSPPPSPPSPPPPSPSPSS"                                | 919999993
        "PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS" | 18335643
    }

}
