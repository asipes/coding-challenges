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

        computeTransitiveClosureTopological(numCourses, isReachable, graph);

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];

            result.add(isReachable[query[0]][query[1]]);
        }

        return result;
    }

    private void computeTransitiveClosureTopological(int numCourses, boolean[][] isReachable, List<List<Integer>> graph) {
        int[] isDegree = new int[numCourses];
        List<Integer> topological = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : graph.get(i)) {
                isDegree[neighbor]++;
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (isDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            topological.add(cur);

            for (int neighbor : graph.get(cur)) {
                isDegree[neighbor]--;
                if (isDegree[neighbor] == 0) {
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
