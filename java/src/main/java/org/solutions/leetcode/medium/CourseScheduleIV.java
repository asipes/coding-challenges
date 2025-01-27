package org.solutions.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class CourseScheduleIV {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        if (prerequisites.length == 0) {
            return Arrays.stream(queries)
                    .map(q -> false)
                    .collect(Collectors.toList());
        }

        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[0]).add(prerequisite[1]);
        }

        boolean[][] isReachable = new boolean[numCourses][numCourses];

        for (int i = 0; i < numCourses; i++) {
            dfs(i, i, graph, isReachable);
        }

        List<Boolean> result = new ArrayList<>();

        for (int[] query : queries) {
            result.add(isReachable[query[0]][query[1]]);
        }

        return result;
    }

    private void dfs(int start, int node, List<List<Integer>> graph, boolean[][] isReachable) {
        for (int neighbor : graph.get(node)) {
            if (!isReachable[start][neighbor]) {
                isReachable[start][neighbor] = true;
                dfs(start, neighbor, graph, isReachable);
            }
        }
    }

    // медленнее
    @SuppressWarnings("unused")
    private void computeTransitiveClosure(int numCourses, boolean[][] isReachable, List<List<Integer>> graph) {
        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : graph.get(i)) {
                isReachable[i][neighbor] = true;
            }
        }

        // Что такое транзитивное замыкание через алгоритм Флойда-Уоршалла
        // Проверяем можно ли пройти из i в j через k
        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    if (isReachable[i][k] && isReachable[k][j]) {
                        isReachable[i][j] = true;
                    }
                }
            }
        }
    }

    // На некоторых кейсах не работает хз почему
    @SuppressWarnings("unused")
    private void computeTransitiveClosureTopological(int numCourses, boolean[][] isReachable, List<List<Integer>> graph) {
        int[] inDegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : graph.get(i)) {
                inDegree[neighbor]++;
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> topological = new ArrayList<>();
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            topological.add(cur);

            for (int neighbor : graph.get(cur)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        for (int node : topological) {
            for (int neighbor : graph.get(node)) {
                isReachable[node][neighbor] = true;

                for (int k = 0; k < numCourses; k++) {
                    if (isReachable[neighbor][k]) {
                        isReachable[node][k] = true;
                    }
                }
            }
        }
    }
}
