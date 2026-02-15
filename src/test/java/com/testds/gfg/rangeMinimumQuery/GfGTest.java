package com.testds.gfg.rangeMinimumQuery;

import org.junit.Test;
import org.junit.Assert;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GfGTest {

    @Test
    public void shouldComputeRangeMinimumQueriesCorrectly() throws Exception {
        // Read input and expected files
        String inputPath = "src/test/resources/testds/gfg/rangeMinimumQuery/testInput";
        List<String> lines = Files.readAllLines(Paths.get(inputPath));
        String expectedPath = "src/test/resources/testds/gfg/rangeMinimumQuery/expectedOutput";
        List<String> expectedLines = Files.readAllLines(Paths.get(expectedPath));
        String expected = String.join("\n", expectedLines.stream().map(String::trim).collect(Collectors.toList()));

        // Parse input
        int lineIdx = 0;
        List<String> actualResults = new ArrayList<>();
        int T = Integer.parseInt(lines.get(lineIdx++).trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(lines.get(lineIdx++).trim());
            String[] arrStr = lines.get(lineIdx++).trim().split("\\s+");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            int Q = Integer.parseInt(lines.get(lineIdx++).trim());
            String[] queryStr = lines.get(lineIdx++).trim().split("\\s+");
            int[] st = GfG.constructST(arr, N);
            for (int q = 0; q < Q; q++) {
                int L = Integer.parseInt(queryStr[2 * q]);
                int R = Integer.parseInt(queryStr[2 * q + 1]);
                int minVal = GfG.RMQ(st, N, L, R);
                actualResults.add(Integer.toString(minVal));
            }
        }
        String actual = String.join(" ", actualResults);

        // Assert
        Assert.assertEquals(expected, actual);
    }
}