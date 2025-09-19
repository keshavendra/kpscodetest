//https://leetcode.com/problems/design-task-manager/
package com.testds.leetcode.problems.designTaskManager;

import java.util.*;

public class TaskManager {

    private final TreeSet<List<Integer>> tasks;
    private final Map<Integer, List<Integer>> tasksMap;

    //[userId, taskId, priority]
    private static final Comparator<List<Integer>> COMPARATOR = (o1, o2) -> {
        if (!Objects.equals(o1.get(2), o2.get(2)))
            return o2.get(2) - o1.get(2);
        return o2.get(1) - o1.get(1);
    };

    public TaskManager(List<List<Integer>> tasks) {
        this.tasks = new TreeSet<>(COMPARATOR);
        this.tasks.addAll(tasks);
        this.tasksMap = new HashMap<>();
        tasks.forEach(list -> this.tasksMap.put(list.get(1), list));
    }

    public void add(int userId, int taskId, int priority) {
        List<Integer> list = new ArrayList<>();
        list.add(userId);
        list.add(taskId);
        list.add(priority);
        tasksMap.put(taskId, list);
        tasks.add(list);
    }

    public void edit(int taskId, int newPriority) {
        List<Integer> list = tasksMap.get(taskId);
        if (list.get(2) != newPriority) {
            tasks.remove(list);
            list.set(2, newPriority);
            tasks.add(list);
        }
    }

    public void rmv(int taskId) {
        tasks.remove(tasksMap.remove(taskId));
    }

    public int execTop() {
        if (tasks.isEmpty()) {
            return -1;
        }
        List<Integer> list = tasks.first();
        tasksMap.remove(list.get(1));
        tasks.remove(list);
        return list.get(0);
    }
}
