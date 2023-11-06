package com.testds.leetcode.problems.seatReservationManager

import spock.lang.Specification

class SeatManagerSpec extends Specification {

    def "Test SeatManager"() {
        when:
        SeatManager seatManager
        def actualResult = []
        for (int i = 0; i < opeartionsList.size(); i++) {
            def operation = opeartionsList.get(i)
            def value = operationValues.get(i)
            def result = null
            switch (operation) {
                case "SeatManager":
                    seatManager = new SeatManager(value.get(0))
                    break
                case "reserve":
                    result = seatManager.reserve()
                    break
                case "unreserve":
                    result = seatManager.unreserve(value.get(0))
            }
            actualResult.add(result)
        }
        then:
        expectedResult == actualResult
        where:
        opeartionsList                                                                                              | operationValues                         | expectedResult
        ["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"] | [[5], [], [], [2], [], [], [], [], [5]] | [null, 1, 2, null, 2, 3, 4, 5, null]
    }

}
