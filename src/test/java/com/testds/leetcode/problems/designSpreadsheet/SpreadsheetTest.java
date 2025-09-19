package com.testds.leetcode.problems.designSpreadsheet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class SpreadsheetTest extends TestCase {

    private Spreadsheet spreadsheet;

    @Parameterized.Parameter
    public List<String> operations;

    @Parameterized.Parameter(1)
    public List<Object> values;

    @Parameterized.Parameter(2)
    public List<Integer> expectedResults;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<String> operationsList = Arrays.asList(
                "Spreadsheet", "getValue", "setCell", "getValue", "setCell", "getValue", "resetCell", "getValue"
        );

        List<List<?>> valuesList = Arrays.asList(
                Collections.singletonList(3),
                Collections.singletonList("=5+7"),
                Arrays.asList("A1", 10),
                Collections.singletonList("=A1+6"),
                Arrays.asList("B2", 15),
                Collections.singletonList("=A1+B2"),
                Collections.singletonList("A1"),
                Collections.singletonList("=A1+B2")
        );

        List<Integer> expectedResultsList = Arrays.asList(null, 12, null, 16, null, 25, null, 15);
        return Arrays.asList(new Object[][]{
                {operationsList, valuesList, expectedResultsList}
        });
    }

    public static Test suite() {
        return new TestSuite(SpreadsheetTest.class);
    }

    @org.junit.Test
    public void testSpreadsheet() {
        List<Integer> actualResults = new ArrayList<>();
        for (int index = 0; index < operations.size(); index++) {
            String operation = operations.get(index);
            Integer result = null;
            switch (operation) {
                case "Spreadsheet":
                    List<?> v = Collections.singletonList(values.get(index));
                    @SuppressWarnings("unchecked")
                    int n = ((List<Integer>) v.get(0)).get(0);
                    spreadsheet = new Spreadsheet(n);
                    break;
                case "getValue":
                    @SuppressWarnings("unchecked")
                    String cell = ((List<String>) values.get(index)).get(0);
                    result = spreadsheet.getValue(cell);
                    break;
                case "setCell":
                    @SuppressWarnings("unchecked")
                    String cell1 = (String) ((List<Object>) values.get(index)).get(0);
                    @SuppressWarnings("unchecked")
                    int value = (int) ((List<Object>) values.get(index)).get(1);
                    spreadsheet.setCell(cell1, value);
                    break;
                case "resetCell":
                    @SuppressWarnings("unchecked")
                    String cell2 = ((List<String>) values.get(index)).get(0);
                    spreadsheet.resetCell(cell2);
                    break;
            }
            actualResults.add(result);
        }
        assertEquals(expectedResults, actualResults);
    }

}
