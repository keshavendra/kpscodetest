package com.testds.leetcode.problems.seatReservationManager;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SeatManagerTest extends TestCase {

    @Parameterized.Parameter
    public List<String> operationsList;

    @Parameterized.Parameter(1)
    public List<Integer> operationValues;

    @Parameterized.Parameter(2)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList("SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"),
                        Arrays.asList(5, null, null, 2, null, null, null, null, 5),
                        Arrays.asList(null, 1, 2, null, 2, 3, 4, 5, null)}
        });
    }

    public static Test suite() {
        return new TestSuite(SeatManagerTest.class);
    }

    @org.junit.Test
    public void testSeatManager() {
        List<Integer> actualResult = new ArrayList<>();
        SeatManager seatManager = null;
        for (int i = 0; i < operationsList.size(); i++) {
            String operation = operationsList.get(i);
            Integer operationValue = operationValues.get(i);
            Integer result = null;
            switch (operation) {
                case "SeatManager":
                    seatManager = new SeatManager(operationValue);
                    break;
                case "reserve":
                    assert seatManager != null;
                    result = seatManager.reserve();
                    break;
                case "unreserve":
                    assert seatManager != null;
                    seatManager.unreserve(operationValue);
            }
            actualResult.add(result);
        }
        assert actualResult.size() == expectedResult.size();
        assert expectedResult.containsAll(actualResult);
        assert actualResult.containsAll(expectedResult);
    }
}
