package medium

// https://leetcode.com/problems/find-eventual-safe-states 802. Find Eventual Safe States

func eventualSafeNodes(graph [][]int) []int {
	n := len(graph)
	state := make([]int, n)

	var res []int
	for i := 0; i < n; i++ {
		if dfs(i, state, graph) {
			res = append(res, i)
		}
	}

	return res
}

func dfs(node int, state []int, graph [][]int) bool {
	if state[node] == 0 {
		state[node] = 1
		for _, i := range graph[node] {
			if !dfs(i, state, graph) {
				return false
			}
		}
		state[node] = 2
	}
	return state[node] == 2
}

func EventualSafeNodes(graph [][]int) []int {
	return eventualSafeNodes(graph)
}
