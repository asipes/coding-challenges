package medium

// https://leetcode.com/problems/count-servers-that-communicate 1267. Count Servers that Communicate

// 8ms
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

// 3ms
func countServersV2(grid [][]int) int {
	n := len(grid)
	m := len(grid[0])
	rows := make([]int, n)
	cols := make([]int, m)

	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 {
				rows[i]++
				cols[j]++
			}
		}
	}

	count := 0

	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			if grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1) {
				count++
			}
		}
	}

	return count
}

func CountServers(grid [][]int) int {
	return countServers(grid)
}

func CountServersV2(grid [][]int) int {
	return countServersV2(grid)
}
