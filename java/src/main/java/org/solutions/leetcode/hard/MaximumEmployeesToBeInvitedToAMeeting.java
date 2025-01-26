package org.solutions.leetcode.hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/maximum-employees-to-be-invited-to-a-meeting">2127. Maximum Employees to Be Invited to a Meeting</a>
 */

public class MaximumEmployeesToBeInvitedToAMeeting {
    private int[] favorite;
    private int n;
    private boolean[] visited;
    private boolean[] visitedNow;
    private int[] steps;
    private int maxLengthCycle = -1;
    private int maxChainLength = 0;

    public int maximumInvitations(int[] favorite) {
        n = favorite.length;
        this.favorite = favorite;

        maximumCycleLength();
        maximumChain();

        return Math.max(maxLengthCycle, maxChainLength);
    }

    private void maximumChain() {
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[favorite[i]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (freq[i] == 0) {
                queue.add(i);
            }
        }

        int[] chainLength = new int[n];

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            int favoriteNode = favorite[currentNode];

            chainLength[favoriteNode] = Math.max(chainLength[favoriteNode], chainLength[currentNode] + 1);
            freq[favoriteNode]--;
            if (freq[favoriteNode] == 0) {
                queue.add(favoriteNode);
            }
        }

        for (int i = 0; i < n; i++) {
            if (this.favorite[this.favorite[i]] == i && i < this.favorite[i]) {
                int chain1 = chainLength[i];
                int chain2 = chainLength[this.favorite[i]];

                maxChainLength += 2 + chain1 + chain2;
            }
        }
    }

    private void maximumCycleLength() {
        visited = new boolean[n];
        visitedNow = new boolean[n];
        steps = new int[n];
        Arrays.fill(steps, -1);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                goCycle(i, 0);
            }
        }
    }

    private void goCycle(int node, int step) {
        visited[node] = true;
        visitedNow[node] = true;
        steps[node] = step;
        int favoriteNode = favorite[node];

        if (!visited[favoriteNode]) {
            goCycle(favoriteNode, step + 1);
        } else if (visitedNow[favoriteNode]) {
            int currentCycleLength = step - steps[favoriteNode] + 1;
            maxLengthCycle = Math.max(maxLengthCycle, currentCycleLength);
        }

        visitedNow[node] = false;
    }
}
