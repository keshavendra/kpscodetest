package com.testds.gfg.rangeMinimumQuery

import spock.lang.Specification
import spock.lang.Unroll

import java.nio.file.Files
import java.nio.file.Paths

class GfGSpec extends Specification {

    @Unroll
    def "should compute range minimum queries correctly"() {
        given: "the test input and expected output files"
        def inputPath = Paths.get("src/test/resources/testds/gfg/rangeMinimumQuery/testInput")
        def lines = Files.readAllLines(inputPath)
        def expectedPath = Paths.get("src/test/resources/testds/gfg/rangeMinimumQuery/expectedOutput")
        def expectedLines = Files.readAllLines(expectedPath)
        def expected = expectedLines.collect { it.trim() }.join("\n")

        def lineIdx = 0
        def actualResults = []

        when: "parsing input and executing queries"
        int T = Integer.parseInt(lines[lineIdx++].trim())
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(lines[lineIdx++].trim())
            def arrStr = lines[lineIdx++].trim().split(/\s+/)
            int[] arr = new int[N]
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(arrStr[i])
            }
            int Q = Integer.parseInt(lines[lineIdx++].trim())
            def queryStr = lines[lineIdx++].trim().split(/\s+/)
            int[] st = GfG.constructST(arr, N)
            for (int q = 0; q < Q; q++) {
                int L = Integer.parseInt(queryStr[2 * q])
                int R = Integer.parseInt(queryStr[2 * q + 1])
                int minVal = GfG.RMQ(st, N, L, R)
                actualResults.add(minVal.toString())
            }
        }
        def actual = actualResults.join(" ")

        then: "actual output matches expected"
        actual == expected
    }
}