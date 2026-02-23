//https://leetcode.com/problems/min-cost-to-connect-all-points/
package com.testds.leetcode.problems.minCostToConnectAllPoints;

import java.util.*;

public class Solution {

    public int minCostConnectPoints(int[][] points) {
        int totalWeight = 0;
        int vertices = points.length;
        int[] ds = new int[vertices];
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        Edge edge;
        Map<Integer, List<Edge>> adj = new HashMap<>();
        for (int row = 0; row < vertices; row++) {
            for (int col = row + 1; col < vertices; col++) {
                edge = new Edge(row, col, points[row], points[col]);
                if (!adj.containsKey(row)) {
                    adj.put(row, new ArrayList<>());
                }
                if (!adj.containsKey(col)) {
                    adj.put(col, new ArrayList<>());
                }
                adj.get(row).add(edge);
                adj.get(col).add(edge);
                if (row == 0) {
                    pq.add(edge);
                }
            }
            ds[row] = row;
        }
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        while (visited.size() != vertices) {
            boolean connected = false;
            while (!connected && !pq.isEmpty()) {
                edge = pq.poll();
                if (getParent(edge.u, ds) != getParent(edge.v, ds)) {
                    union(edge.u, edge.v, ds);
                    if (visited.contains(edge.u)) {
                        pq.addAll(adj.get(edge.v));
                    } else {
                        pq.addAll(adj.get(edge.u));
                    }
                    visited.add(edge.v);
                    visited.add(edge.u);
                    totalWeight += edge.weight;
                    connected = true;
                }
            }
        }
        return totalWeight;
    }

    private int getParent(int u, int[] ds) {
        if (ds[u] != u) {
            int parent = getParent(ds[u], ds);
            ds[u] = parent;
        }
        return ds[u];
    }

    private void union(int u, int v, int[] ds) {
        ds[getParent(v, ds)] = getParent(u, ds);
    }

    private static class Edge {
        final int u;
        final int v;
        final int weight;

        Edge(int u, int v, int[] u1, int[] v1) {
            this.u = u;
            this.v = v;
            this.weight = Math.abs(u1[0] - v1[0]) + Math.abs(u1[1] - v1[1]);
        }
    }
}
