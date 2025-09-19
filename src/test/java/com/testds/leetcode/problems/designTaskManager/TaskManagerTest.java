package com.testds.leetcode.problems.designTaskManager;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TaskManagerTest {
    @Parameterized.Parameters(name = "{index}: ops={0}")
    public static Collection<Object[]> data() {
        List<List<Integer>> initial = Arrays.asList(
                Arrays.asList(1, 101, 10),
                Arrays.asList(2, 102, 20),
                Arrays.asList(3, 103, 15)
        );

        List<String> operations = Arrays.asList(
                "TaskManager", "add", "edit", "execTop", "rmv", "add", "execTop"
        );

        List<List<?>> values = Arrays.asList(
                Collections.<List<?>>singletonList(initial),    // TaskManager
                Arrays.asList(4, 104, 5),                 // add
                Arrays.asList(102, 8),                    // edit
                Collections.<Integer>emptyList(),               // execTop
                Collections.singletonList(101),           // rmv
                Arrays.asList(5, 105, 15),                // add
                Collections.<Integer>emptyList()                // execTop
        );

        List<Integer> expected = Arrays.asList(null, null, null, 3, null, null, 5);

        return Arrays.asList(new Object[][]{
                {operations, values, expected}
        });
    }

    @Parameterized.Parameter
    public List<String> operations;
    @Parameterized.Parameter(1)
    public List<List<?>> values;
    @Parameterized.Parameter(2)
    public List<Integer> expected;

    public static Test suite() {
        return new TestSuite(TaskManagerTest.class);
    }

    @org.junit.Test
    public void testScenario() {
        TaskManager taskManager = null;
        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < operations.size(); i++) {
            String op = operations.get(i);
            Integer result = null;

            switch (op) {
                case "TaskManager": {
                    List<?> v = values.get(i);
                    @SuppressWarnings("unchecked")
                    List<List<Integer>> init = (List<List<Integer>>) v.get(0);
                    taskManager = new TaskManager(init);
                    break;
                }
                case "add": {
                    List<?> v = values.get(i);
                    Assert.assertNotNull(taskManager);
                    taskManager.add(((Number) v.get(0)).intValue(),
                            ((Number) v.get(1)).intValue(),
                            ((Number) v.get(2)).intValue());
                    break;
                }
                case "edit": {
                    List<?> v = values.get(i);
                    Assert.assertNotNull(taskManager);
                    taskManager.edit(((Number) v.get(0)).intValue(),
                            ((Number) v.get(1)).intValue());
                    break;
                }
                case "rmv": {
                    List<?> v = values.get(i);
                    Assert.assertNotNull(taskManager);
                    taskManager.rmv(((Number) v.get(0)).intValue());
                    break;
                }
                case "execTop": {
                    Assert.assertNotNull(taskManager);
                    result = taskManager.execTop();
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unknown operation: " + op);
            }

            actual.add(result);
        }

        assertEquals(expected, actual);
    }
}
