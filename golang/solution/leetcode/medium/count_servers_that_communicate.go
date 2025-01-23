package medium

// https://leetcode.com/problems/count-servers-that-communicate 1267. Count Servers that Communicate

func countServers(grid [][]int) int {
	rows := len(grid)
	cols := len(grid[0])
	var heap [][]int
	visited := make([][]bool, rows)
	for i := range visited {
		visited[i] = make([]bool, cols)
	}

	for i := 0; i < rows; i++ {
		for j := 0; j < cols; j++ {
			if grid[i][j] == 1 {
				heap = append(heap, []int{i, j})
			}
		}
	}

	count := 0

	for _, cell := range heap {
		i, j := cell[0]-1, cell[1]

		for ; i >= 0; i-- {
			if grid[i][j] == 1 && !visited[i][j] {
				count++
				visited[i][j] = true
			}
		}

		i, j = cell[0], cell[1]+1

		for ; j < cols; j++ {
			if grid[i][j] == 1 && !visited[i][j] {
				count++
				visited[i][j] = true
			}
		}

		i, j = cell[0]+1, cell[1]

		for ; i < rows; i++ {
			if grid[i][j] == 1 && !visited[i][j] {
				count++
				visited[i][j] = true
			}
		}

		i, j = cell[0], cell[1]-1

		for ; j >= 0; j-- {
			if grid[i][j] == 1 && !visited[i][j] {
				count++
				visited[i][j] = true
			}
		}
	}

	return count
}

func CountServers(grid [][]int) int {
	return countServers(grid)
}
