package medium

// https://leetcode.com/problems/maximum-number-of-fish-in-a-grid 2658. Maximum Number of Fish in a Grid

func findMaxFish(grid [][]int) int {
	n := len(grid)
	m := len(grid[0])
	visited := make([][]bool, len(grid))

	for i := 0; i < n; i++ {
		visited[i] = make([]bool, m)
	}

	maxFish := 0

	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] > 0 && !visited[i][j] {
				maxFish = max(maxFish, dfsMaxFish(i, j, grid, visited))
			}
		}
	}

	return maxFish
}

func dfsMaxFish(row int, col int, grid [][]int, visited [][]bool) int {
	visited[row][col] = true
	currentValue := grid[row][col]

	if row > 0 && grid[row-1][col] > 0 && !visited[row-1][col] {
		currentValue += dfsMaxFish(row-1, col, grid, visited)
	}
	if col < len(grid[0])-1 && grid[row][col+1] > 0 && !visited[row][col+1] {
		currentValue += dfsMaxFish(row, col+1, grid, visited)
	}
	if row < len(grid)-1 && grid[row+1][col] > 0 && !visited[row+1][col] {
		currentValue += dfsMaxFish(row+1, col, grid, visited)
	}
	if col > 0 && grid[row][col-1] > 0 && !visited[row][col-1] {
		currentValue += dfsMaxFish(row, col-1, grid, visited)
	}

	return currentValue
}

func FindMaxFish(grid [][]int) int {
	return findMaxFish(grid)
}
