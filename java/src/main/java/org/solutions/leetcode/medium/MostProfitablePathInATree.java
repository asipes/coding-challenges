package org.solutions.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostProfitablePathInATree {

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (var edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int[] bobVisited = new int[n];
        Arrays.fill(bobVisited, -1);

        dfsBob(bob, -1, 0, graph, bobVisited);

        return dfsAlice(0, -1, 0, graph, bobVisited, amount);
    }

    private int dfsAlice(int node, int parent, int step, List<List<Integer>> graph, int[] bobVisited, int[] amount) {
        boolean isLeaf = true;
        int maxProfit = Integer.MIN_VALUE;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;
            isLeaf = false;
            maxProfit = Math.max(maxProfit, dfsAlice(neighbor, node, step + 1, graph, bobVisited, amount));
        }

        int profit = 0;

        if (bobVisited[node] == -1 || step < bobVisited[node]) {
            profit = amount[node];
        } else if (step == bobVisited[node]) {
            profit = amount[node] / 2;
        }

        return profit + (isLeaf ? 0 : maxProfit);
    }

    private void dfsBob(int node, int parent, int step, List<List<Integer>> graph, int[] bobVisited) {
        bobVisited[node] = step;

        if (node == 0) return;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;
            dfsBob(neighbor, node, step + 1, graph, bobVisited);
            if (bobVisited[0] != -1) return;
        }

        bobVisited[node] = -1;
    }
}
