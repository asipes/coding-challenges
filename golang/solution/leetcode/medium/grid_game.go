package medium

// https://leetcode.com/problems/grid-game 2017. Grid Game

func gridGame(grid [][]int) int64 {
	n := len(grid[0])

	top := make([]int64, n+1)
	bot := make([]int64, n+1)

	for i := 0; i < n; i++ {
		top[i+1] += top[i] + int64(grid[0][i])
		bot[i+1] += bot[i] + int64(grid[1][i])
	}

	res := int64(^uint64(0) >> 1)

	for i := 0; i < n; i++ {
		topSum := top[n] - top[i+1]
		botSum := bot[i]

		points := max(topSum, botSum)

		res = min(res, points)
	}

	return res
}

func GridGame(grid [][]int) int64 {
	return gridGame(grid)
}
