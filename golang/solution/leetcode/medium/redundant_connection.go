package medium

import "golang/model"

// https://leetcode.com/problems/redundant-connection 684. Redundant Connection

func findRedundantConnection(edges [][]int) []int {
	n := 0
	for _, edge := range edges {
		n = max(n, max(edge[0], edge[1]))
	}

	dsu := model.NewDSU(1, n+1)
	var res [][]int

	for _, edge := range edges {
		x, y := edge[0], edge[1]
		if dsu.Find(x) == dsu.Find(y) {
			res = append(res, edge)
		} else {
			dsu.Union(x, y)
		}
	}

	return res[len(res)-1]
}

func FindRedundantConnection(edges [][]int) []int {
	return findRedundantConnection(edges)
}
