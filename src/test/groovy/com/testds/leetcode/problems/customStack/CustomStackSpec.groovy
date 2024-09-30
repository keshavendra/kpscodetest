package com.testds.leetcode.problems.customStack

import spock.lang.Specification

class CustomStackSpec extends Specification {

    CustomStack customStack

    def "Test CustomStack"() {
        given:
        def results = []
        when:
        for (int i = 0; i < commands.size(); i++) {
            def command = commands[i]
            def res = null
            switch (command) {
                case "CustomStack":
                    customStack = new CustomStack(input[i][0] as int)
                    break
                case "push":
                    customStack.push(input[i][0] as int)
                    break
                case "pop":
                    res = customStack.pop()
                    break
                case "increment":
                    res = customStack.increment(input[i][0], input[i][1])
            }
            results.putAt(i, res)
        }
        then:
        expectedResult == results
        where:
        commands                                                                                                             | input                                                                  | expectedResult
        ["CustomStack", "push", "push", "pop", "push", "push", "push", "increment", "increment", "pop", "pop", "pop", "pop"] | [[3], [1], [2], [], [2], [3], [4], [5, 100], [2, 100], [], [], [], []] | [null, null, null, 2, null, null, null, null, null, 103, 202, 201, -1]

    }

}
