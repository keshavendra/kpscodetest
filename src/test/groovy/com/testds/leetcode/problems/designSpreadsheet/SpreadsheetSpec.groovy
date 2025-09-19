package com.testds.leetcode.problems.designSpreadsheet


import spock.lang.Specification

class SpreadsheetSpec extends Specification {

    def "Test DesignSpreadsheet"() {

        given:
        Spreadsheet spreadsheet = null
        def actualResult = []
        when:
        for (int i = 0; i < opeartions.size(); i++) {
            def operation = opeartions.get(i)
            Integer result = null
            switch (operation) {
                case "Spreadsheet":
                    spreadsheet = new Spreadsheet(values.get(i).get(0) as int)
                    break
                case "getValue":
                    result = Objects.requireNonNull(spreadsheet).getValue(values.get(i).get(0) as String)
                    break
                case "setCell":
                    Objects.requireNonNull(spreadsheet).setCell(values.get(i).get(0) as String, values.get(i).get(1) as int)
                    break
                case "resetCell":
                    Objects.requireNonNull(spreadsheet).resetCell(values.get(i).get(0) as String)
            }
            actualResult.add(result)
        }
        then:
        expectedResult == actualResult
        where:
        opeartions                                                                                         | values                                                                             | expectedResult
        ["Spreadsheet", "getValue", "setCell", "getValue", "setCell", "getValue", "resetCell", "getValue"] | [[3], ["=5+7"], ["A1", 10], ["=A1+6"], ["B2", 15], ["=A1+B2"], ["A1"], ["=A1+B2"]] | [null, 12, null, 16, null, 25, null, 15]
    }

}
