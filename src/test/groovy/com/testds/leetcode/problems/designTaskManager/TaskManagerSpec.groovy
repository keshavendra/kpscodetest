package com.testds.leetcode.problems.designTaskManager


import com.testds.leetcode.problems.replaceNonCoprimes.Solution
import spock.lang.Specification

class TaskManagerSpec extends Specification {

    def "Test TaskManager"() {
        given:
        TaskManager taskManager = null
        def actualResult = []
        when:
        for (int i = 0; i < opeartions.size(); i++) {
            def operation = opeartions.get(i)
            Integer result = null
            switch (operation) {
                case "TaskManager":
                    taskManager = new TaskManager(values.get(i).get(0) as List<List<Integer>>)
                    break
                case "add":
                    Objects.requireNonNull(taskManager).add(values.get(i).get(0) as int, values.get(i).get(1) as int, values.get(i).get(2) as int)
                    break
                case "edit":
                    Objects.requireNonNull(taskManager).edit(values.get(i).get(0) as int, values.get(i).get(1) as int)
                    break
                case "rmv":
                    Objects.requireNonNull(taskManager).rmv(values.get(i).get(0) as int)
                    break
                case "execTop":
                    result = Objects.requireNonNull(taskManager).execTop()
            }
            actualResult.add(result)
        }
        then:
        expectedResult == actualResult
        where:
        opeartions                                                         | values                                                                                             | expectedResult
        ["TaskManager", "add", "edit", "execTop", "rmv", "add", "execTop"] | [[[[1, 101, 10], [2, 102, 20], [3, 103, 15]]], [4, 104, 5], [102, 8], [], [101], [5, 105, 15], []] | [null, null, null, 3, null, null, 5]
    }

}
