package com.testds.leetcode.problems.simpleBankSystem

import spock.lang.Specification

class BankSpec extends Specification {

    def "Test Bank"() {
        given:
        Bank bank
        when:
        List<Boolean> actualResult = new ArrayList<>()
        for (int i = 0; i < operations.size(); i++) {
            String result = null
            switch (operations.get(i)) {
                case "Bank":
                    List<Long> list = input.get(i).get(0)
                    long[] ipArray = new long[list.size()]
                    for (int i1 = 0; i1 < list.size(); i1++) {
                        ipArray[i1] = list.get(i1)
                    }
                    bank = new Bank(ipArray)
                    break
                case "withdraw":
                    result = bank.withdraw(input.get(i).get(0), input.get(i).get(1))
                    break
                case "transfer":
                    result = bank.transfer(input.get(i).get(0), input.get(i).get(1), input.get(i).get(2))
                    break
                case "deposit":
                    result = bank.deposit(input.get(i).get(0), input.get(i).get(1))
            }
            actualResult.putAt(i, result == null ? null : Boolean.valueOf(result))
        }
        then:
        expectedResult == actualResult
        where:
        operations                                                          | input                                                                         | expectedResult
        ["Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"] | [[[10, 100, 20, 50, 30]], [3, 10], [5, 1, 20], [5, 20], [3, 4, 15], [10, 50]] | [null, true, true, true, false, false]
    }

}
